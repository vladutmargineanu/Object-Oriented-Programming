import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * NU AVETI NEVOIE DE MAI MULTE INSTANTE ALE UNUI TIP DE FACTORY => aplicam Singleton pe clasa Factory
 * 
 * Ce face Factory (aka Factory Pattern)?
 * R: ne ajuta sa cream pe baza unui fisier de intrare (de preferat) mai multe obiecte de tipul respectiv
 * R2: ne ajuta sa tinem o evidenta a obiectelor create in niste liste pe care le stocam intern
 * 
 * Putem crea doar obiecte cu Factory sau putem apela si metode daca asta vrem sa facem?
 * Hint tema ;) ;)
 *
 */
public class Factory {
	private static Factory instance;
	
	// chestii publice doar date ca exemplu .. don't do this, always use getters and setters
	public int a;
	public List<Car> carList = new ArrayList<Car>();
	
	private Factory() {
		
	}
	
	public static Factory getInstance() {
		if(instance == null) {
			return new Factory();
		}
		
		return new Factory();
	}
	
	public Car createClasses(String nume) {
		switch(nume) {
		case "DACIA":
			return new Dacia();
		case "BMW":
			return new BMW();
		default:
			return new Car();
		}
	}
	
	// overload
	public Car createClasses(String nume, int nr_bujii) {
		switch(nume) {
		case "DACIA":
			carList.add(new Dacia(nr_bujii));
		case "BMW":
			return new BMW(nr_bujii);
		default:
			return new Car();
		}
	}	
	
	public static void main(String[] args) {
		int n = 5; // exemplu didactic (presupuneti ca e citit din fisier cu sc.nextInt() )
		Scanner sc = new Scanner(System.in);
		
		// clasa Factory este construita de tip Singleton
		// observati cum accesam instanta acestei clase
		// good practice: intotdeauna returnati instanta printr-o metoda
		Factory factory = Factory.getInstance();
		
		/**
		 * Deschidere/ scriere/ citire (in/din) fisier mereu in try-catch-uri.
		 * Altfel? Eroare. (Plz don't tell daddy I was an UnhandledException)
		 */
		
		//FileReader fr = new FileReader(new File("fisier.in")); -> astea dau eroare fara try-catch
		try {
			
			File f = new File("fisier.in"); // astea nu dau eroare/ warning fara try-catch
			Scanner scanner = new Scanner(f);
			
		}catch(IOException e) { // exceptii in ordinea inversa in ierarhie
								// (de la cele mai specifice spre cele mai generale)
		}catch(Exception e) {
			e.printStackTrace();
		}finally { // indiferent daca prinde o exceptie sau se executa ramura try fara
				   // erori, se intra pe finally si se executa codul de aici
			System.out.println("this is how you deal with input in java");
		}
		
		for(int i = 0 ; i < n; ++i) {
			// citim cate o linie si presupunem ca este de tipul "DACIA" sau "BMW"
			String str = sc.next();

			// cream instante pe baza citirii
			factory.createClasses(str);
		}
	}
}
