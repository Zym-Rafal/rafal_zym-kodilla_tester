package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom_shouldReturnTwoResults () {
        //given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> results = flightFinder.findFlightsFrom("Barcelona");

        //then
        assertEquals(2, results.size());

        List<String> arrivals = new ArrayList<>();
        for (Flight flight : results) {
            arrivals.add(flight.getArrival());
        }

        assertTrue(arrivals.contains("Londyn"));
        assertTrue(arrivals.contains("Warszawa"));

    }

    @Test
    public void testFindFlightsFrom_shouldNotReturnAnyResult () {
        //given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> results = flightFinder.findFlightsFrom("Wilno");

        //then
        assertEquals(0, results.size());
    }

    @Test
    public void testFindFlightsTo_shouldReturnTwoResults () {
        //given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> results = flightFinder.findFlightsTo("Londyn");

        //then
        assertEquals(2, results.size());

        List<String> departures = new ArrayList<>();
        for (Flight flight : results) {
            departures.add(flight.getDeparture());
        }

        assertTrue(departures.contains("Barcelona"));
        assertTrue(departures.contains("Warszawa"));
    }

    @Test
    public void testFindFlightsTo_shouldNotReturnAnyResult () {
        //given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> results = flightFinder.findFlightsTo("Wilno");

        //then
        assertEquals(0, results.size());
    }
}