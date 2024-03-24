package org.example.infrastructure.web.designpattern.state.bad;

/**
 * 상태 패턴 적용전
 *
 * DRAFT : 강좌 개설전으로 리뷰를 달 수 없고 수강신청도 할 수 없는 상태
 * PUBLISHED : 강좌가 개설되어 리뷰를 달 수 있고 수강신청도 할 수 있는 상태
 * PRIVATE : 비밀 강좌로, 인가받은 학생만 수강신청을 할 수 있는 상태
 *
 */
@Deprecated
public enum StudyStatus {
    DRAFT,
    PUBLISHED,
    PRIVATE
}
