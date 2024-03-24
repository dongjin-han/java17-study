package org.example.infrastructure.web.designpattern.state.good;


import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class OnlineCourse {
    private StudyStatus studyStatus = new Draft(this);
    private List<String> reviews = new ArrayList<>();
    private Set<Student> students = new HashSet<>();

    public void addReview(String review, Student student) {
        studyStatus.addReview(review, student);
    }

    public void addStudent(Student student) {
        studyStatus.addStudent(student);
    }

    public void changeStatus(StudyStatus studyStatus) {
        this.studyStatus = studyStatus;
    }
}
