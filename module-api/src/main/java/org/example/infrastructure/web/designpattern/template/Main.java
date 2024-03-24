package org.example.infrastructure.web.designpattern.template;

public class Main {

    public static void main(String[] args) {

        var dog = new Dog();
        var cat = new Cat();

        System.out.println(dog.execute("강아지는 "));
        System.out.println(cat.execute("고양이는 "));

    }


}
