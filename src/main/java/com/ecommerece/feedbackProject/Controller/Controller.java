package com.ecommerece.feedbackProject.Controller;

import com.ecommerece.feedbackProject.Service.StudentService;
import com.ecommerece.feedbackProject.Service.StudentServiceImp;
import com.ecommerece.feedbackProject.model.Feedback;
import com.ecommerece.feedbackProject.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {
    StudentService studentService;

    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping

    public ResponseEntity<String> addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        return new ResponseEntity<>("student added successfully",HttpStatus.CREATED);
    }

    @GetMapping

    public ResponseEntity<List<Student>> getAllStudents()
    {
        return new ResponseEntity<>(studentService.allStudents(),HttpStatus.OK);
    }

    @GetMapping("/{roll_no}")
    public ResponseEntity<Student> getStudentByRollNo(@PathVariable long roll_no)
    {
            Student student= studentService.getStudentByRollNo(roll_no);
            return new ResponseEntity<>(student, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/{roll_no}/feedback")
    public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback,@PathVariable long roll_no)
    {
        boolean isAdded=studentService.addFeedBackById(feedback,roll_no);
        if(isAdded)return new ResponseEntity<>("Feedback added sucessfully",HttpStatus.OK);
        else return new ResponseEntity<>("Feedback not added because not student is found with the given if",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}/feedback")
    public ResponseEntity<List<Feedback>> getAllFeedbackByStudentId(@PathVariable long id)
    {
        return new ResponseEntity<>(studentService.getAllFeedbackByStudentId(id),HttpStatus.OK);
    }

    @GetMapping("/{id}/feedback/rating")
    public ResponseEntity<String> getAvgRatingByStudentId(@PathVariable long id)
    {
        float averageRating=studentService.getAvgRatingByStudentId(id);
        return new ResponseEntity<>("Student average Rating = "+" "+averageRating,HttpStatus.OK);
    }
}
