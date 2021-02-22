package com.oop_pub.clase_abstracte_interfete.ex2;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;
import java.util.ArrayList;

public abstract class AbstractContainer implements Container {

	private ArrayList<Task> container;

    AbstractContainer() {
        container = new ArrayList<Task>(10);
    }

    ArrayList<Task> getContainer() {
        return container;
    }

    @Override
    public void push(Task task) {
        getContainer().add(task);
    }

    @Override
    public int size() {
        return getContainer().size();
    }
    
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void transferFrom(Container container) {
        while (container.isEmpty()) {
            push(container.pop());
        }
    }

}
