package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Rzym", "Barcelona"));
        flights.add(new Flight("Praga", "Kopenhaga"));
        flights.add(new Flight("Barcelona", "Warszawa"));
        flights.add(new Flight("Barcelona", "Londyn"));
        return flights;
    }
}
