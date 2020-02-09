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

