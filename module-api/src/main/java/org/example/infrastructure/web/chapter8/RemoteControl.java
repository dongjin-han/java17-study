package org.example.infrastructure.web.chapter8;

public interface RemoteControl {

    public void turnOn();

    public abstract void turnOff();

    public default void off() {
        System.out.println("OFF");
    }

    public static void change() {
        System.out.println("CHANGE");
    }
}
