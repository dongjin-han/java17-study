package org.example.infrastructure.web.designpattern.template;

/**
 * 템플릿 메소드 패턴 (행동 패턴)
 *
 * 공통적인 부분은 템플릿 메소드를 가진 클래스 또는 추상 클래스로 부모 클래스를 선언하고
 * 하위 클래스에서 이 부모 클래스를 상속하여 공용으로 사용하게 하는 디자인 패턴이다.
 *
 * execute() : 공통적으로 실행할 템플릿 메소드 - 자식에서 오버라이딩 하지 못하도록 final 로 선언하는게 좋다
 * T call() : 추상 메소드로 선언하여 부모 클래스를 상속하는 자식 클래스에서 구현하도록 유도함.
 * hook() : 조건부로 사용하기 위해 hook() 메서드를 제공하는 방법도 있다.
 *
 * SOLID 중에 OCP 원칙을 충족하나 LSP 원칙을 위반할 수 있다.
 *
 * 실무에서는 AbstractMap 을 구현한 HashMap, TreeMap 가 대표적인 예시이며
 * 스프링에도 extends Web~~ 등과 같이 컨피그레이션을 확장하여 오버라이딩 할 때 템플릿 메소드 패턴을 사용한다.
 *
 * @param <T>
 */
public abstract class AnimalTemplate<T> {

    private boolean hook = false;

    // 템플릿 메소드
    public final T execute(String message) {
        T result = call();
        if (hook) {
            System.out.println("조건부 모드 ON" + this);
        }
        return (T) (message + result);
    }

    public final void hookOn() {
        this.hook = true;
    }

    protected abstract T call();
}
