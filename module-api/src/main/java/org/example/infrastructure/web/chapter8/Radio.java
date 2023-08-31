package org.example.infrastructure.web.chapter8;

public class Radio implements RemoteControl{

    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0; // public static final 가 컴파일 시에 알아서 붙는다.

    @Override
    public void turnOn() {
        System.out.println("Radio ON");
    }

    @Override
    public void turnOff() {

    }
}
