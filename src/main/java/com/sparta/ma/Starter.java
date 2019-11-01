package com.sparta.ma;

public class Starter {
    public static void main(String[] args) {
//        Greeter standardGreeting = name -> "Hello " + name;
//        Greeter casualGreeting = name -> "Hi " + name;
//        Greeter formaldGreeting = name -> "Good Evening " + name;
//        Greeting greeting = new Greeting();
//
//        String person = "Michael";
//        System.out.println(greeting.getGreeting(person, casualGreeting));
//        System.out.println(greeting.getGreeting(person, standardGreeting));
//        System.out.println(greeting.getGreeting(person, formaldGreeting));
//        AnonClass anonClass = new AnonClass();
//        anonClass.runThread();

//        Streams streams = new Streams();
//        streams.useForLopp();
//
//        streams.useLambdas();

        NumberDoubler doubler =  x-> x*2;
        System.out.println(doubler.doublenNumber(3));

    }

    interface NumberDoubler{
        int doublenNumber(int x);

    }




}
