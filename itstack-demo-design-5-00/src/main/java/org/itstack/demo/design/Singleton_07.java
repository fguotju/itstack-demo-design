package org.itstack.demo.design;

public enum Singleton_07 {

    INSTANCE;

    public void test() {
        System.out.println("hi~");
    }

    public Singleton_07 getInstance() {
        return INSTANCE;
    }

}
