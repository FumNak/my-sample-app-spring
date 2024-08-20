FROM docker.io/eclipse-temurin:17-jre as builder
WORKDIR application
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM docker.io/eclipse-temurin:17-jre
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
#COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
COPY --from=builder ./application/dependencies/BOOT-INF/lib/opentelemetry-javaagent-1.33.5.jar /opt/otel/opentelemetry-javaagent.jar 
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher","-javaagent:/opt/otel/opentelemetry-javaagent.jar"]
