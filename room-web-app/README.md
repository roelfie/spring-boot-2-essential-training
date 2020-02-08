# LinkedIn: Spring Boot 2 Essential Training (room-web-app)

This is the **room-web-app**, a Spring Boot web application based on the starters web, actuator, thymeleaf, devtools, data-jpa and security.


## Section 2.2: Configure server to use TLS/SSL

Generate a self-signed certificate in a local key store:
```shell script
keytool -genkey -keyalg RSA -alias linkedin -keystore keystore.jks -storepass password -validity 4000 -keysize 2048
```

A `server.ssl` section has been added to `application.yml`.
Uncomment it to enable SSL/TLS, and the web application will be available under (using the HTTPie tool):
```shell script
http --verify=no https://localhost:8080/api/rooms  
```

See also the [Spring Boot server properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#server-properties).

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

## Section 2.5: Devtools

The [`spring-boot-devtools`](https://docs.spring.io/spring-boot/docs/1.3.x-SNAPSHOT/reference/html/using-boot-devtools.html) allow for automatically picking up changes on the classpath while the application is running (except for changes in class files). 
To make this work in IntelliJ
- open the Registry (⌘-O / Actions / Registry...) and select `compiler.automake.allow.when.app.running`
- in the Preferences, under Compiler, select `Build project automatically`

#### Live Reload web pages

When you start the server you will see `LiveReload server is running on port 35729`. This will allow the web browser (with the appropriate plugin) 
to automatically refresh the web page when a change on the server is detected. 

In Chrome, use the Live Reload extension. You can activate it by clicking on the 'reload' icon :arrows_clockwise: in the browser toolbar.

## Section 4.2: Spring Boot Data

If the following scripts exist on the classpath (`src/main/resources`) Spring Boot will use them to prime the database on startup:
```
schema.sql
data.sql
``` 
