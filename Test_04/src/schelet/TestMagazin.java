package schelet;

import java.util.HashMap;
import java.util.Scanner;


interface Visitable {
    void accept(Visitor visitor);
  }


interface Visitor {
    /*
      * TODO:
      * Add signatures of methods here in order to implement
      * Double Dispatch
      */
      void visit(VisitableClass cumparator);
      
 
      
  }

class EuroVisitor implements Visitor {
    
    public void visit(VisitableClass cumparator){
        
    }
    
 
    
    
    
}


class LeiVisitor implements Visitor {
    
    public void visit(VisitableClass cumparator){
        
    }
    
  
    
    
    
}

class LireVisitor implements Visitor {
    
    public void visit(VisitableClass cumparator){
        
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
    public void accept( LeiVisitor visitor ){
        visitor.visit(this);
    }
 
   
   
    
}


class Client extends VisitableClass {
    
    public Client(int money){
        super(money);
     }
    
  
    
}


class ClientFidel extends VisitableClass {
    
    public double procent = 0.1;
    
    public ClientFidel(int money){
        super(money);
     }
    
    
}

class Angajat extends VisitableClass {
    
    public double procent = 0.15;
    
    public Angajat(int money){
        super(money);
     }
    
    
}


public class TestMagazin {

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


