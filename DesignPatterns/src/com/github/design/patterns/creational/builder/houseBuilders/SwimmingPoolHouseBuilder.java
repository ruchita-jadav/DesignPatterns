package com.github.design.patterns.creational.builder.houseBuilders;

import com.github.design.patterns.creational.builder.house.SwimmingPoolHouse;

public class SwimmingPoolHouseBuilder implements HouseBuilder, SwimmingPoolBuilder {
    SwimmingPoolHouse swimmingPoolHouse;

    @Override
    public void reset() {
        swimmingPoolHouse = new SwimmingPoolHouse();
    }

    @Override
    public void buildWalls(int noOfwalls) {
        swimmingPoolHouse.setWalls(noOfwalls);
    }

    @Override
    public void buildDoors(int noOfDoors) {
        swimmingPoolHouse.setDoors(noOfDoors);
    }

    @Override
    public void buildWindows(int noOfWindows) {
        swimmingPoolHouse.setWindows(noOfWindows);
    }

    @Override
    public void buildSwimmingPool(String pool) {
        swimmingPoolHouse.setSwimmingPool(pool);
    }

    @Override
    public void buildStaffRoom(int noOfRooms) {
        swimmingPoolHouse.setStaffRooms(noOfRooms);
    }

    @Override
    public void buildOpenTerrace(int noOfTerrace) {
        swimmingPoolHouse.setOpenTerraces(noOfTerrace);
    }

    public SwimmingPoolHouse getResult() {
        return swimmingPoolHouse;
    }
}
