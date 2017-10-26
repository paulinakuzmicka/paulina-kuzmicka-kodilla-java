package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent();
        Continent asia = new Continent();
        Continent australia = new Continent();

        Country poland = new Country();
        Country hungary = new Country();
        Country montenegro = new Country();
        Country japan = new Country();
        Country katar = new Country();
        Country vietnam = new Country();
        Country australiaCountry = new Country();
        Country fiji = new Country();

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(australia);

        europa.addCountry(poland);
        europa.addCountry(hungary);
        europa.addCountry(montenegro);

        asia.addCountry(japan);
        asia.addCountry(katar);
        asia.addCountry(vietnam);

        australia.addCountry(australiaCountry);
        australia.addCountry(fiji);

        //When
        BigDecimal totalPeopleExpected = new BigDecimal("8000008");
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
