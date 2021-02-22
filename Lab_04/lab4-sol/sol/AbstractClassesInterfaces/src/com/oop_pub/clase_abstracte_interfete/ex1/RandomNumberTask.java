package com.oop_pub.clase_abstracte_interfete.ex1;

import java.util.Random;

public class RandomNumberTask implements Task {
    private int random;

    public RandomNumberTask() {
        Random rand = new Random();

        this.random = rand.nextInt(50) + 1;
    }

    @Override
    public void execute() {
        System.out.println("Numarul random este " + random);
    }
}
