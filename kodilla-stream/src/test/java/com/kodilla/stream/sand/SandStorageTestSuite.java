package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity() {
        List<SandStorage> continents = new ArrayList();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());

        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage contient: continents) {
            totalSand = totalSand.add(contient.getSandBeansQuantity());
        }

        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand,totalSand);
    }
    @Test
    public void testGetSandBeansWithReduce() {
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());

        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }
}
