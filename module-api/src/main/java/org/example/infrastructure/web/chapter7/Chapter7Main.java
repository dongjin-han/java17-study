package org.example.infrastructure.web.chapter7;

public class Chapter7Main {

    public static void main(String[] args) {

        var child = new Child();

        System.out.println("child I " + child.printI());
        System.out.println("child J " + child.printJ());

        Father child2 = new Child();

        System.out.println("child2 I " + child2.printI());
        // System.out.println("child2 J " + child2.printJ()); 컴파일 에러

        var newChild = new NewChild();

        newChild.makeFood();
    }
}
