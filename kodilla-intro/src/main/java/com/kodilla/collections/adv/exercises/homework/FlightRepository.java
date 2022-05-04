package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private List<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Paryz", "Madryt"));
        flights.add(new Flight("Londyn", "Berlin"));
    }
    public List<Flight> getFlights() {
        return flights;
    }
}
