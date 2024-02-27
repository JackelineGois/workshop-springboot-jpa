# Project Web Service With Spring Boot and JPA/Hibernate

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](
https://github.com/JackelineGois/demo-dao-jdbc/blob/main/LICENSE)

# About The Project 
This back end project is a shopping system where I used the Spring Boot framework to create the application, Maven as dependency management, H2 as the database and memory for testing, and also the Postman tool to test the endpoints. 

The project was structured with logical layers of resource, service, repository, the CRUD system was used and exceptions were handled.
 
# Technologies Used

## Back end
- Java
- Spring Boot
- JPA/ Hibernate
- Maven
- H2
- Postman

# How to execute the project
### spring boot project
Start a Spring Boot project with the Maven dependency manager, the most stable Java language, the packaging jar, and the Spring web library as a dependency.
- https://start.spring.io/
  
Unzip the file and copy and paste it into a folder and open it in your IDE of choice.

### pom.xml file
In the pom.xml file add the dependencies to provide support for developing JPA (Java Persistence Api) applications with the Spring Framework and to allow access to the H2 relational database.

```
<dependency> 
  <groupId>org.springframework.boot</groupId> 
  <artifactId>spring-boot-starter-data-jpa</artifactId> 
</dependency>

<dependency> 
  <groupId>com.h2database</groupId> 
  <artifactId>h2</artifactId> 
  <scope>runtime</scope> 
</dependency>
```

### src/main/resources 
Create a resources folder to place resources not related to the source code and then create the application-test.properties file that will be responsible for configuring the database for your test environment with the H2 database in memory with JPA.
```
-DATASOURCE 
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
- H2 CLIENT 
spring.h2.console.enabled=true 
spring.h2.console.path=/h2-console 
- JPA, SQL 
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
Within the same resource folder, create application.properties file to configure the application defaults.
```
spring.profiles.active=test 

spring.jpa.open-in-view=true 
```
# Autor
Jackeline de Morais Gois

https://github.com/JackelineGois



