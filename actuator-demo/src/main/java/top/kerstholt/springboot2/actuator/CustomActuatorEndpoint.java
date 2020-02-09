package top.kerstholt.springboot2.actuator;

import lombok.Data;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Endpoint(id="custom-endpoint")
public class CustomActuatorEndpoint {

    @ReadOperation
    public CustomEndpointInfo getSystemDetails(){
        CustomEndpointInfo details = new CustomEndpointInfo();
        details.systemTime= LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return details;
    }

    @Data
    public class CustomEndpointInfo {
        private String systemTime;
    }
}
