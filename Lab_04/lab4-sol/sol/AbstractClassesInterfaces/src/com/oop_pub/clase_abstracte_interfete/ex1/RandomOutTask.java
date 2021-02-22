package com.oop_pub.clase_abstracte_interfete.ex1;

import java.util.Random;

public class RandomOutTask implements Task {

	private int random;
	
	public RandomOutTask() {
		Random random = new Random();
		this.random = random.nextInt(50) + 1;
	}
	
	@Override
	public void execute() {
		System.out.println("The random number is: " + random);
	}

}
