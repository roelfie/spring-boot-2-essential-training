package top.kerstholt.springboot2.logging.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.kerstholt.springboot2.aop.LoggableAspect;

/**
 * This configuration will be effective if LoggableAspect (service-logging.jar)
 * is on the classpath.
 */
@Configuration
@ConditionalOnClass(LoggableAspect.class)
@EnableConfigurationProperties(KerstholtLoggingProperties.class)
public class KerstholtLoggingAutoconfigure {

    @Autowired
    private KerstholtLoggingProperties properties;

    @Bean
    public LoggableAspect loggableAspect() {
        return new LoggableAspect(properties.getLoggerName());
    }
}
