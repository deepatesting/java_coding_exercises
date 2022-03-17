package com.techreturners.exercise005;

import java.util.List;


public class Exercise005 {

    public boolean isPangram(String input) {

        // To check
        String str = input.toLowerCase();
        boolean success = true;

        for(char c = 'a'; c <= 'z'; ++c) {
            if(!str.contains(String.valueOf(c))) {
                success = false;
                break;
            }
        }
        if (!success) {
            //System.out.println("Missing alphabet is " + c);
            return false;
        } else if (input.matches("[\\w\\s-]+")) {
            //System.out.println("Includes words, numbers, underscore, hyphen or space::" + input);
            return true;
        } else {
            //System.out.println("else::" + input);
            return false;
        }
        /*
        if (input.matches("[a-zA-Z]+")) {
            System.out.println("full lowercase or uppercase only::"  + input);
            return true;
        } else if (input.matches("[a-zA-Z\\s]+")) {
            System.out.println("lowercase or uppercase with space::" + input);
            return true;
        } else if (input.matches("[\\w\\s]+")) {
            System.out.println("Includes words, numbers, underscore or space::" + input);
            return true;
        } else {
            System.out.println("else::" + input);
            return false;
        }
        } */

    }

}
