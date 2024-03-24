package org.example.infrastructure.web.designpattern.strategy;

public class Main {


    public static void main(String[] args) {
        RobotContext robotContext = new RobotContext(new Walk(), new Gun());

        robotContext.attack();
        robotContext.move();

        robotContext.setWeapon(new Hammer());
        robotContext.attack();
        robotContext.setMove(new Run());
        robotContext.move();

    }


}
