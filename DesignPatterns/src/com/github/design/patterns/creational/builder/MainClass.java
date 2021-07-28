package com.github.design.patterns.creational.builder;

import com.github.design.patterns.creational.builder.constants.Constants;
import com.github.design.patterns.creational.builder.director.HouseBuildingDirector;
import com.github.design.patterns.creational.builder.houseBuilders.GardenHouseBuilder;
import com.github.design.patterns.creational.builder.houseBuilders.SimpleHouseBuilder;
import com.github.design.patterns.creational.builder.houseBuilders.SwimmingPoolHouseBuilder;

public class MainClass {

    public static void main(String[] args) {
        gardenHouse();
        simpleHouse();
        swimmingPoolHouse();
    }

    private static void swimmingPoolHouse() {
        SwimmingPoolHouseBuilder swimmingPoolHouseBuilder = new SwimmingPoolHouseBuilder();
        swimmingPoolHouseBuilder.reset();
        swimmingPoolHouseBuilder.buildDoors(2);
        swimmingPoolHouseBuilder.buildWalls(8);
        swimmingPoolHouseBuilder.buildWindows(2);
        System.out.println(swimmingPoolHouseBuilder.getResult());
        swimmingPoolHouseBuilder.buildSwimmingPool("Swimming pool in backyard.");
        System.out.println(swimmingPoolHouseBuilder.getResult());
    }

    private static void simpleHouse() {
        SimpleHouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        HouseBuildingDirector director = new HouseBuildingDirector(simpleHouseBuilder);
        director.buildHouse(Constants.House_Type.HOUSE_WITH_OPEN_TERRACE);
        System.out.println(simpleHouseBuilder.getResult().toString());
        director.buildHouse(Constants.House_Type.HOUSE_WITH_STAFF_ROOM);
        System.out.println(simpleHouseBuilder.getResult().toString());
        simpleHouseBuilder.buildOpenTerrace(2);
        System.out.println(simpleHouseBuilder.getResult().toString());
    }

    private static void gardenHouse() {
        GardenHouseBuilder builder = new GardenHouseBuilder();
        builder.reset();
        builder.buildDoors(2);
        builder.buildWalls(8);
        builder.buildWindows(2);
        System.out.println(builder.getResult());
        builder.buildGardens("Front Garden with fountain.");
        System.out.println(builder.getResult());
    }
}
