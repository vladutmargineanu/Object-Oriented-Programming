package com.oop_pub.clase_abstracte_interfete.ex4;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import com.oop_pub.clase_abstracte_interfete.ex3.Strategy;
import java.util.Date;

public class PrintTimeTaskRunner extends AbstractTaskRunner {

    public PrintTimeTaskRunner(Strategy strategy) {
        super(strategy);
    }

    @Override
    protected void afterExecution(Task task) {
        System.out.println("The task was executed at the following hour: " + new Date().toString());
    }
	
}
