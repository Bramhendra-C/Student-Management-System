# 🎓 Student Management System

A modern **Student Management System** built using **Java, Spring Boot, Spring Data JPA, Hibernate, MySQL, HTML, CSS, and JavaScript**. This application provides a clean and responsive dashboard to perform complete CRUD operations on student records using REST APIs.

---

## 📸 Project Preview

### Dashboard
- Modern UI
- Student Statistics
- Search Functionality
- Responsive Design

### Features
- View Students
- Add Student
- Update Student
- Delete Student
- Add Multiple Students
- Search Students
- REST API Integration
- MySQL Database Connectivity

---

# 🚀 Features

✅ Add New Student

✅ View All Students

✅ Update Student Details

✅ Delete Student

✅ Add Multiple Students

✅ Search Students by:
- ID
- Name
- Email
- Course
- Phone Number

✅ Responsive Dashboard

✅ RESTful API

✅ MySQL Database Integration

✅ Hibernate ORM

---

# 🛠️ Tech Stack

## Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

## Frontend
- HTML5
- CSS3
- JavaScript (Fetch API)

## Database
- MySQL

## Tools
- IntelliJ IDEA
- VS Code
- MySQL Workbench
- Git
- GitHub

---

# 📂 Project Structure

```
StudentManagementSystem
│
├── controller
│
├── service
│
├── repository
│
├── model
│
├── resources
│   ├── static
│   │   ├── index.html
│   │   ├── pages
│   │
│   └── application.properties
│
└── pom.xml
```

---

# 📌 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /students | Get All Students |
| GET | /students/{id} | Get Student by ID |
| POST | /students | Add Student |
| POST | /students/studentsadd | Add Multiple Students |
| PUT | /students/{id} | Update Student |
| DELETE | /students/{id} | Delete Student |

---

# 💾 Database Configuration

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentmanagement_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ How to Run

## 1 Clone Repository

```bash
git clone https://github.com/Bramhendra-C/Student-Management-System.git
```

---

## 2 Open Project

Open the project using IntelliJ IDEA or Eclipse.

---

## 3 Create MySQL Database

```sql
CREATE DATABASE studentmanagement_db;
```

---

## 4 Configure Database

Edit

```
src/main/resources/application.properties
```

and enter your MySQL credentials.

---

## 5 Run Spring Boot Application

Run

```
StudentManagementSystemApplication.java
```

---

## 6 Open Frontend

Open

```
src/main/resources/static/index.html
```

or run it using Live Server.

---

# 📷 Screenshots

- Dashboard
- Add Student
- View Students
- Update Student
- Delete Student
- MySQL Database
- IntelliJ Project Structure

*(Add your screenshots here.)*

---

# 🎯 Learning Outcomes

This project helped me learn:

- Spring Boot REST APIs
- CRUD Operations
- Hibernate & JPA
- MySQL Integration
- MVC Architecture
- JavaScript Fetch API
- Frontend & Backend Communication
- Git & GitHub

---

# 🔮 Future Improvements

- JWT Authentication
- Spring Security
- Admin Login
- Role-Based Access
- Pagination
- Export to Excel
- Export to PDF
- Student Image Upload
- Docker Support
- Cloud Deployment (Render + Railway/AWS)

---

# 👨‍💻 Author

**Cherukumudi Bramhendra**

📧 Email: bramicherukumudinaidu@gmail.com

🔗 GitHub:
https://github.com/Bramhendra-C

---

## ⭐ Support

If you like this project, please consider giving it a **⭐ Star** on GitHub.
