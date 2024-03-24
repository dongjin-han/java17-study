package org.example.infrastructure.web.designpattern.state.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Draft implements StudyStatus{
    private OnlineCourse onlineCourse;
    @Override
    public void addReview(String review, Student student) {
        System.out.println("수업이 DRAFT 상태에서는 리뷰를 달 수 없습니다.");
    }

    @Override
    public void addStudent(Student student) {
        System.out.println("수업이 DRAFT 상태에서는 수강생을 추가할 수 없습니다.");
    }
}
