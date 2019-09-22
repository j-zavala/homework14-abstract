package com.Household;

public class Dog extends Pet {
    private String name;

    public Dog(String name,String fedTypesOfFood, boolean isGroomed, String playLocation) {
        super(fedTypesOfFood, isGroomed, playLocation);
        this.name = name;

    }
    public Dog (String name){
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
