# 🎓 Student Feedback Management System - Spring Boot REST API
This is a full-featured Spring Boot REST API that allows you to manage students and their feedback entries using a clean layered architecture. It demonstrates realistic backend development practices using Java 21, Spring Boot 3.4.5, and in-memory data handling. Designed to help you learn or showcase REST API skills without involving databases.

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

## 🛠 Technologies Used
- Java 21
- Spring Boot 3.4.5
- Spring Web (REST APIs)
- IntelliJ IDEA Ultimate
- Git + GitHub

## ✅ Features
- Add new students with roll number, name, and email
- Add multiple feedback entries for each student
- Get all students
- Get student by roll number
- Get all feedbacks of a student
- Calculate average feedback rating
- Layered architecture with Controller, Service, Model
- Uses ResponseEntity for proper HTTP status codes
- No database — data is stored in in-memory Lists

## 📬 API Endpoints

### Student APIs
| Method | Endpoint             | Description                        |  
|--------|----------------------|------------------------------------|  
| POST   | /student             | Add a new student                  |  
| GET    | /student             | Get all students                   |  
| GET    | /student/{roll_no}   | Get student by roll number         |  
| DELETE | /student/{roll_no}   | Delete a student (optional)        |  

### Feedback APIs
| Method | Endpoint                                 | Description                               |  
|--------|------------------------------------------|-------------------------------------------|  
| POST   | /student/{roll_no}/feedback              | Add feedback to a student                 |  
| GET    | /student/{roll_no}/feedback              | Get all feedbacks of a student            |  
| GET    | /student/{roll_no}/feedback/average-rating | Get average rating of student feedbacks |  

## 📄 Sample Request Payloads

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
  "message": "Great participation in class.",
  "rating": 5
}
```

## 📥 Sample Response
```json
[
  {
    "id": 1,
    "message": "Great participation in class.",
    "rating": 5
  },
  {
    "id": 2,
    "message": "Needs improvement in assignments.",
    "rating": 3
  }
]
```

## 🚀 How to Run
1. Clone the repository:
```bash
git clone https://github.com/your-username/student-feedback-api.git  
cd student-feedback-api
```

2. Open in IntelliJ IDEA Ultimate

3. Run the main method from `FeedbackProjectApplication.java`

4. Test APIs at:  
   `http://localhost:8080/student`

Use Postman or browser for testing.

## 🔁 HTTP Status Codes
| Code | Meaning            | Usage                               |  
|------|--------------------|--------------------------------------|  
| 200  | OK                 | Successful fetch                     |  
| 201  | Created            | Successfully added student/feedback |  
| 204  | No Content         | Successfully deleted                 |  
| 404  | Not Found          | Student or feedback not found        |  

## 🧠 Learning Goals
- Understand Spring Boot layered architecture
- Implement clean controller-service-model flow
- Use interfaces and service abstraction
- Return structured JSON using ResponseEntity
- Handle lists and related objects in memory
- Push projects to GitHub professionally

## 💡 Future Improvements
- Add database support using Spring Data JPA
- Add Swagger documentation
- Add unit tests with JUnit/Mockito
- Add sorting & filtering of feedback
- Use LocalDateTime for timestamped feedback
- Deploy using Railway, Render, or Docker

## 👤 Author
**Your Name**  
📧 kopparapubhanuprakash017@gmail.com
🔗 [GitHub](https://github.com/bhanuprakash0017)  
🔗 [LinkedIn](https://www.linkedin.com/in/bhanu-prakash-kopparapu-43a029277/)

## 📜 License
Feel free to use, fork, and extend it.

> ⭐ If you found this project useful, give it a star and share it!
