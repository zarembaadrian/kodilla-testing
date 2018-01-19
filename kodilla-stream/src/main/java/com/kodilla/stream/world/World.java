package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private  List<Continent> continentsList;

    public World(final List<Continent> continentsList) {
        this.continentsList = continentsList;
    }

    public BigDecimal getPeopleQuantity() {
      return continentsList.stream().flatMap(continent -> continent.getCountryList().stream()
                .map(country -> country.getPeopleQuantity()))
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
