package com.sparta.ma;

public class Greeting {

    public String getGreeting(String name, Greeter greeter){
        return greeter.greetType(name);
    }

}
