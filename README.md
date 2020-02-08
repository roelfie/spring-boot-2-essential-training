# LinkedIn: Spring Boot 2 Essential Training

Playground for the Spring Boot 2 Essential Training from LinkedIn Learning

## Section 1.2: Spring Initializr

The submodules of this project are all Spring Boot applications created with the Spring [Initializr](https://start.spring.io/).
The following starters were used:

* [room-web-app](room-web-app): web, actuator, thymeleaf, devtools, data-jpa, security
* [room-command-line-runner](room-command-line-runner): json, amqp
* [room-consumer](room-consumer): json, amqp

The embedded Tomcat (included by the web starter) runs HTTP / port 8080 by default.

#### Ways to start a Spring Boot jar
During development you will usually start the application (annotated with @SpringBootApplication) in IntelliJ IDEA.

Other ways to start an executable Spring Boot jar are:
- `java -jar room-web-app/target/room-web-app-1.0.0.jar`
- shell script (makes it easier to add environment variables and properties)
- `systemd` / `init.d` (on *nix systems) to let the server control when services start/stop
- cloud ecosystems (e.g. Pivotal Cloud Foundry)
  - `cf push` pushes a compiled JAR into cloud foundry and automatically runs it 

## Section 1.5: Use profiles to specify server port

Server ports are configured in `application.yml`. Specify the active profile like this:
```shell script
java -jar -Dspring.profiles.active=test target/room-web-app-1.0.0.jar
```
and the web application can be found at: http://localhost:9000

## References

- [HTTPie](https://httpie.org/)
- [YAML](https://docs.ansible.com/ansible/latest/reference_appendices/YAMLSyntax.html)
- Some [notes](https://github.com/roelfie/spring-with-spring-boot/blob/master/DOCKER.md) on Docker
