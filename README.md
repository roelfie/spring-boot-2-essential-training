# LinkedIn: Spring Boot 2 Essential Training

Playground for the Spring Boot 2 Essential Training from LinkedIn Learning

## Section 1.2: Spring Initializr

This Spring Boot Application was created by the Spring [Initializr](https://start.spring.io/) and contains the starters Web, Actuator & Thymeleaf.

The embedded Tomcat runs HTTP / port 8080 by default. Start the application in IntelliJ IDEA (SpringBoot2Application.java) or from a terminal:
```shell script
cd <project-root>
mvn clean package
java -jar target/spring-boot-essentials-1.0.0.jar
```

- Web application: http://localhost:8080
- REST endpoint: http://localhost:8080/api/greetings

## Section 1.5: Use profiles to specify server port

Server ports are configured in `application.yml`. Specify the active profile like this:
```shell script
java -jar -Dspring.profiles.active=test target/spring-boot-essentials-1.0.0.jar
```

and the web application can be found at: http://localhost:9000

## Section 2.2: Configure server to use TLS/SSL

Generate a self-signed certificate in a local key store:
```shell script
keytool -genkey -keyalg RSA -alias linkedin -keystore keystore.jks -storepass password -validity 4000 -keysize 2048
```

`application.yml` has been updated to use TLS/SSL. See also the [Spring Boot server properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#server-properties).

Start the server without a profile, and the web application is now available under (with HTTPie):
```shell script
http --verify=no https://localhost:8080/api/greeting  
```


## References

- [HTTPie](https://httpie.org/)
- [YAML](https://docs.ansible.com/ansible/latest/reference_appendices/YAMLSyntax.html)

