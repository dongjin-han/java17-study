package org.example.infrastructure.web.designpattern.strategy;

public class Gun implements WeaponStrategy{
    @Override
    public void attack() {
        System.out.println("총으로 공격합니다.");
    }
}
