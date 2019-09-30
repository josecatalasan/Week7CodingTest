package com.example.week7codingtest;

import java.util.HashMap;

public class LetterFrequency {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        System.out.println(letterFrequency("Hello there! Apple!"));
        System.out.println(letterFrequency("I want to liiive"));
    }

    private static HashMap letterFrequency(String string){
        string = string.toLowerCase().replaceAll("[^a-z]", "");
        HashMap<Character, Integer> frequencyMap = new HashMap<>();


        for(int i=0; i<alphabet.length(); i++){
            frequencyMap.put(alphabet.charAt(i), 0);
        }

        for(int i=0; i<string.length(); i++){
            frequencyMap.put(string.charAt(i), frequencyMap.get(string.charAt(i))+1 );
        }

        return frequencyMap;
    }
}
