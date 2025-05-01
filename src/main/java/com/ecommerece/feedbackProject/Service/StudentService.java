package com.ecommerece.feedbackProject.Service;

import com.ecommerece.feedbackProject.model.Feedback;
import com.ecommerece.feedbackProject.model.Student;

import java.util.List;

public interface StudentService {

     void addStudent(Student student);

     List<Student> allStudents();

     Student getStudentByRollNo(long roll_no);

     boolean addFeedBackById(Feedback feedback, long rollNo);

     List<Feedback> getAllFeedbackByStudentId(long id);

     float getAvgRatingByStudentId(long id);

}
