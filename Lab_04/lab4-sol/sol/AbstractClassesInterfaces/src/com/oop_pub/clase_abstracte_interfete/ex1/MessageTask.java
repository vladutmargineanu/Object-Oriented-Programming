package com.oop_pub.clase_abstracte_interfete.ex1;

public class MessageTask implements Task {
    private String name;

    public MessageTask(String nume) {
        this.name = nume;
    }

    @Override
    public void execute() {
        System.out.println(name);
    }
}
