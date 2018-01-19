package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final String name;
    private  List<Country> countryList;


    public Continent(String name, final List<Country> countryList) {
        this.name = name;
        this.countryList = countryList;
    }

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
