package com.sparta.ma;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    private List<String> towns = Arrays.asList("Brighton", "Worthing", "Leeds", "Nottingham", "Manchester","London");
    private Stream<String> townsNames = towns.stream();
    //private Stream<String> tn = Stream.of(towns);

    public void useForLopp() {
        for (String name : towns) {
            System.out.println(name);
        }
    }
    public void useLambdas(){
            towns.stream()
                    .map(String :: toUpperCase)
                    .filter(town->town.startsWith("L"))
                    .forEach(System.out::println);;
        }






}
