package org.example.infrastructure.web.designpattern.state.bad;


@Deprecated
public class OnlineCourse {
    private StudyStatus studyStatus = StudyStatus.DRAFT;

    public boolean isAddAvailable() {
        return this.studyStatus != StudyStatus.DRAFT;
    }
}
