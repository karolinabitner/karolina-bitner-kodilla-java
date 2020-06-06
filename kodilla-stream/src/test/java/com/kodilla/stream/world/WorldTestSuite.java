package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent();
        Country poland = new Country(new BigDecimal("80996685"));
        Country germany = new Country(new BigDecimal("66259012"));
        Country unitedKingdom = new Country(new BigDecimal("63742977"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(unitedKingdom);

        Continent asia = new Continent();
        Country china = new Country(new BigDecimal("1343239923"));
        Country japan = new Country(new BigDecimal("1205073612"));
        Country thailand = new Country(new BigDecimal("248645008"));
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(thailand);

        Continent africa = new Continent();
        Country kenya = new Country(new BigDecimal("195875237"));
        Country marocco = new Country(new BigDecimal("107534882"));
        Country egypt = new Country(new BigDecimal("99375741"));
        africa.addCountry(kenya);
        africa.addCountry(marocco);
        africa.addCountry(egypt);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("3410743077");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
