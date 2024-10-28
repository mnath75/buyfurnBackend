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
```
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
