package org.example.infrastructure.web.designpattern.template;

public class Dog extends AnimalTemplate {
    @Override
    protected Object call() {
        super.hookOn();
        return "멍멍";
    }
}
