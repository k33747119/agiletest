package com.exercise;

public class Main {

    public static void main(String[] args) {
        CharacterCounter counter = new CharacterCounter();
        var result = counter.getCharacterListWithCount(args);
        result.forEach(System.out::println);
    }
}
