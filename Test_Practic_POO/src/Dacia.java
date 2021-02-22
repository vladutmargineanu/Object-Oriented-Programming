import java.util.Scanner;

public class Dacia extends Car implements Remorca {
	
	public Dacia() {
	}
	
	public Dacia(int nrBujii) {
		// stiu ... foarte inteligent exemplul
		this.nrBujii = nrBujii;
	}
	
	/**
	 * Asa adaugati JavaDoc in codul vostru.
	 * 
	 * O sa observati ca va apare in partea de jos, langa consola, impreuna cu semnatura metodei
	 */
	public void method() {
//		nr_roti++;
		System.out.println(nr_roti);
	}
	
	public static int a = 7;
	
	/**
	 * Block static
	 */
	static {
		// se va apela independent constructor, spre deosebire de cum faceau block-urile obisnuite
		
		// daca nu creati o instanta a clasei, de ex daca aveti o clasa doar cu membrii si metode statice,
		// puteti folosi acest gen de block-uri pentru initializarea membrilor/ apelarea metodelor daca este cazul
		
		// in loc sa faceti in main toate initializarile fieldurilor
		a = 7;
		
		// sau
		
		Scanner sc = new Scanner("fisier.in");
		a = sc.nextInt();
		
		// nu uitati sa inchideti mereu streamurile de citire/ scriere
		sc.close();
	}
}
