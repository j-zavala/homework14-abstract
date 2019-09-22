package com.Household;

public class Cat extends Pet{
    private String name;

    public Cat(String name,String fedTypesOfFood, boolean isGroomed, String playLocation) {
        super(fedTypesOfFood, isGroomed, playLocation);
        this.name = name;

    }
    public Cat (String name){
        super(name);
        this.name = name;
    }
    @Override
    public String fedTypesOfFood(String type) {
        return type;
    }

    @Override
    public boolean isGroomed() {
        return true;
    }

    @Override
    public String playLocation(String location) {
        return location;
    }
    @Override
    public String toString() {
        return  name ;
    }
}
