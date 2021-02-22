package com.oop_pub.clase_abstracte_interfete.ex4;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import com.oop_pub.clase_abstracte_interfete.ex2.Container;
import com.oop_pub.clase_abstracte_interfete.ex3.ContainerFactory;
import com.oop_pub.clase_abstracte_interfete.ex3.Strategy;

public abstract class AbstractTaskRunner {

	private Container container;

    protected AbstractTaskRunner(Strategy strategy) {
        container = ContainerFactory.INSTANCE.createContainer(strategy);
    }

    public void addTask(Task task) {
        container.push(task);
    }

    public void executeAll() {
        while (!container.isEmpty()) {
            Task task = container.pop();

            task.execute();

            afterExecution(task);
        }
    }

    protected abstract void afterExecution(Task task);

}
