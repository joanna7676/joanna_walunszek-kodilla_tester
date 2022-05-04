package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        FlightRepository flightRepository = new FlightRepository();

        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightRepository.getFlights()) {
            if (flight.getDeparture().equals(departure)) {
                result.add(flight);
            }
        }
        return result;
    }
    public List<Flight> findFlightsTo(String arrival) {
        FlightRepository flightRepository = new FlightRepository();

        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightRepository.getFlights()) {
            if (flight.getArrival().equals(arrival)) {
                result.add(flight);
            }
        }
        return result;
    }
}
