package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsFrom("Warszawa");
        assertEquals(1,flights.size());

    }

    @Test
    void findFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsTo("Berlin");
        assertEquals(2,flights.size());
    }
}