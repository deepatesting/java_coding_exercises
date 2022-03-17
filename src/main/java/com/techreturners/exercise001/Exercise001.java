package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if (word.isEmpty()){
            return "";
        }
        String capitalFirstLetter = word.substring(0,1).toUpperCase() + word.substring(1);
        return capitalFirstLetter;
    }

    public String generateInitials(String firstName, String lastName) {
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        String initials = firstName.substring(0,1) + "." + lastName.substring(0,1);
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double addedPrice = originalPrice + (originalPrice * vatRate/100);
        double roundValue = Math.round(addedPrice * 100)/100.0;
        return roundValue;
    }

    public String reverse(String sentence) {
        if(sentence.isEmpty()) {
            return "";
        }
        StringBuilder newString = new StringBuilder();

        newString.append(sentence);
        newString.reverse();
        //String newReverseString = new String(newString);
        return newString.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        //System.out.println(users.size());
        //for (int i = 0; i < users.size(); i++){
        for(User user: users){
            if (user.getType() == "Linux"){
                count++;
            }
        }
        return count;
    }
}
