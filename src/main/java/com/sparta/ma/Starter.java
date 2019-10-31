package com.sparta.ma;

public class Starter {
    public static void main(String[] args) {
        Greeter standardGreeting = name -> "Hello " + name;
        Greeter casualGreeting = name -> "Hi " + name;
        Greeter formaldGreeting = name -> "Good Evening " + name;
        Greeting greeting = new Greeting();
        String person = "Michael";
        System.out.println(greeting.getGreeting(person, casualGreeting));
        System.out.println(greeting.getGreeting(person, standardGreeting));
        System.out.println(greeting.getGreeting(person, formaldGreeting));
    }
}
