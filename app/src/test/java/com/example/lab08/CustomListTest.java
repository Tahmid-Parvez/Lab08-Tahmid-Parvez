package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList cities;

    @Test
    public void testHasCity(){

        cities = new CustomList();

        City city = new City("Calgary", "AB");

        cities.addCity(city);

        assert cities.hasCity(city);

    }

    @Test
    public void testDeleteCity(){
        cities = new CustomList();

        City city = new City("Calgary", "AB");

        cities.addCity(city);

        assert cities.hasCity(city);

        cities.deleteCity(city);

        cities.deleteCity(city);

        assert !cities.hasCity(city);

    }

    @Test
    public void testCitiesCount(){

        cities = new CustomList();

        City city = new City("Calgary", "AB");

        cities.addCity(city);

        assert cities.size() == 1;


    }

}
