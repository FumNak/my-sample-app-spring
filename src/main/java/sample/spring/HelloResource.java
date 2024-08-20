package sample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
//import io.opentelemetry.api.logs.Logger;

import sample.domain.Person;

@RestController
@RequestMapping("/api")
public class HelloResource {

    // private final Logger logger;

    // @Autowired
    // public HelloResource(Logger logger) {
    // this.logger = logger;
    // }

    @Value("${config.val}")
    private String configValue;

    @GetMapping("/hello")
    public String hello() {

        // Tracer tracer = GlobalOpenTelemetry.getTracer("example-tracer");
        // Span span = tracer.spanBuilder("example-span").startSpan();
        // span.setAllAttributes("http.route", "http");

        try {

            Person person = new Person();
            person.setName("MyName");
            person.setAge(38);

            // logger.logRecordBuilder()
            // .setBody("This is a log message")
            // .setSeverity(io.opentelemetry.api.logs.Severity.INFO)
            // .emit();

            return "Hello! name:" + person.getName() + "age:" + person.getAge();
        } finally {
            // span.end();
        }

    }
}
