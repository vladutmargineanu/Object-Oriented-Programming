package scoala_de_soferi;


public class CategoriaAM implements Visitor {
    public void visit(Persoana p){
        if(p.age >= 16){
            System.out.println("Persoana de " + p.age + " se poate inscrie la categoria AM.");
        } else{
            System.out.println("Persoana de " + p.age + " nu se poate inscrie la categoria AM.");

        }
    }
}
