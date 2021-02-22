package com.oop_pub.clase_abstracte_interfete.ex5;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import com.oop_pub.clase_abstracte_interfete.ex3.Strategy;
import com.oop_pub.clase_abstracte_interfete.ex4.AbstractClassRunner;

public class CountTaskRunner extends AbstractClassRunner {
    private int counter;

    public CountTaskRunner(Strategy strategy) {
        super(strategy);

        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    protected void afterExecution(Task task) {
        counter++;
    }
}
