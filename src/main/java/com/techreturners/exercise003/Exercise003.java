package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Exercise003 {

    // Create a HashMap object called iceCream
    private LinkedHashMap<String, Integer> iceCream = new LinkedHashMap<>();

    public Exercise003() {

        // Add keys and values (Flavour, Number) to iceCream HashMap
        this.iceCream.put("Pistachio", 0);
        this.iceCream.put("Raspberry Ripple", 1);
        this.iceCream.put("Vanilla", 2);
        this.iceCream.put("Mint Chocolate Chip", 3);
        this.iceCream.put("Chocolate", 4);
        this.iceCream.put("Mango Sorbet", 5);
    }

    int getIceCreamCode(String iceCreamFlavour) {
        int iceCreamCode = 0;
        if (iceCream.containsKey(iceCreamFlavour)) {
            iceCreamCode = iceCream.get(iceCreamFlavour);
        }
        return iceCreamCode;
    }

    String[] iceCreamFlavours() {
        ArrayList<String> keyList = new ArrayList<String>(iceCream.keySet());
        return keyList.toArray(new String[0]);
    }

}
