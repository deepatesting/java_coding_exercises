package com.techreturners.exercise005;

public class Exercise005 {

    private boolean success = true;

    public boolean isPangram(String input) {
        String str = input.toLowerCase();
        for(char c = 'a'; c <= 'z'; ++c) {
            if(!str.contains(String.valueOf(c))) {
                success = false;
                break;
            }
        }
        if (!success) { return false; }
        else if (input.matches("[\\w\\s-]+")) { return true; }
        else { return false; }
    }

}
