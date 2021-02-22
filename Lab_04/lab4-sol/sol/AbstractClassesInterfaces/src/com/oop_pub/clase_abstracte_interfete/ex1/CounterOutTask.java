package com.oop_pub.clase_abstracte_interfete.ex1;

public class CounterOutTask implements Task {

	private static int counter;
	
	@Override
	public void execute() {
		counter++;
		System.out.println("The counter is: " + counter);
	}

}
