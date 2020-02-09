# actuator-demo

The **actuator-demo** is a Spring Boot web application that includes an actuator.

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

The actuator is secured by the following user and exposes all enpoints (`application.properties`):
```properties
spring.security.user.name=user
spring.security.user.password=password
spring.security.user.roles=["USER", "ENDPOINT_ADMIN"]

management.endpoints.web.exposure.include=*
```

#### Endpoints

* http://localhost:8080/api/presidents
* http://localhost:8080/actuator

See the different git commits to see how to configure the following actuator endpoints:
* http://localhost:8080/actuator/info
* http://localhost:8080/actuator/health
* http://localhost:8080/actuator/metrics/
* http://localhost:8080/actuator/metrics/http.server.requests

The Micrometer Counters and timers defined in ApiController.java add the following endpoints:
* http://localhost:8080/actuator/metrics/api.greetings
* http://localhost:8080/actuator/metrics/api.getAllPresidents

And some more actuator endpoints:
* http://localhost:8080/actuator/beans
* http://localhost:8080/actuator/conditions
* http://localhost:8080/actuator/configprops
* http://localhost:8080/actuator/env
* http://localhost:8080/actuator/loggers
* http://localhost:8080/actuator/heapdump
* http://localhost:8080/actuator/threaddump
* http://localhost:8080/actuator/httptrace
* http://localhost:8080/actuator/mappings
