package com.oop_pub.clase_abstracte_interfete.ex3;

import com.oop_pub.clase_abstracte_interfete.ex2.Container;
import com.oop_pub.clase_abstracte_interfete.ex2.Queue;
import com.oop_pub.clase_abstracte_interfete.ex2.Stack;

public class ContainerFactory implements IFactory {
    public static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    public Container createContainer(Strategy strategy) {
    	if (strategy == Strategy.FIFO) {
            return new Queue();
        }

        if (strategy == Strategy.LIFO) {
            return new Stack();
        }

        return null;
    }
}