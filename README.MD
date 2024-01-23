# Spring Boot Demo

This is a simple Spring Boot project created using Spring Initializr.

## Table of Contents

- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Building and Running](#building-and-running)
- [Endpoints](#endpoints)
- [License](#license)

## Introduction

This project serves as a basic introduction to Spring Boot and includes a simple REST endpoint that returns a greeting.

## Project Structure

The project structure is organized as follows:

- `src/`: Source code directory.
  - `main/`: Main application code.
    - `java/`: Java source files.
      - `com/example/demo/`: Package directory.
        - `DemoApplication.java`: Main application class.
        - `HelloController.java`: Controller class defining a REST endpoint.
    - `resources/`: Resource files.
      - `application.properties`: Application configuration.
  - `test/`: Test code directory.
    - ...

## Getting Started

### Prerequisites

Before running the application, ensure you have the following installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- Your preferred Java IDE (e.g., [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/))

### Building and Running

1. Clone or download the project to your local machine.

2. Open the project in your Java IDE.

3. Run the main application class (`DemoApplication.java`).

4. Open your web browser and navigate to [http://localhost:8080/api/hello](http://localhost:8080/api/hello) to access the greeting endpoint.

## Endpoints

- **GET /api/hello**: Returns a simple greeting message.

## License

This project is licensed under the [MIT License](LICENSE).
