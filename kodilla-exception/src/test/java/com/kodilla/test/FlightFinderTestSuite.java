package com.kodilla.test;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.Assert;
import org.junit.Test;

public class FlightFinderTestSuite {

    @Test
    public void FlightFinder() {
        FlightFinder flightFinder = new FlightFinder();

        Flight flight1 = new Flight("Warsaw", "Moscow");
        Flight flight2 = new Flight("Paris", "Lizbona");

        flightFinder.addFlight(flight2);

        try {
            Assert.assertTrue(flightFinder.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Fly not found");
        }

    }
}
