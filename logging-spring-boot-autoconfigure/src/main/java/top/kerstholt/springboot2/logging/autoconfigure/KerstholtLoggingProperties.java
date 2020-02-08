package top.kerstholt.springboot2.logging.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("kerstholt.logging")
public class KerstholtLoggingProperties {

    // Property 'kerstholt.logging.loggerName' with default value 'kerstholtAuditLogger'
    private String loggerName = "kerstholtAuditLogger";

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }
}
