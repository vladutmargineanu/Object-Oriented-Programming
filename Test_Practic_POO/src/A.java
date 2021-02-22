
public class A {
	// vreti sa puneti constantele (nr magice) la inceput pentru o mai buna organizare a codului
	private static final int MAGIC_NR_1 = 5;
	
	public int nr;
	boolean flag;
	String str;
	
	public void method(final int a, final String str) {
		// asa scapati de eroarea de coding style "Numere magice"
		nr = MAGIC_NR_1;
	}

	// gettere si settere pentru toti membrii (sau field-uri)
	// daca aveti nevoie, desigur -- eclipse/ intellij/ netbeans fac asta
	// pentru voi: click dreapta -> Source -> generate getters and setters
	public int getNr() {
		return nr;
	}


	public void setNr(int nr) {
		this.nr = nr;
	}


	public String getStr() {
		return str;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}

class B {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.nr);
	}
}