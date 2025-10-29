package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private ArrayList<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();

    }

    public boolean hasCity(City city){

        for (int i = 0; i < cities.size(); i ++){
            if (city == cities.get(i)){
                return true;
            }
        }

        return false;
    }
    public void addCity(City city) {
        cities.add(city);
    }

    public void deleteCity(City city){
        cities.remove(city);

    }

    public int size() {
        return cities.size();
    }


    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
