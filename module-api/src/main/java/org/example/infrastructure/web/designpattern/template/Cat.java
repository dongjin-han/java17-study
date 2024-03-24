package org.example.infrastructure.web.designpattern.template;

public class Cat extends AnimalTemplate {
    @Override
    protected Object call() {
        return "야옹";
    }
}
