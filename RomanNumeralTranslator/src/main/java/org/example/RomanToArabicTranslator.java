package org.example;

import java.util.HashMap;

public class RomanToArabicTranslator {

    public int basicHashTranslate(String input) {
        HashMap<String, Integer> basicTranslations = new HashMap<>(){{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};
        return basicTranslations.get(input);
    }


    public int translate(String input) {
        if (input.length() == 1) {
            return basicHashTranslate(input);
        }
        int output= 0;
        int now;

        for (int i= 0; i < input.length(); i++) {
            now = basicHashTranslate(input.substring(i, i + 1));

            if (input.length() > i + 1 && now < basicHashTranslate(input.substring(i+1, i+2))) {
                output -= now;
            } else {
                output += now;
            }
        }

        return output;
    }
}
