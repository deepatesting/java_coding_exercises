package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return person.getCity().equals("Manchester");
    }
    public boolean isFromLeeds(Person person) {
        return person.getCity().equals("Leeds");
    }
    public boolean canWatchFilm(int ageLimit) {
        return ageLimit >= 18;
    }
    
}
