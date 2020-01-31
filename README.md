# LinkedIn: Spring Boot 2 Essential Training

Playground for the Spring Boot 2 Essential Training from LinkedIn Learning

## Web application and web service combined

The embedded Tomcat runs HTTP / port 8080 by default. Start the application in IntelliJ IDEA (SpringBoot2Application.java) or from a terminal:

```shell script
cd <project-root>
mvn clean package
java -jar target/spring-boot-essentials-1.0.0.jar
```

- Web application: http://localhost:8080
- REST endpoint: http://localhost:8080/api/greetings

## Using profiles to configure embedded Tomcat

Server ports are configured in `application.yml`. Specify the active profile like this:

```shell script
java -jar -Dspring.profiles.active=test target/spring-boot-essentials-1.0.0.jar
```

and the web application can be found at: http://localhost:9000

