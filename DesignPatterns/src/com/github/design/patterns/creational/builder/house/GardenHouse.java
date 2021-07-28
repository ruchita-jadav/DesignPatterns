package com.github.design.patterns.creational.builder.house;

public class GardenHouse extends House {

    String garden;

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGarden : "+ garden;
    }
}
