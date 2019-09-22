package com.Household;

abstract class Pet {
    private String name;

    public Pet(String fedTypesOfFood, boolean isGroomed, String playLocation) {
        this.fedTypesOfFood = fedTypesOfFood;
        this.isGroomed = isGroomed;
        this.playLocation = playLocation;
    }
    public Pet(String name){
        this.name = name;
    }

    private String fedTypesOfFood;
    private boolean isGroomed;
    private String playLocation;


    public abstract String fedTypesOfFood(String type);
    public abstract boolean isGroomed();
    public abstract String playLocation(String location);

}
