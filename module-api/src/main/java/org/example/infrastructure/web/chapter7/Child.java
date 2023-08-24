package org.example.infrastructure.web.chapter7;

public class Child extends Father{

    protected int j = 77;

    @Override
    public int printI() {
        return i*i;
    }

    public int printJ() {
        return j;
    }


}
