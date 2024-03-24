package org.example.infrastructure.web.designpattern.state.good;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private Set<OnlineCourse> onlineCourses = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public boolean isAvailable(OnlineCourse onlineCourse) {
        return onlineCourses.contains(onlineCourse);
    }

}
