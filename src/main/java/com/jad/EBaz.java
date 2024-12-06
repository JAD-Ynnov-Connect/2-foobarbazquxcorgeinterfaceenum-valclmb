package com.jad;

public enum EBaz implements IBaz {
    BAZ1("Baz1"),
    BAZ2("Baz2"),
    BAZ3("Ba3");

    private final String name;

    EBaz(String name) {
        this.name = name;
    }


    @Override
    public void doSomethingLikeABaz() {
        System.out.println("I am " + name);
    }
    
    public String getName() {
        return name;
    }
}