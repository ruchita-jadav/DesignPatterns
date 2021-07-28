package com.github.design.patterns.creational.builder.houseBuilders;

/**
 * Steps to build a House. House would be the outcome/product of this pattern.
 */
public interface HouseBuilder {

    void reset();

    void buildWalls(int noOfwalls);

    void buildDoors(int noOfDoors);

    void buildWindows(int noOfWindows);

    void buildStaffRoom(int noOfRooms);

    void buildOpenTerrace(int noOfTerrace);

}
