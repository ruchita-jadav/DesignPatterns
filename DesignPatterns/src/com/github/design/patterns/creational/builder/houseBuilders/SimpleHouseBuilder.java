package com.github.design.patterns.creational.builder.houseBuilders;

import com.github.design.patterns.creational.builder.house.House;

public class SimpleHouseBuilder implements HouseBuilder {

    House house;

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildWalls(int noOfwalls) {
        house.setWalls(noOfwalls);
    }

    @Override
    public void buildDoors(int noOfDoors) {
        house.setDoors(noOfDoors);
    }

    @Override
    public void buildWindows(int noOfWindows) {
        house.setWindows(noOfWindows);
    }

    @Override
    public void buildStaffRoom(int noOfRooms) {
        house.setStaffRooms(noOfRooms);
    }

    @Override
    public void buildOpenTerrace(int noOfTerrace) {
        house.setOpenTerraces(noOfTerrace);
    }

    public House getResult() {
        return house;
    }
}
