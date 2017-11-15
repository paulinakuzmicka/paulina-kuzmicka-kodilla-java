package com.kodilla.good.patterns.flightsSearcher;

import java.util.List;
import java.util.Set;

public class FlightsService {
    private FlightsDb flightsDb;

    public FlightsService(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }

    public Set<Flight> availableFlightsFrom(String arrivalAirport) {
        return null;
    }

    public Set<Flight> availableFlightsTo(String departureAirport) {
        return null;
    }

    public Set<List<Flight>> availableConnectingFlights(String arrivalAirport, String departureAirport) {
        return null;
    }
}
