package org.example.infrastructure.web.designpattern.state.bad;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Deprecated
@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private Set<OnlineCourse> onlineCourses = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(OnlineCourse onlineCourse) {
        // 온라인 코스에 대한 상태마다 분기를 처리해 주는 복잡한 스위치 문이 생겨야 한다.
        this.onlineCourses.add(onlineCourse);
    }


}
