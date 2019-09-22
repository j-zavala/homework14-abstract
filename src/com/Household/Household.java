package com.Household;


public class Household implements CondoBuilding{
    private int salary;
    private int propertyTax;
    private boolean ownsPet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private Pet pet;

    public Household(int salary, int propertyTax, boolean ownsPet,Pet pet){
        this.salary = salary;
        this.propertyTax = propertyTax;
        this.ownsPet = ownsPet;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Household{" +
                "salary:" + salary +
                ", propertyTax: " + propertyTax +
                ", ownsPet: " + ownsPet +
                ", pet: " + pet +
                '}';
    }

    //implementing methods interface from condo building
    @Override
    public int earnIncome(int salary) {
        return 80_000;
    }


    @Override
    public int payTaxes(int propertyTax) {
        return 16_000;
    }

    @Override
    public boolean hasPet() {
        return true;
    }
}


//    private int salary;
//    private int propertyTax;
//    private boolean ownsPet;
//
//    public Household(int salary, int propertyTax, boolean ownsPet){
//        this.salary = salary;
//        this.propertyTax = propertyTax;
//        this.ownsPet = ownsPet;
//    }
//    //getters
//    public int getSalary(){
//        return this.salary;
//    }
//    public int getPropertyTax(){
//        return this.propertyTax;
//    }
//    public boolean getOwnsPet(){
//        return this.ownsPet;
//    }
//    //setters
//    public void setSalary(int salary){
//        this.salary = salary;
//    }
//
//    public void setPropertyTax(int propertyTax){
//        this.propertyTax = propertyTax;
//    }
//    public void setOwnsPet(boolean ownsPet){
//        this.ownsPet = ownsPet;
//    }
