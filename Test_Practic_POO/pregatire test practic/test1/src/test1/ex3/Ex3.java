package test1.ex3;

public class Ex3 {
	// NU MODIFICATI
	interface ComputerPart {
		// Modificati semnatura metodei cum considerati
		public void accept(? visitor);
	}
	// NU MODIFICATI
	
	// NU MODIFICATI
	interface ComputerPartVisitor {
		public void visit(Mouse mouse);
		public void visit(Keyboard keyboard);
		public void visit(Monitor monitor);
	}
	// NU MODIFICATI
	
	// Nu aveti voie sa creati alte clase sau interfete
	// Adaugati orice METODA necesara aici:
	
	
	// NU MODIFICATI
	class Mouse implements ComputerPart {
		// Modificati cum considerati
	}
	// NU MODIFICATI
	class Keyboard implements ComputerPart {
		// Modificati cum considerati
	}
	// NU MODIFICATI
	class Monitor implements ComputerPart {
		// Modificati cum considerati
	}
	// NU MODIFICATI
	
	public static void main(String[] args) {
		// Modificati cu incredere
	}
}