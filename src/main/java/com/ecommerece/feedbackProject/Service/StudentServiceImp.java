package com.ecommerece.feedbackProject.Service;

import com.ecommerece.feedbackProject.model.Feedback;
import com.ecommerece.feedbackProject.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    List<Student> students=new ArrayList<Student>();

    @Override
    public void addStudent(Student student)
    {
        students.add(student);
    }

    @Override
    public List<Student> allStudents() {
        return students;
    }

    @Override
    public Student getStudentByRollNo(long roll_no) {
        for(Student student:students)
        {
            if(student.getRoll_no()==roll_no)return student;
        }
        return null;
    }

    @Override
    public boolean addFeedBackById(Feedback feedback, long rollNo) {
        for(Student student:students)
        {
            if(student.getRoll_no()==rollNo)
            {
                student.getFeedbackList().add(feedback);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Feedback> getAllFeedbackByStudentId(long id) {
        for(Student student:students)
        {
            if(student.getRoll_no()==id)return student.getFeedbackList();
        }
        return null;
    }

    @Override
    public float getAvgRatingByStudentId(long id) {
        Student student=null;
        for(Student stu:students)
        {
            if(stu.getRoll_no()==id){student=stu;break;}
        }
        if(student==null)return 0;
        long sum=0;
        long count=0;
        for(Feedback feedback:student.getFeedbackList())
        {
            sum+=feedback.getRating();
            count++;
        }
        return (float)sum/count;
    }
}
