package com.company;

public class Caine extends Animal {
    //supraincarcare
    public void eat(int a, int b, char c){

    }
    public int eat(double a, Integer b){
        return 0;

    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("Caine mananca!");
    }
    public void afisare(){
        System.out.println(this.numar2);
    }

}
