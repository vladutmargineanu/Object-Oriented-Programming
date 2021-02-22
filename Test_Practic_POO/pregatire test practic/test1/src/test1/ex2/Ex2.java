package test1.ex2;

public class Ex2 {
	// NU FACETI ALTE MODIFICARI SEMNIFICATIVE CLASEI FACTORY
	class Factory {
		// Creati un container de obiecte
		
		
		// Modificati metoda dupa cum considerati
		void create(? instance) {
			
		}
	}
	
	// NU MODIFICATI ACEASTA CLASA
	abstract class Turing {
		abstract String calculus();
	}
	
	// Modificati dupa cum considerati
	class Laptop {
		
	}
	
	// Modificati dupa cum considerati
	class Tableta {
		
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
		
	}
}

