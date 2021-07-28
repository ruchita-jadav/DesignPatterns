package com.github.design.patterns.creational.builder.house;

public class House {

    int walls;

    int doors;

    int windows;

    int staffRooms;

    int openTerraces;

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getStaffRooms() {
        return staffRooms;
    }

    public void setStaffRooms(int staffRooms) {
        this.staffRooms = staffRooms;
    }

    public int getOpenTerraces() {
        return openTerraces;
    }

    public void setOpenTerraces(int openTerraces) {
        this.openTerraces = openTerraces;
    }

    @Override
    public String toString() {
        return
                "\nWalls : " + walls +
                        "\nDoors : " + doors +
                        "\nWindows : " + windows +
                        "\nOpen Terraces : " + openTerraces +
                        "\nStaff Room : " + staffRooms;
    }
}
