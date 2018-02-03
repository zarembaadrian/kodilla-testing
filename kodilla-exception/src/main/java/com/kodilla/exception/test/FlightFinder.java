package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    private HashMap<String,Boolean> findFlight = new HashMap<>();

    public FlightFinder(){
        findFlight.put("Warsaw", true);
        findFlight.put("Berlin", true);
        findFlight.put("Lizbona", false);
        findFlight.put("Paris", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
       Boolean flighter = findFlight.get(flight.getArrivalAirport());
       if(flighter != null) {
           return flighter;
       }
       throw new RouteNotFoundException();
    }

    public void addFlight(Flight flight) {
        findFlight.put(flight.getArrivalAirport(),true);
    }
}
