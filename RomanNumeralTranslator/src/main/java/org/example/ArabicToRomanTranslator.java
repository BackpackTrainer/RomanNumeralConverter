package org.example;

public class ArabicToRomanTranslator {

    public String translate(int input){
        StringBuilder output = new StringBuilder();
        while (input >= 1000){
            output.append("M");
            input -= 1000;
        }
        if (input >= 900){
            output.append("CM");
            input -= 900;
        }
        while (input >= 500){
            output.append("D");
            input -= 500;
        }
        if (input >= 400){
            output.append("CD");
            input -= 400;
        }
        while (input >= 100){
            output.append("C");
            input -= 100;
        }
        if (input >= 90){
            output.append("XC");
            input -= 90;
        }
        while (input >= 50){
            output.append("L");
            input -= 50;
        }
        if (input >= 40){
            output.append("XL");
            input -= 40;
        }
        while (input >= 10){
            output.append("X");
            input -= 10;
        }
        if (input >= 9){
            output.append("IX");
            input -= 9;
        }
        while (input >= 5){
            output.append("V");
            input -= 5;
        }
        if (input >= 4){
            output.append("IV");
            input -= 4;
        }
        while (input >= 1){
            output.append("I");
            input -= 1;
        }

        return output.toString();
    }
}
