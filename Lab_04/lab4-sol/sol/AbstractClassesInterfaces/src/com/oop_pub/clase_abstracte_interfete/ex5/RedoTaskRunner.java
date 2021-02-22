package com.oop_pub.clase_abstracte_interfete.ex5;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import com.oop_pub.clase_abstracte_interfete.ex2.Container;
import com.oop_pub.clase_abstracte_interfete.ex3.ContainerFactory;
import com.oop_pub.clase_abstracte_interfete.ex3.Strategy;
import com.oop_pub.clase_abstracte_interfete.ex4.AbstractClassRunner;

public class RedoTaskRunner extends AbstractClassRunner {
    private Container reversedContainer;

    public RedoTaskRunner(Strategy strategy) {
        super(strategy);
        reversedContainer = ContainerFactory.INSTANCE.createContainer(Strategy.LIFO);
    }

    public void redo() {
        while (!reversedContainer.isEmpty())
            reversedContainer.pop().execute();
    }

    @Override
    protected void afterExecution(Task task) {
        reversedContainer.push(task);
    }
}
