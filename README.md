**Student CRUD Application (Spring Boot)**
**Project Overview**

This is a simple CRUD (Create, Read, Update, Delete) RESTful application built using Java and Spring Boot.
The application manages Student details and demonstrates a clean backend architecture using Spring Data JPA and H2 in-memory database.

This project is created for learning purposes and to demonstrate backend fundamentals commonly expected in Java developer interviews.


**🛠️ Tech Stack**
Java 17
Spring Boot
Spring Web
Spring Data JPA
H2 Database (In-Memory)
Maven

**🧩 Features**
Add a new student
Fetch all students
Update existing student details
Delete a student by ID
RESTful API design
Layered architecture (Controller, Service, Repository)

**📁 Project Structure**
src/main/java/com/example/cruddemo
│
├── controller
│   └── StudentController.java
│
├── service
│   ├── StudentService.java
│   └── StudentServiceImpl.java
│
├── repository
│   └── StudentRepository.java
│
├── entity
│   └── Student.java
│
└── SimpleCrudApiApplication.java

**🔗 API Endpoints**

**➕ Create Student**
POST /students
{
  "name": "Naru",
  "email": "naru@gmail.com"
}

**📄 Get All Students**
GET /students

**✏️ Update Student**
PUT /students/{id}
{
  "name": "Updated Name",
  "email": "updated@gmail.com"
}

**❌ Delete Student**
DELETE /students/{id}

**🗄️ Database Configuration**
Uses H2 in-memory database
No external database setup required
H2 Console available for debugging

h2-console path: http://localhost:8080/h2-console
JDBC URL : jdbc:h2:mem:testdb

**⚙️ Application Properties**
spring.application.name=simple-crud-api
spring.datasource.url = jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
server.port = 8080
spring.jpa.show-sql= true
spring.jpa.hibernate.ddl-auto=update

**▶️ How to Run the Project**
Clone the repository
Open in IntelliJ / STS
Run CruddemoApplication.java
Test APIs using Postman

**🎯 Learning Outcomes**
Understanding CRUD operations in Spring Boot
Working with Spring Data JPA
REST API development
Clean layered architecture
In-memory database usage

**🚀 Future Enhancements**
Switch from H2 to MySQL
Add DTOs and validation
Global exception handling
Swagger API documentation
Authentication & Authorization

👩‍💻 Author
Narmadha
Java Backend / Full Stack Developer



