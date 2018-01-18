package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class Continent {

    Country country = new Country();

    public final ArrayList<BigDecimal> europe = new ArrayList<>(); {
        europe.add(country.getPopoulationOfRomania());
        europe.add(country.getPopulationOfPoland());
        europe.add(country.getPopulationOfGermany());
    }

    public final ArrayList<BigDecimal> africa = new ArrayList<>(); {
        africa.add(country.getPopulationOfKenya());
        africa.add(country.getPopulationOfLibia());
        africa.add(country.getPopulationOfMarocco());
    }
    public final ArrayList<BigDecimal> asia = new ArrayList<>(); {
        asia.add(country.getPopulationOfChina());
        asia.add(country.getPopulationOfVietnam());
        asia.add(country.getPopulationOfJapanesee());
    }
}
