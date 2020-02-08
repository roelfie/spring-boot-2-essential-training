# LinkedIn: Spring Boot 2 Essential Training (room-command-line-runner)

This is the **room-command-line-runner**, a Spring Boot command line runner based on the starters json and amqp.

## Section 3.1: Command-Line runner interface

Command Line Runners (CLRs) can be used to perform a single task, just once.
The task is defined as a bean (@Component) that implements the `CommandLineRunner` or the `ApplicationRunner` interface
(a single `.run()` method). The task is executed (just once) as soon as the ApplicationContext has started.

You can put CLRs in a standalone Spring Boot application (without any starters), or as part of an existing 
Spring Boot web application, messaging application, etc.

If you have more than one Runner in your application (or even ApplicationContext), you can use `@Order` to define the order in which they should be executed.

Typical use cases: 
* standalone CLRs
  - any standalone task that you want to automate using the Spring Framework.
* CLRs in existing Spring Boot applications
  - Verify data in a database at application startup
  - Priming an asynchronous message queue
  - Any other admin-type task ...

