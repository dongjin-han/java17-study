package org.example.infrastructure.web.designpattern.strategy;

public class Walk implements MovingStrategy{

    @Override
    public void move() {
        System.out.println("걸어요.");
    }
}
