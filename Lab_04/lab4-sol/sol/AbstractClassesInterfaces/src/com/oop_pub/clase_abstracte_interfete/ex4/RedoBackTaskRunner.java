package com.oop_pub.clase_abstracte_interfete.ex4;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import com.oop_pub.clase_abstracte_interfete.ex2.Container;
import com.oop_pub.clase_abstracte_interfete.ex3.ContainerFactory;
import com.oop_pub.clase_abstracte_interfete.ex3.Strategy;

public class RedoBackTaskRunner extends AbstractTaskRunner {

	private Container reversedContainer;

    public RedoBackTaskRunner(Strategy strategy) {
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
