enum InjectionType {
	DIRECTA, STRATIFICA;
}

interface SpeedUp {
	String makeNoise();
}

public class Car {
	public Engine engine;
	private int noWheels;
	protected int nrBujii;
	
	class Engine {
		public int no_cilindri;
		public int no_valve;
		public InjectionType injectionType;
		
		public Engine(int no_cilindri, int no_valve, InjectionType inj) {
			// pentru aceleasi denumiri de parametri, folosim cuvantul-cheie "this"
			// ca sa putem face atribuirile de valori
			this.no_cilindri = no_cilindri;
			this.no_valve = no_valve;
			
			// nu este nevoie sa folositi "this" daca denumirile difera
			// daca totusi folositi, s-ar putea sa va intrebe la interviuri de ce (no reason at all)
			injectionType = inj;
		}
		
		
		{
			// acest block se va apela automat de jvm dupa constructor
			
			// este ok sa folositi block-uri de genul acesta pentru a grupa codul
			
			// MAI ALES DACA STITI CA NU AVETI NEVOIE DE O METODA SPECIFICA PE CARE SA O APELATI
			// SI IN ALTA PARTE CARE SA FACA EXACT ACELEASI OPERATII
			
			// nu abuzati de astfel de constructii pentru ca nu stiti in ce ordine se vor executa
			// instructiunile daca aveti mai multe astfel de block-uri unul dupa altul
			
			
			// avem acces la membrii private/ protected/ public cat timp suntem in interiorul clasei
			Car.this.noWheels = 4;
			// sau noWheels = 4;
		}
	}
	
	
	public SpeedUp carSpeedUp(final InjectionType inj) {
		if(inj == InjectionType.DIRECTA) {
			// puteti face initializari aici daca aveti nevoie
	
		}
		
		// exemplu de clasa anonima
		return new SpeedUp() {

			@Override
			public String makeNoise() {
				return "My car goes vrrruuuum";
			}
			
		};
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		
		// asa cream o instanta folosind clase anonime
		SpeedUp su = car.carSpeedUp(InjectionType.DIRECTA);
		
		// do something with it...
	}
}
