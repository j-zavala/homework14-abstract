package com.Household;


public class Main {
    public static void main(String args[]) {
        Household household1 = new Household(80_000, 16_000, true, new Dog("Lassie"));
        Household household2 = new Household(60_000, 12_000, true, new Cat("Garfield"));

        System.out.println(household1);
        System.out.println(household2);

    }
}
