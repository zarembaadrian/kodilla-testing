package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void getPeopleQuantityTest() {
        Country polska = new Country( new BigDecimal("380"), "Polska");
        Country germany = new Country(new BigDecimal("800"), "Germany");
        Country slovakia = new Country(new BigDecimal("200"), "Slovakia");
        Country brasil = new Country(new BigDecimal("100"), "Brasil");
        Country urugway = new Country(new BigDecimal("400"), "Urugway");
        Country chile = new Country(new BigDecimal("200"), "Chile");
        Country china = new Country(new BigDecimal("200"), "China");
        Country vietnam = new Country(new BigDecimal("900"), "Vietnam");
        Country thailand = new Country(new BigDecimal("750"), "Thailand");

        List<Country> europe = new ArrayList<>();
        europe.add(polska);
        europe.add(germany);
        europe.add(slovakia);

        List<Country> southAmerica = new ArrayList<>();
        southAmerica.add(brasil);
        southAmerica.add(urugway);
        southAmerica.add(chile);

        List<Country> asia = new ArrayList<>();
        asia.add(china);
        asia.add(vietnam);
        asia.add(thailand);

        Continent europe1 = new Continent("Europe", europe);
        Continent southAmerica1 = new Continent("South America", southAmerica);
        Continent asia1 = new Continent("Asia", asia);

        List<Continent> continents = new ArrayList<>();
        continents.add(europe1);
        continents.add(southAmerica1);
        continents.add(asia1);

        World world = new World(continents);

        Assert.assertEquals(new BigDecimal("3930"), world.getPeopleQuantity());

    }
}
