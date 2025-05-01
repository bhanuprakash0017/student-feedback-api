# 📘 Student Feedback Management System  
_A Spring Boot REST API Project | Java 21 | Clean Code Architecture | In-Memory Storage_

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.4.5-success?logo=spring-boot)
![Status](https://img.shields.io/badge/Project-Completed-brightgreen)
![License](https://img.shields.io/badge/License-MIT-informational)

---

## 📌 Project Overview

The **Student Feedback Management System** is a full-stack-ready backend application built with Spring Boot. It allows you to manage student records and store multiple feedback entries per student using a RESTful API. Built with clean, modular architecture and best practices, this project is ideal for learning Spring Boot or showcasing real-world API skills.

✅ This version uses **Java Collections (in-memory List)** — no database.  
🚀 Great for beginner to intermediate Java developers preparing for interviews or real projects.

---

## 🧰 Tech Stack

| Technology     | Description                         |
|----------------|-------------------------------------|
| Java 21        | Programming Language                |
| Spring Boot 3.4.5 | Java Backend Framework (REST APIs) |
| Spring Web     | REST API Handling                   |
| IntelliJ IDEA Ultimate | Development IDE             |
| Git & GitHub   | Version Control                     |

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com.ecommerce.feedbackProject/
            ├── model/
            │   ├── Student.java
            │   └── Feedback.java
            ├── Controller/
            │   └── Controller.java
            ├── Service/
            │   ├── StudentService.java
            │   └── StudentServiceImp.java
            └── FeedbackProjectApplication.java
```

---

## ✨ Key Features

- Add new students with name, roll number, and email
- Add multiple feedbacks to any student
- Retrieve all students or specific student by roll number
- Retrieve all feedbacks for a student
- Compute average rating for a student’s feedback
- RESTful endpoints using Spring Web
- Layered architecture with separation of concerns
- Uses interfaces for better abstraction
- Clean JSON responses with proper HTTP status codes
- Fully testable with Postman or curl

---

## 🔗 API Endpoints

### 👨‍🎓 Student APIs

| Method | Endpoint             | Description                  |
|--------|----------------------|------------------------------|
| POST   | `/student`           | Add a new student            |
| GET    | `/student`           | Get all students             |
| GET    | `/student/{roll_no}` | Get student by roll number   |
| DELETE | `/student/{roll_no}` | Delete a student (optional)  |

### 📝 Feedback APIs

| Method | Endpoint                                 | Description                           |
|--------|------------------------------------------|---------------------------------------|
| POST   | `/student/{roll_no}/feedback`            | Add feedback to a student             |
| GET    | `/student/{roll_no}/feedback`            | Get all feedbacks for a student       |
| GET    | `/student/{roll_no}/feedback/average-rating` | Get average feedback rating       |

---

## 📦 Sample Request Payloads

### ➕ Add Student

```json
{
  "roll_no": 101,
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

### ➕ Add Feedback

```json
{
  "id": 1,
  "message": "Excellent in class participation.",
  "rating": 5
}
```

---

## 🧾 Sample Response (GET `/student/101/feedback`)

```json
[
  {
    "id": 1,
    "message": "Excellent in class participation.",
    "rating": 5
  },
  {
    "id": 2,
    "message": "Could improve homework consistency.",
    "rating": 3
  }
]
```

---

## ⚙️ How to Run This Project

1. Clone the repository:
```bash
git clone https://github.com/your-username/student-feedback-api.git
cd student-feedback-api
```

2. Open the project in **IntelliJ IDEA Ultimate**

3. Run the app:
- Navigate to `FeedbackProjectApplication.java`
- Click the green `▶️ Run` button

4. Test APIs:
- Base URL: `http://localhost:8080`
- Use Postman or browser

---

## ✅ HTTP Status Codes

| Status Code | Meaning               | Example Usage                          |
|-------------|-----------------------|----------------------------------------|
| `200 OK`    | Request successful     | GET requests                           |
| `201 Created` | Resource created     | POST new student or feedback           |
| `204 No Content` | Resource deleted  | DELETE a student                       |
| `404 Not Found` | Student not found  | GET with invalid ID                    |

---

## 🎯 Learning Objectives

- Learn Spring Boot by building real use cases
- Understand layered architecture (`Controller → Service → Model`)
- Work with interfaces and abstractions
- Implement and test REST APIs
- Improve code structure and readability
- Prepare for Java developer interviews

---

## 📈 Possible Future Enhancements

- Add database support with Spring Data JPA (H2/MySQL)
- Add Swagger/OpenAPI documentation
- Add input validations (`@Valid`, `@NotNull`, etc.)
- Add unit & integration testing using JUnit/Mockito
- Add feedback timestamp using `LocalDateTime`
- Add pagination, filtering, and sorting
- Deploy on Render, Railway, or Docker

---

## 👤 Author

**Your Name**  
📧 your.email@example.com  
🔗 [GitHub](https://github.com/your-username)  
🔗 [LinkedIn](https://linkedin.com/in/your-link)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).  
You're free to use, modify, and distribute it for personal and educational use.

> ⭐ Found this useful? Star the repo and share it to help others learn Spring Boot!
