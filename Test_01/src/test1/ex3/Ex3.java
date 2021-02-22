package test1.ex3;

public class Ex3 {
	// NU MODIFICATI
	interface ComputerPart {
		// Modificati semnatura metodei cum considerati
		void accept(ComputerPartVisitor visitor);
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

    public static ComputerPartVisitor getInstance(){

	    return new ComputerPartVisitor(){
	        @Override
            public void visit(Mouse mouse){
                System.out.println("mouse visited");

            }
            @Override
            public void visit(Keyboard keyboard){
                System.out.println("keyboard visited");
            }
            @Override
            public void visit(Monitor monitor){
                System.out.println("monitor visited");
            }

        }

    }

	
	
	// NU MODIFICATI
	static class Mouse implements ComputerPart {
		// Modificati cum considerati
        @Override

        void accept(ComputerPartVisitor visitor){
            visitor.visit(this);

        }

	}
	// NU MODIFICATI
	static class Keyboard implements ComputerPart {
		// Modificati cum considerati
        @Override

        void accept(ComputerPartVisitor visitor){
            visitor.visit(this);

        }
	}
	// NU MODIFICATI
	static class Monitor implements ComputerPart {
		// Modificati cum considerati
        @Override

        void accept(ComputerPartVisitor visitor){
            visitor.visit(this);

        }
	}
	// NU MODIFICATI
	
	public static void main(String[] args) {
		// Modificati cu incredere
        ComputerPartVisitor visitor = getInstance();

        List<ComputerPart> myList = new LinkedList<ComputerPart>();
        myList.add(new Mouse());
        myList.add(new Monitor());
        myList.add(new Keyboard());

        for(ComputerPart visited : myList){
            visited.accept(visitor);
        }

	}
}