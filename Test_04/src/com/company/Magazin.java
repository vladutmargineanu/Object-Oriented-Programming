package Magazin;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface Visitable {
    void accept( Visitor visitor );
  }


interface Visitor {
    /*
      * TODO:
      * Add signatures of methods here in order to implement
      * Double Dispatch
      */
      void visit(VisitableClass cumparator);
      
      void visit(Client client);
      
     void visit(ClientFidel clientFidel);
      
      void visit(Angajat angajat);
      
      
  }

class EuroVisitor implements Visitor {
    
    public void visit(VisitableClass cumparator){
        
    }
    
    public void visit(Client client){
        Double rezultat = client.money * 4.6;
        
        int bani = rezultat.intValue();
        System.out.println("Client: " + bani + " lei");
    }
    
   public void visit(ClientFidel clientFidel){
       Double rezultat = clientFidel.money * 4.6;
       
       Double rezultatTotal = rezultat -rezultat * clientFidel.procent;
      
       
       int bani = rezultatTotal.intValue();
       System.out.println("Client Fidel: " + bani + " lei");
   }
    
    public void visit(Angajat angajat){
        Double rezultat = angajat.money * 4.6;
        
        Double rezultatTotal = rezultat -rezultat * angajat.procent;
       
        
        int bani = rezultatTotal.intValue();
        System.out.println("Angajat: " + bani + " lei");
    }
    
    
    
}



class LeiVisitor implements Visitor {
    
    public void visit(VisitableClass cumparator){
        
    }
    
    public void visit(Client client){
        System.out.println("Client: " + client.money + " lei");
    }
    
   public void visit(ClientFidel clientFidel){
       Double rezultat = clientFidel.money - clientFidel.money * clientFidel.procent;
       int bani = rezultat.intValue();
       System.out.println("Client Fidel: " + bani + " lei");
   }
    
    public void visit(Angajat angajat){
        Double rezultat = angajat.money - angajat.money * angajat.procent;
        int bani = rezultat.intValue();
        System.out.println("Angajat: " + bani + " lei");
    }
    
    
    
}

class LireVisitor implements Visitor {
    
    public void visit(VisitableClass cumparator){
        
    }
    
    public void visit(Client client){
        Double rezultat = client.money * 5.2;
        
        int bani = rezultat.intValue();
        System.out.println("Client: " + bani + " lei");
    }
    
   public void visit(ClientFidel clientFidel){
       Double rezultat = clientFidel.money * 5.2;
       
       Double rezultatTotal = rezultat -rezultat * clientFidel.procent;
      
       
       int bani = rezultatTotal.intValue();
       System.out.println("Client Fidel: " + bani + " lei");
   }
    
    public void visit(Angajat angajat){
        Double rezultat = angajat.money * 5.2;
        
        Double rezultatTotal = rezultat -rezultat * angajat.procent;
       
        
        int bani = rezultatTotal.intValue();
        System.out.println("Angajat: " + bani + " lei");
    }
    
    
    
}


class VisitableClass implements Visitable {
    
    public int money;
    
    public VisitableClass(int money){
        this.money = money;
    }
    
 public void accept( Visitor visitor ){
       visitor.visit(this);
  }
 
   
    public void accept( EuroVisitor euro ){
      euro.visit(this);
   }
    
    public void accept( LeiVisitor lei ){
        lei.visit(this);
     }
    
    public void accept( LireVisitor lire ){
        lire.visit(this);
     }
    
    
}


class Client extends VisitableClass {
    
    
    
    public Client(int money){
       super(money);
    }
    
    public void accept( Visitor visitor ){
        visitor.visit(this);
   }
  
    
     public void accept( EuroVisitor euro ){
       euro.visit(this);
    }
     
     public void accept( LeiVisitor lei ){
         lei.visit(this);
      }
     
     public void accept( LireVisitor lire ){
         lire.visit(this);
      }
    
}


class ClientFidel extends VisitableClass {
    
    public double procent = 0.1;
    
    public ClientFidel(int money){
       super(money);
    }
    
    public void accept( Visitor visitor ){
        visitor.visit(this);
   }
  
    
     public void accept( EuroVisitor euro ){
       euro.visit(this);
    }
     
     public void accept( LeiVisitor lei ){
         lei.visit(this);
      }
     
     public void accept( LireVisitor lire ){
         lire.visit(this);
      }
    
    
}

class Angajat extends VisitableClass {
    
    public double procent = 0.15;
    
    public Angajat(int money){
       super(money);
    }
    
    public void accept( Visitor visitor ){
        visitor.visit(this);
   }
  
    
     public void accept( EuroVisitor euro ){
       euro.visit(this);
    }
     
     public void accept( LeiVisitor lei ){
         lei.visit(this);
      }
     
     public void accept( LireVisitor lire ){
         lire.visit(this);
      }
    
    
}



public class Magazin {

    public static void main(String[] args) {
      

       
        HashMap<String, Visitor> visitors = new HashMap<>();
     
        visitors.put("euro", new EuroVisitor());
        visitors.put("lei", new LeiVisitor());
        visitors.put("lire", new LireVisitor());
        
      
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("stop")) {
            
            VisitableClass client;
            
           String type = scanner.next();
           if(type.equals("client")){
               client = new Client(Integer.parseInt(scanner.next()));
               Visitor visitor = visitors.get(scanner.next());
               client.accept(visitor);
           } else if(type.equals("clientfidel")){
               client = new ClientFidel(Integer.parseInt(scanner.next()));
               Visitor visitor = visitors.get(scanner.next());
               client.accept(visitor);
           } else if(type.equals("angajat")){
               client = new Angajat(Integer.parseInt(scanner.next()));
               Visitor visitor = visitors.get(scanner.next());
               client.accept(visitor);
           }
            
            
          
        }
        scanner.close();
        
        
        
    }

}


//client 20 euro
//clientfidel 20 euro
//angajat 20 euro
//stop