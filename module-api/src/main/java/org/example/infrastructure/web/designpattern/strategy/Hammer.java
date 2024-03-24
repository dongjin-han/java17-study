package org.example.infrastructure.web.designpattern.strategy;

public class Hammer implements WeaponStrategy{
    @Override
    public void attack() {
        System.out.println("망치로 공격합니다.");
    }
}
