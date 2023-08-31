package org.example.infrastructure.web.chapter8;

public class Television implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("TV ON");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void off() {
        System.out.println("TV OFF");
    }
}
