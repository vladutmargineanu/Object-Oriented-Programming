package test1.ex2;

public class Ex2 {
	// NU FACETI ALTE MODIFICARI SEMNIFICATIVE CLASEI FACTORY
	class Factory {
		// Creati un container de obiecte

        public List<Turing> myList = new ArrayList<Turing>();

		// Modificati metoda dupa cum considerati
		public static void create(Turing instance) {
		    if(instance instanceof Laptop){
		        instance = new Laptop();
		        myList.add(instance);
            }
            if(instance instanceof Tableta){
                instance = new Tableta();
                myList.add(instance);
            }


        }
	}
	
	// NU MODIFICATI ACEASTA CLASA
	abstract class Turing {
		abstract String calculus();
	}
	
	// Modificati dupa cum considerati
	class Laptop extends Turing{
	    String calculus(){
            System.out.println("Laptop");
            return "Laptop";
        }
		
	}
	
	// Modificati dupa cum considerati
	class Tableta extends Turing{
        String calculus(){
            System.out.println("Tableta");
             return "Tableta";
        }
	}
	
	public static void main(String[] args) {
		// NU MODIFICATI
		Laptop l1;
		Tableta t1;
		// NU MODIFICATI
		Factory.create(l1);
		Factory.create(t1);
		// NU MODIFICATI

		
		// Afisati "Sunt un Laptop" \n
		//		   "Sunt o Tableta"
        for(Turing m:myList){
            m.calculus();
        }
		
	}
}

