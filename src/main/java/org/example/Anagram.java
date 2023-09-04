package org.example;

import java.util.*;

public class Anagram {
    Map<String, List<String>> anagrams = new HashMap<>();

    public Anagram() {
        anagrams.put("apple", new ArrayList<>());
        anagrams.get("apple").add("appel");
        anagrams.get("apple").add("pepla");
        anagrams.put("leap", new ArrayList<>());
        anagrams.get("leap").add("peal");
        anagrams.get("leap").add("pale");
        anagrams.get("leap").add("plea");
        anagrams.put("bar", new ArrayList<>());
        anagrams.get("bar").add("bra");
        anagrams.get("bar").add("arb");
    }


    public boolean anagramFinder(String keyWord) {
        int i = 0;
        for (List<String> valueList : anagrams.values()) {
            for (String anagram : valueList) {
                if (hasCharacter(keyWord, anagram)) {
                    i = 1;
                    System.out.println("Hei!");
                }
                if (anagramKeys(keyWord)) {
                    i = 0;
                }
            }
        }
        if (i == 1) {
            return true;
        } else return false;
    }

    private boolean hasCharacter(String firstString, String secondString) {
        char[] first = firstString.toCharArray();
        char[] second = secondString.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

    public boolean anagramKeys(String keyWord) {
        for (String key : anagrams.keySet()) {
            if (key == keyWord) {
                return false;
            }
        }
        return true;
    }

}
