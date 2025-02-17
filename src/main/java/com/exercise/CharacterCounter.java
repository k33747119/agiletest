package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterCounter {

    public List<CountResult> getCharacterListWithCount(String[] args) {
        if (args.length > 4) {
            throw new IllegalArgumentException("Extra arguments passed.");
        } else if (args.length < 1) {
            throw new IllegalArgumentException("No arguments passed.");
        } else {
            List<String> argumentList = Arrays.asList(args);
            List<CountResult> vowelCount = new ArrayList<>();
            argumentList.forEach(argument -> vowelCount.add(new CountResult(argument, getVowelCount(argument), getConsonantCount(argument))));
            return vowelCount;
        }
    }

    private Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.toLowerCase().matches("[aeiouy]")).count();
    }

    private int getConsonantCount(String input) {
        // It would be preferable to iterate over each string only once.
        // Could return both vowel and consonant counts in a single iteration.
        return (int) input.chars()
            .mapToObj(c -> (char) c)
            .filter(inputChar -> Character.toString(inputChar).toLowerCase().matches("[bcdfghjklmnpqrstvwxz]"))
            .count();
    }
}
