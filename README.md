# LinkedIn: Spring Boot 2 Essential Training

Playground for the Spring Boot 2 Essential Training from LinkedIn Learning

## Section 1.2: Spring Initializr

This Spring Boot application was created by the Spring [Initializr](https://start.spring.io/) and contains the starters Web, Actuator & Thymeleaf.

#### Ways to start a Spring Boot jar
During development you will usually start the application in IntelliJ IDEA (SpringBoot*Application.java).

In production you can:
- `java -jar ...`
- shell script (makes it easier to add environment variables and properties)
- `systemd` / `init.d` (on *nix systems) to let the server control when services start/stop
- cloud ecosystems (e.g. Pivotal Cloud Foundry)
  - `cf push` pushes a compiled JAR into cloud foundry and automatically runs it 

The embedded Tomcat runs HTTP / port 8080 by default.
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

## Section 2.4: RESTful services with Spring Web MVC

Spring MVC supports JSON natively. 
All you need to create a RESTful service is a `@RestController` with a `@RequestMapping("/api/rooms")`.
This is all based on the same Spring Web MVC framework used to create web applications.

```shell script
http http://localhost:8080/api/rooms                          // HTTP 200 (JSON)
http http://localhost:8080/api/rooms Accept:application/xml   // HTTP 406 (Not Acceptable)
```  

To fix the HTTP 406 and get XML out of the web service, add an XML marshaller dependency, for instance:
```xml
<dependency>
	<groupId>com.fasterxml.jackson.dataformat</groupId>
	<artifactId>jackson-dataformat-xml</artifactId>
</dependency>
```

## Section 2.5

The [`spring-boot-devtools`](https://docs.spring.io/spring-boot/docs/1.3.x-SNAPSHOT/reference/html/using-boot-devtools.html) allow for automatically picking up changes on the classpath while the application is running (except for changes in class files). 
To make this work in IntelliJ
- open the Registry (⌘-O / Actions / Registry...) and select `compiler.automake.allow.when.app.running`
- in the Preferences, under Compiler, select `Build project automatically`

#### Live Reload web pages

When you start the server you will see `LiveReload server is running on port 35729`. This will allow the web browser (with the appropriate plugin) 
to automatically refresh the web page when a change on the server is detected. 

In Chrome, use the Live Reload extension. You can activate it by clicking on the 'reload' icon :arrows_clockwise: in the browser toolbar.

## References

- [HTTPie](https://httpie.org/)
- [YAML](https://docs.ansible.com/ansible/latest/reference_appendices/YAMLSyntax.html)

