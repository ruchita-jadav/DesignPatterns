package com.github.design.patterns.creational.builder.house;

public class SwimmingPoolHouse extends House {

    String swimmingPool;

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSwimmingPool : " + swimmingPool;
    }
}
