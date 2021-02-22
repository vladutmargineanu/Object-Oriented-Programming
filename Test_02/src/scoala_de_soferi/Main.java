package scoala_de_soferi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNext("stop")){
            Persoana p;
            p = new Persoana(Integer.parseInt(scanner.next()));
            String categorie = scanner.next();
            if(categorie.equals("AM")){
                p.accept(new CategoriaAM());
            }else if(categorie.equals("B")){
                p.accept(new CategoriaB());

            } else{
                p.accept(new CategoriaC());
            }
        }
        scanner.close();
    }
}
