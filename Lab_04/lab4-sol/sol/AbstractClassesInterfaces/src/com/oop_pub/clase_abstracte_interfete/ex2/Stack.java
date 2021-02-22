package com.oop_pub.clase_abstracte_interfete.ex2;

import com.oop_pub.clase_abstracte_interfete.ex1.Task;

public class Stack extends AbstractContainer {
	
	public Stack() {
        super();
    }

    @Override
    public Task pop() {
        if (getContainer().isEmpty()) {
            return null;
        }

        Task last = getContainer().remove(getContainer().size() - 1);

        return last;
    }
	
}
