package org.example.infrastructure.web.designpattern.strategy;

/**
 * 전략 패턴 (행동 패턴)
 *
 * 여러 유사한 알고리즘을 캡슐화해서 객체의 행위를 동적으로 변경 가능하게 만드는 패턴
 * 알고리즘이 런타임에 동적으로 변경되어야 할 때 자주 사용된다.
 *
 * 전략 패턴은 대부분 전략 인터페이스를 통해 구현한다.
 * SOLID 중에 OCP 를 충족한다.
 */
public interface WeaponStrategy {

    void attack();
}
