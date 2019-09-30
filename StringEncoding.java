package com.example.week7codingtest;

public class StringEncoding {

    private static final String alphabetF = "abcdefghijklmnopqrstuvwxyz";
    private static final String alphabetB = "zyxwvutsrqponmlkjihgfedcba";

    public static void main(String[] args) {

        System.out.println(encode("a!c..p"));
        System.out.println(encode("a1b  2c3"));
        System.out.println(encode("???ZYX!!!"));
        System.out.println(encode("<m,n>"));
        System.out.println(encode("Errors in strategy cannot be correct through tactical maneuvers"));
    }

    private static String encode(String string) {
        string = string.toLowerCase().replaceAll("[^a-z\\s]", "");
        StringBuilder returnString = new StringBuilder();

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == ' ')
                returnString.append(string.charAt(i));
            else
                returnString.append(alphabetB.charAt(alphabetF.indexOf(string.charAt(i))));
        }

        return returnString.toString();
    }

}
