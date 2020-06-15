package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flights {
    public findFlight(Flight flight) throws RouteNotFundException{
        Map<String, Boolean> map = new HashMap<>();
        map.put("Berlin", true);
        map.put("London", true);
        map.put("Paris", false);
        map.put("NYC", false);
        map.put("Rome", true);
    }
    public static void main(String[] args){
        Flight flight1 = new Flight("Berlin", "Warsaw");
        Flight flight2 = new Flight("London", "Berlin");
        Flight flight3 = new Flight("Paris", "NYC");

        Flights flights = new Flights();

        try {
            System.out.println("Paris - Warsaw");
            System.out.println(flights.findFlight(flight1));
        } catch (RouteNotFundException e){
            System.out.println(e.getMessage());
        }
    }

}
