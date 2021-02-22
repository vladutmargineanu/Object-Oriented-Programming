package test1.ex1;

public class Ex1 {
	class Singleton {
		// identificati bug-urile si modificati unde e necesar
		Singleton instance;
		
		// identificati bug-urile si modificati metoda
		public Singleton() {
		}
		
		// identificati bug-urile si modificati metoda
		void getInstance() {
		}
	}
	
	// NU MODIFICATI MAIN
	public static void main(String[] args) {
		// ar trebui sa dea eroare la compilare
		Singleton s1 = new Singleton();
		
		// ar trebui sa mearga
		Singleton s2 = Singleton.getInstance();
	}
}
