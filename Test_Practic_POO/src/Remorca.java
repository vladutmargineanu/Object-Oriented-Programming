enum TypeRemorca {
	BASCULARE, TRANSPORT;
}

public interface Remorca extends Carrier{
	int nr_kg = 2000;
	boolean frane = true;
	TypeRemorca tr = TypeRemorca.BASCULARE;
}
