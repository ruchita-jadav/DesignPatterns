package com.github.design.patterns.creational.builder.director;

import com.github.design.patterns.creational.builder.constants.Constants;
import com.github.design.patterns.creational.builder.houseBuilders.HouseBuilder;

public class HouseBuildingDirector {
    private HouseBuilder houseBuilder;

    public HouseBuildingDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * This will build House with default parameters.
     *
     * @param houseType
     */
    public void buildHouse(Constants.House_Type houseType) {
        switch (houseType) {
            case HOUSE:
                houseBuilder.reset();
                houseBuilder.buildWalls(4);
                houseBuilder.buildDoors(1);
                houseBuilder.buildWindows(1);
            case HOUSE_WITH_OPEN_TERRACE:
                houseBuilder.reset();
                houseBuilder.buildWalls(4);
                houseBuilder.buildDoors(1);
                houseBuilder.buildWindows(1);
                houseBuilder.buildOpenTerrace(1);
                break;
            case HOUSE_WITH_STAFF_ROOM:
                houseBuilder.reset();
                houseBuilder.buildWalls(4);
                houseBuilder.buildDoors(1);
                houseBuilder.buildWindows(1);
                houseBuilder.buildStaffRoom(3);
                break;
        }
    }
}
