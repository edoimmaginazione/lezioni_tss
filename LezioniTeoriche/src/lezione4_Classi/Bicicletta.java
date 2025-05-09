package lezione4_Classi;

public class Bicicletta {
//in questo caso sto direttamente assegnando delle proprietàà
	final byte numeroRuote = 2;
	byte marcia = 1;
	int frequenza = 0;
	double velocita = 0;
	
	String marca = "Cannondale";
	String modello = "C-BIKE";
	String tipoBici = new String ("stradale");
	
	//in questo caso il costruttore me lo posso risparmiare
	
	

	public void accelera (int incFrequenza) {
		
		frequenza += incFrequenza;
		System.out.println("Stai accelerando. la frequenza attuale è " + frequenza);
		
	}
	
	
	public void rallenta ( int incFrequenza) {
		frequenza -= incFrequenza;
		System.out.println("stai rallentando. la frequenza attuale è"  + frequenza);
		
	}
	
	public void calcolaVelocita() {
		velocita = frequenza*marcia;
		System.out.println("la tua vel attuale è" + velocita);
		
	}


	@Override
	public String toString() {
		return "Bicicletta [numeroRuote=" + numeroRuote + ", marcia=" + marcia + ", frequenza=" + frequenza
				+ ", velocita=" + velocita + ", marca=" + marca + ", modello=" + modello + ", tipoBici=" + tipoBici
				+ "]";
	}
	
	
	
}
