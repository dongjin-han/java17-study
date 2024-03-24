package org.example.infrastructure.web.designpattern.state.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Published implements StudyStatus{
    private OnlineCourse onlineCourse;
    @Override
    public void addReview(String review, Student student) {
        if (student.isAvailable(this.onlineCourse)) {
            this.onlineCourse.getReviews().add(review);
            System.out.println(student.getName() + " 학생이 " + review + " 라고 리뷰를 달았습니다.");
        } else {
            System.out.println("수업을 수강하지 않은 " + student.getName() + " 학생은 리뷰를 남길 수 없습니다.");
        }
    }

    @Override
    public void addStudent(Student student) {
        if (student.getOnlineCourses().contains(this.onlineCourse)) {
            System.out.println("이미 " + student.getName() + " 학생은 해당 과목을 수강 중입니다.");
        } else {
            this.onlineCourse.getStudents().add(student);
            student.getOnlineCourses().add(onlineCourse);
            System.out.println(student.getName() + " 학생이 수강 신청했습니다.");
        }
    }
}
