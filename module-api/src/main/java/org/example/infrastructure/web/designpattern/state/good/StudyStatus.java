package org.example.infrastructure.web.designpattern.state.good;

public interface StudyStatus {
    void addReview(String review, Student student);

    void addStudent(Student student);
}
