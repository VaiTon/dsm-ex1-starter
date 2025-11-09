# Sistemi Distribuiti - Exercise 1 - Starter Project

## Descrizione

Deploy of a web application using Java EE (Jakarta 11) technology via WildFly (38.0.0.Final) and Maven (3.9.11).

## Requirements

- Java 25 or higher

## Development

It is possible to use any IDE that supports Java EE development, such as IntelliJ IDEA, Eclipse, or even a simple text editor combined with command-line tools.

Having maven installed locally is optional, as the project includes the Maven wrapper (`mvnw`).

To compile and package the application, run the following command in the project root directory:

```bash
./mvnw clean package
```

### Deploy

It is possible to deploy the application to a local WildFly server using the WildFly Maven Plugin. To start the server and deploy the application, run the following command:

```bash
./mvnw wildfly:provision wildfly:start wildfly:deploy
```

The application will be accessible at: [http://localhost:8080/dms-ex1-starter/](http://localhost:8080/dms-ex1-starter/).

### WildFly Administration Console (HAL)

Before accessing the WildFly administration console, it is necessary to create an administrative user. This can be done by executing the following command:

```bash
./target/server/bin/add-user.sh
```

and following the on-screen instructions to create a "Management User". Once the user is created, the administration console will be accessible at: [http://localhost:9990/console](http://localhost:9990/console).

### Stop WildFly Server

To stop the WildFly server, run the following command:

```bash
./mvnw wildfly:stop
```

### Clean Up

To undeploy the application, run the following command:

```bash
./mvnw wildfly:undeploy
```

To clean up everything (stop the server, delete the built artifacts, and remove the server instance), run:

```bash
./mvnw wildfly:shutdown clean
```
