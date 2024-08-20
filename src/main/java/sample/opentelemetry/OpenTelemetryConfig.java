package sample.opentelemetry;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import io.opentelemetry.api.GlobalOpenTelemetry;
// import io.opentelemetry.api.logs.Logger;
// import io.opentelemetry.api.logs.LoggerProvider;
// import io.opentelemetry.api.trace.Tracer;
// import io.opentelemetry.sdk.OpenTelemetrySdk;
// import io.opentelemetry.sdk.logs.SdkLoggerProvider;
// import io.opentelemetry.sdk.logs.export.LogRecordExporter;
// import io.opentelemetry.sdk.logs.export.SimpleLogRecordProcessor;
// import io.opentelemetry.sdk.resources.Resource;

//@Configuration
public class OpenTelemetryConfig {

    // @Bean
    // public Tracer tracer() {
    // //
    // return GlobalOpenTelemetry.getTracer("example-tracer");
    // }

    // @Bean
    // public LoggerProvider loggerProvider() {
    // LogRecordExporter logExporter = new CustomLogExporter();
    // SdkLoggerProvider sdkLoggerProvider =
    // SdkLoggerProvider.builder().setResource(Resource.getDefault())
    // .addLogRecordProcessor(SimpleLogRecordProcessor.create(logExporter)).build();
    // // GlobalLoggerProvider.set(sdkLoggerProvider);
    // OpenTelemetrySdk.builder()
    // .setLoggerProvider(sdkLoggerProvider)
    // .buildAndRegisterGlobal();
    // return sdkLoggerProvider;
    // }

    // @Bean
    // public Logger logger() {

    // LogRecordExporter logExporter = new CustomLogExporter();
    // SdkLoggerProvider sdkLoggerProvider =
    // SdkLoggerProvider.builder().setResource(Resource.getDefault())
    // .addLogRecordProcessor(SimpleLogRecordProcessor.create(logExporter)).build();
    // // GlobalLoggerProvider.set(sdkLoggerProvider);
    // // OpenTelemetrySdk.builder()
    // // .setLoggerProvider(sdkLoggerProvider)
    // // .buildAndRegisterGlobal();
    // //
    // return sdkLoggerProvider.get("custom-logger");
    // }
}