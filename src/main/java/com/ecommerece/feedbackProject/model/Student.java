package com.ecommerece.feedbackProject.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long roll_no;

    private String name;

    private String email;

    List<Feedback> feedbackList;

    public Student() {
        feedbackList = new ArrayList<>();
    }

    public Long getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Long roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

}
