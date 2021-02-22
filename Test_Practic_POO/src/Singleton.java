/**
 * 
 * Incercati sa folositi numai acest tip de declarare a clasei Singleton
 *
 */
public class Singleton {
	private static Singleton instance;
	public int a;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		}
		
		return new Singleton();
	}
}

class C {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.a = 5;
//		Singleton s2 = new Singleton();  -> genereaza eroare
	}
}