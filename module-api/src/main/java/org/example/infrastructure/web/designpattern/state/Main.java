package org.example.infrastructure.web.designpattern.state;

import org.example.infrastructure.web.designpattern.state.good.OnlineCourse;
import org.example.infrastructure.web.designpattern.state.good.Published;
import org.example.infrastructure.web.designpattern.state.good.Student;

/**
 * 상태 패턴 (행동 패턴)
 *
 * 객체 내부 상태 변경에 따라 객체의 행동이 달라지는 패턴.
 * 예를 들어 객체가 TV 라 한다면 TV 의 상태가 ON 이면 볼륨 UP/DOWN 을 할 수 있지만
 * 상태가 OFF 라면 볼륨 UP/DOWN 을 할 수 없는 것처럼 행동이 달라지게 된다.
 *
 */
public class Main {

    public static void main(String[] args) {
        var dongjin = new Student("동진");
        var firstCourse = new OnlineCourse();

        firstCourse.addStudent(dongjin);
        firstCourse.addReview("구려", dongjin);

        // 상태 변화
        firstCourse.changeStatus(new Published(firstCourse));

        firstCourse.addStudent(dongjin);
        firstCourse.addReview("구려", dongjin);

        var seungjin = new Student("승진");

//        firstCourse.addReview("좋아", seungjin);
    }
}
