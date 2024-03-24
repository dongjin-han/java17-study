package org.example.infrastructure.web.designpattern.strategy;

public class Run implements MovingStrategy{
    @Override
    public void move() {
        System.out.println("달려요.");
    }
}
