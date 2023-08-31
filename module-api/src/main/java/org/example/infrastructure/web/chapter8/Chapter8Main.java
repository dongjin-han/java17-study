package org.example.infrastructure.web.chapter8;

public class Chapter8Main {

    public static void main(String[] args) {

        RemoteControl rc = null;

        rc = new Television();

        // 안됨 rc = new Television2();

        rc.turnOn();
        rc = new Radio();
        rc.turnOn();

        System.out.println(((Radio) rc).MAX_VOLUME);
        System.out.println(((Radio) rc).MIN_VOLUME);

        rc.off();

        var tv = new Television();
        tv.off();

        RemoteControl.change();

        SampleFunctionalInterface<String, String> sample = (String s) -> s + " 함수형 인터페이스로 구현체 없이 추상 메소드를 구현하는 방법";

        System.out.println(sample.excute("하하"));
    }

    @FunctionalInterface
    public interface SampleFunctionalInterface<T,R> {
        T excute(R r);

        static void staticMethod() {
            System.out.println("STATIC");
        }
        default void defaultMethod() {
            System.out.println("DEFAULT");
        }
    }
}
