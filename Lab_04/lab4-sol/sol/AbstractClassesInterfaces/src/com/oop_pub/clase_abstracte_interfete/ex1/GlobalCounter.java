package com.oop_pub.clase_abstracte_interfete.ex1;

public class GlobalCounter implements Task {
    private static int counter = 0;

    @Override
    public void execute() {
        counter++;

        System.out.println("Contor " + counter);
    }
}
