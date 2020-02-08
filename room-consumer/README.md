# LinkedIn: Spring Boot 2 Essential Training (room-consumer)

This is the **room-consumer**, a Spring Boot (AMQP) message consumer based on the starters json and amqp.

## Section 4.6: AMQP messaging with RabbitMQ

This project contains a Spring Boot message consumer. It assumes that you have the RabbitMQ message broker running on 
your machine. 

#### Installing RabbitMQ

I'm using Docker Desktop for Mac. You can find a Docker image for RabbitMQ on [Docker Hub](https://hub.docker.com/_/rabbitmq).

Do the following to download the image and get it up and running:

```shell script
docker pull rabbitmq
docker run -d --hostname rabbit-boot2-essentials --name rabbit-boot2-essentials -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```

RabbitMQ is now available at:
- Broker: localhost:5672
- Management console: http://localhost:15672

If you start the spring-boot-consumer you will see a new connection appear in the RabbitMQ management console...

