package org.example;

public class Anagram {

    public boolean checkAnagram(String stringOne, String stringTwo) {
        int counter = 0;
        for (int i = 0; i < stringOne.length(); i++) {
            char one = stringOne.toLowerCase().charAt(i);
            for (int j = 0; j < stringTwo.length(); j++) {
                char two = stringTwo.toLowerCase().charAt(j);
                if (one == two) {
                    counter++;
                    break;
                }
            }
        }
        if (counter == stringOne.length()) {
            return true;
        }
        return false;
    }
}


