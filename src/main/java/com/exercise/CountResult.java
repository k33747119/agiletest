package com.exercise;

public class CountResult {
    private String word;
    private Integer vowelCount;
    private int consonantCount;

    public CountResult(String word, Integer vowelCount, int consonantCount) {
        this.word = word;
        this.vowelCount = vowelCount;
        this.consonantCount = consonantCount;
    }

    public Integer getVowelCount() {
        return vowelCount;
    }

    public void setVowelCount(Integer vowelCount) {
        this.vowelCount = vowelCount;
    }

    public int getConsonantCount() {
        return consonantCount;
    }

    public void setConsonantCount(int consonantCount) {
        if (consonantCount < 0) {
            throw new IllegalArgumentException("Consonant count cannot be negative.");
        }
        this.consonantCount = consonantCount;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    @Override
    public String toString() {
        return String.format("CountResult{word='%s', vowelCount=%d, consonantCount=%d}", word, vowelCount, consonantCount);
    }
}
