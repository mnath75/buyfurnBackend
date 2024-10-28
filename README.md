## Spring Boot
This is a simple Spring Boot project. This application serves as a basic template for a Spring Boot based application.
This project is bootstrapped with [Spring Initializr](https://start.spring.io/).

## How to run
Open `Main.java` file and click on the Run button shown above the `main` method, as shown below:

![](https://static.onecompiler.com/images/posts/3zzkbysj7/run-spring-boot.png)

> If you do not see the Run button, Please wait for a minute for the project to load and open as a Java Project.

<!-- 1. Before running the application, make sure all dependencies are installed. To install dependencies, run following command in terminal:
   ```sh
   ./gradlew build -x test
   ```

2. To run the application, run following command in terminal:
   ```sh
   ./gradlew bootRun
   ```   
3. Refresh the URL in simple browser to see the output.    --># buyfurnBackend


# BuyFurn Backend

This is the backend service for the BuyFurn e-commerce platform, developed using Spring Boot. The backend is responsible for handling REST APIs and providing data services to the BuyFurn frontend.

## Running Backend

The backend service is hosted and accessible at:  
[BuyFurn Backend](https://8zbr62-8080.ocws.app)

## Tech Stack

- **Java 11**: The project is built using Java 11.
- **Spring Boot**: The framework used for building the backend.
- **Gradle**: Build automation tool for managing dependencies and building the project.
- **MySQL**: Database used for persistent storage.
- **Swagger**: For API documentation.

## Prerequisites

Make sure you have the following installed:

- Java 11 or above
- Gradle
- MySQL

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/mnath75/buyfurnBackend.git
2. **Navigate to the project directory**:
```bash
   cd buyfurnBackend
```

3. **Set up the database**:
```bash
1.Configure your MySQL database settings in application.properties.
2.Create a database named buyfurn and update the properties file accordingly.
```
4.**Build the project**:
```bash
gradle build
```

5.**Run the application**:
```bash
gradle bootRun
``