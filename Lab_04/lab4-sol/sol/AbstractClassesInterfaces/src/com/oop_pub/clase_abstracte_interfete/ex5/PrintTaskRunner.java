package com.oop_pub.clase_abstracte_interfete.ex5;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import com.oop_pub.clase_abstracte_interfete.ex3.Strategy;
import com.oop_pub.clase_abstracte_interfete.ex4.AbstractClassRunner;

import java.util.Date;

public class PrintTaskRunner extends AbstractClassRunner {

    public PrintTaskRunner(Strategy strategy) {
        super(strategy);
    }

    @Override
    protected void afterExecution(Task task) {
        System.out.println("Task-ul s-a executat la ora: " + new Date().toString());
    }
}
