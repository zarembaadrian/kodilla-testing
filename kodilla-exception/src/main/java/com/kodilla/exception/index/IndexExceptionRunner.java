package com.kodilla.exception.index;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;

import java.util.List;

public class IndexExceptionRunner {
    public static void main (String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> colletion = videoCollector.getCollection();



        Flight flight = new Flight("Warsaw","Dublin");

        FlightFinder flightFinder = new FlightFinder();
        //flightFinder.findFlight(flight);
    }

}
