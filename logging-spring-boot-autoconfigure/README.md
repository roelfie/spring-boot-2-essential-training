# logging-spring-boot-autoconfigure

The **logging-spring-boot-autoconfigure** is a Spring Boot autoconfiguration module 
for the logging-timers library (the `@Timed` annotation).

The configuration is in `KerstholtLoggingAutoconfigure.java`, and Spring is told 
to use this autoconfiguration in `META-INF/spring.factories`.

#### Usage

To enable the `@Timed` annotation in your application, add the following dependency
to your project:

```xml
<dependency>
    <groupId>top.kerstholt.springboot2</groupId>
    <artifactId>logging-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```