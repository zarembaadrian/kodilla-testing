package com.kodilla.stream.world;

import java.util.ArrayList;


public final class World {

    Continent continent = new Continent();
    Country country = new Country();


    public final ArrayList<ArrayList> allContinents = new ArrayList<>(); {
        allContinents.add(continent.africa);
        allContinents.add(continent.europe);
        allContinents.add(continent.asia);
    }

   /* public BigDecimal getPeopleQuantity() {
       return allContinents.stream().flatMap()
    } */
}
