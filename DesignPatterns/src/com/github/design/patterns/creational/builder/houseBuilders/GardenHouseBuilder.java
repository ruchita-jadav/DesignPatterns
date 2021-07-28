package com.github.design.patterns.creational.builder.houseBuilders;

import com.github.design.patterns.creational.builder.house.GardenHouse;

public class GardenHouseBuilder implements HouseBuilder, GardenBuilder {
    GardenHouse gardenHouse;

    @Override
    public void reset() {
        gardenHouse = new GardenHouse();
    }

    @Override
    public void buildWalls(int noOfwalls) {
        gardenHouse.setWalls(noOfwalls);
    }

    @Override
    public void buildDoors(int noOfDoors) {
        gardenHouse.setDoors(noOfDoors);
    }

    @Override
    public void buildWindows(int noOfWindows) {
        gardenHouse.setWindows(noOfWindows);
    }

    @Override
    public void buildStaffRoom(int noOfRooms) {
        gardenHouse.setStaffRooms(noOfRooms);
    }

    @Override
    public void buildOpenTerrace(int noOfTerrace) {
        gardenHouse.setOpenTerraces(noOfTerrace);
    }

    @Override
    public void buildGardens(String garden) {
        gardenHouse.setGarden(garden);
    }

    public GardenHouse getResult() {
        return gardenHouse;
    }
}
