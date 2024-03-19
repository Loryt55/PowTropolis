package com.alten.animal.model;

import java.time.LocalDate;

public class Tiger extends TailedAnimal {
    public Tiger(String name, String favouriteFood, int age, LocalDate arrivalDateAtZoo, float height, float weight, float tailLength) {
        super(name, favouriteFood, age, arrivalDateAtZoo, height, weight, tailLength);
    }

    @Override
    public String toString() {
        return getName() + "(" + Tiger.class.getSimpleName() + ")";
    }
}


