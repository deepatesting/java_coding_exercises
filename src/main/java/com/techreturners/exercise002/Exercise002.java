package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        if(person.getCity() == "Manchester") {
            return true;
        }
        else
            return false;
    }
    public boolean isFromLeeds(Person person) {
        if(person.getCity() == "Leeds") {
            return true;
        }
        else
            return false;
    }
    public boolean canWatchFilm(int ageLimit) {
        if(ageLimit >= 18) {
            return true;
        }
        else
            return false;
    }
    
}
