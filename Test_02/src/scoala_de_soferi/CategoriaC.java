package scoala_de_soferi;

public class CategoriaC implements Visitor {
    public void visit(Persoana p){
        if(p.age >= 21){
            System.out.println("Persoana de " + p.age + " se poate inscrie la categoria C.");
        } else{
            System.out.println("Persoana de " + p.age + " nu se poate inscrie la categoria C.");

        }
    }
}
