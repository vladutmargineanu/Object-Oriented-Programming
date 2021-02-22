package com.oop_pub.clase_abstracte_interfete.ex2;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;

public class Queue extends AbstractContainer {

	public Queue() {
        super();
    }

    @Override
    public Task pop() {
        if (getContainer().isEmpty()) {
            return null;
        }

        Task first = getContainer().remove(0);

        return first;
    }

}
