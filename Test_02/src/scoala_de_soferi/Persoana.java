package scoala_de_soferi;

public class Persoana implements Visitable {
    int age;
    public Persoana(int age){
        this.age = age;
    }

    public void accept(Visitor v){
        v.visit(this);

    }

    public void accept(CategoriaAM v){
        v.visit(this);

    }

    public void accept(CategoriaB v){
        v.visit(this);

    }

    public void accept(CategoriaC v){
        v.visit(this);

    }
}
