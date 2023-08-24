package org.example.infrastructure.web.chapter7;

public interface GrandFather {

    default String A() {
        return "A";
    }
}
