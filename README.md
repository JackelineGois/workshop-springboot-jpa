# Project Web Service With Spring Boot and JPA/Hibernate
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](
https://github.com/JackelineGois/demo-dao-jdbc/blob/main/LICENSE)

# About The Project 
This back end project is a shopping system where I used the Spring Boot framework to create the application, Maven as dependency management, H2 as the database and memory for testing, and also the Postman tool to test the endpoints. 

The project was structured with logical layers of resource, service, repository, the CRUD system was used and exceptions were handled.

 
# Technologies Used
## Backend
- Java
- Spring Boot
- JPA/ Hibernate
## Database
- H2
## Dependency Management 
- Maven


# How To Execute The Project
## Requirements: Java 17

## Clone Repository
```
git clone https://github.com/JackelineGois/workshop-springboot-jpa.git
```
##  Enter The Backend Project Folder
```
cd folder path
```
To help identify the folder path, you can press the tab key on your keyboard to complete
## Execute the project 
```
./mvnw spring-boot:run 
```
## Endpoints
Open Postman and access the endpoints to send HTTP requests to the APIs and receive responses.
### Method Get
```
http://localhost:8080/users
http://localhost:8080/users/id
http://localhost:8080/category
http://localhost:8080/category/id
http://localhost:8080/orders
http://localhost:8080/orders/id
http://localhost:8080/products
http://localhost:8080/products/id
```
### Method Post
```
http://localhost:8080/users
```
### Method Delete
```
http://localhost:8080/users/id
```
### Method Put
```
http://localhost:8080/orders/id
```

# Autor
Jackeline de Morais Gois

https://github.com/JackelineGois



