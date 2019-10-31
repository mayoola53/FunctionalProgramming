package com.sparta.ma;

public class NameGreeter implements Greeter {
    @Override
    public String greetType(String name) {
        return "Hello " + name;
    }
}
