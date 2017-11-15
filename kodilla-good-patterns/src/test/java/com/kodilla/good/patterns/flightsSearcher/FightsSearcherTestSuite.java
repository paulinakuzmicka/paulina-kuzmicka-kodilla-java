package com.kodilla.good.patterns.flightsSearcher;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FightsSearcherTestSuite {

    private static FlightsService flightsService;
    private static FlightsDb flightsDbMock;
    private static Set<Flight> availableFlights;

    @BeforeClass
    public static void beforeClass() {
        flightsDbMock = mock(FlightsDb.class);
        flightsService = new FlightsService(flightsDbMock);
        availableFlights = new HashSet<>();
        availableFlights.add(new Flight("WRO", "WAR"));
        availableFlights.add(new Flight("WAR", "GDA"));
        availableFlights.add(new Flight("WRO", "NYC"));
        availableFlights.add(new Flight("GDA", "NYC"));
        availableFlights.add(new Flight("WAR", "NYC"));
    }

    @Test
    public void availableFlightsFromTest() {
        //Given
        String arrivalAirport = "WRO";
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("WRO", "WAR"));
        expected.add(new Flight("WRO", "NYC"));
        //When
        when(flightsDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = flightsService.availableFlightsFrom(arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void noAvailableFlightsFromTest() {
        //Given
        String arrivalAirport = "NYC";
        Set<Flight> expected = new HashSet<>();
        //When
        when(flightsDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = flightsService.availableFlightsFrom(arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void availableFlightsToTest() {
        //Given
        String departureAirport = "NYC";
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("WRO", "NYC"));
        expected.add(new Flight("GDA", "NYC"));
        expected.add(new Flight("WAR", "NYC"));
        //When
        when(flightsDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = flightsService.availableFlightsTo(departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void noAvailableFlightsToTest() {
        //Given
        String departureAirport = "WRO";
        Set<Flight> expected = new HashSet<>();
        //When
        when(flightsDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = flightsService.availableFlightsTo(departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void availableConnectingFlightsTest() {
        //Given
        String arrivalAirport = "WRO";
        String departureAirport = "NYC";
        Set<List<Flight>> expected = new HashSet<List<Flight>>();

        List<Flight> wroWarWarGdaGdaNyc = new ArrayList<>();
        wroWarWarGdaGdaNyc.add(new Flight("WRO", "WAR"));
        wroWarWarGdaGdaNyc.add(new Flight("WAR", "GDA"));
        wroWarWarGdaGdaNyc.add(new Flight("GDA", "NYC"));

        List<Flight> wroWarWarNyc = new ArrayList<>();
        wroWarWarNyc.add(new Flight("WRO", "WAR"));
        wroWarWarNyc.add(new Flight("WAR", "NYC"));

        expected.add(wroWarWarGdaGdaNyc);
        expected.add(wroWarWarNyc);
        //When
        when(flightsDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<List<Flight>> result = flightsService.availableConnectingFlights(arrivalAirport, departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }
}
