package org.example.infrastructure.web.designpattern.strategy;

/**
 * 컨텍스트 클래스
 *
 * 전략 패턴에서 전략을 등록하고 실행하는 클래스이다.
 * 이곳을 통해 전략을 교체도 하며 전략에 선언된 메소드를 실행한다.
 *
 * 전략은 이 클래스처럼 조립 시에 전략을 설정하도록 멤버 변수로 있을 수도 있지만,
 * 보통은 아래처럼 동적으로 전략을 바꾸기 위해 파라미터를 통해 매개변수로 받는 케이스가 많다.
 *     // 전략을 매개변수로 받아서 바로바로 전략을 실행
 *     public void pay(PaymentStrategy paymentMethod) {
 *         int amount = 0;
 *         for (Item item : items) {
 *             amount += item.price;
 *         }
 *         paymentMethod.pay(amount);
 *     }
 * 출처: https://inpa.tistory.com/entry/GOF-💠-전략Strategy-패턴-제대로-배워보자 [Inpa Dev 👨‍💻:티스토리]
 *
 * 또한 자바 Collections 의 sort() 가 대표적인 그 예시이다.
 *
 */
public class RobotContext {
    MovingStrategy movingStrategy;
    WeaponStrategy weaponStrategy;

    public RobotContext(MovingStrategy movingStrategy, WeaponStrategy weaponStrategy) {
        this.movingStrategy = movingStrategy;
        this.weaponStrategy = weaponStrategy;
    }

    public void setMove(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void move() {
        this.movingStrategy.move();
    }

    public void setWeapon(WeaponStrategy weaponStrategy) {
        this.weaponStrategy= weaponStrategy;
    }

    public void attack() {
        this.weaponStrategy.attack();
    }
}
