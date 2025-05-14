package lezione5_RelazionitraClassi;

public class Segmento {
	//Lo stato dellamia classe è fatto da proprietà che non sono più dei tipi primitivi
	Punto a;
	Punto b;
	
	public Segmento (Punto a, Punto b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	public double calcolaLunghezza() {
		double lunghezza = Math.sqrt((b.x - a.x));
		return 0;
	}
	
		
		@Override
		public String toString() {
		    return "Segmento [a=" + a + ", b=" + b + "]"; //quando stampo a e b richiamerà il toString dei due punti
		}

	}
		
	
	
	

