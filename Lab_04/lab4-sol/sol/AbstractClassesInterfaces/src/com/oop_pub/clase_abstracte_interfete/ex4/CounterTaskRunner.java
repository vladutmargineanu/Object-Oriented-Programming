package com.oop_pub.clase_abstracte_interfete.ex4;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import com.oop_pub.clase_abstracte_interfete.ex3.Strategy;

public class CounterTaskRunner extends AbstractTaskRunner {
	
	private int counter;

    public CounterTaskRunner(Strategy strategy) {
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
