package scoala_de_soferi;

public class CategoriaB implements Visitor {
        public void visit(Persoana p){
            if(p.age >= 18){
                System.out.println("Persoana de " + p.age + " se poate inscrie la categoria B.");
            } else{
                System.out.println("Persoana de " + p.age + " nu se poate inscrie la categoria B.");

            }
        }

}
