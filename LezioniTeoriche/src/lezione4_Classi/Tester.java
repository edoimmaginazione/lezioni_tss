package lezione4_Classi;

public class Tester {

	public static void main (String[] args) {
		
	//Creo un istanza della classe persona
		Persona pers1 = new Persona ("Pier", "Bolli", 25, 1.80, " 001 ");
		
		System.out.println(pers1.nome);
		System.out.println(pers1.cognome);
		System.out.println(pers1.eta);
		System.out.println(pers1.altezza);
		System.out.println(pers1.matricola);
		
		
		
		
		
		Canzone canzone1 = new Canzone();
		canzone1.titolo = "Eooo";
		canzone1.cantante = " Bad buny";
		canzone1.durata = 2.8;
				
		System.out.println("Titolo della canzone: " + canzone1.titolo + "-" + canzone1.cantante);
		
		Canzone canzone2 = new Canzone("Bruno Mars", "Marsiano", 3.4);
		System.out.println("Titolo della canzone: " + canzone2.titolo + "-" + canzone2.cantante);
		
		Canzone canzone3 = new Canzone ("mj", "off the wall");
		System.out.println(canzone3.toString());
		
		System.out.println("__________BICICLETTE___________");
		
		
		Bicicletta miaBici = new Bicicletta(); //sto creando una bici col costruttore di defautl
		
	System.out.println("la mia bici è di marca" + miaBici.marca);
	//miaBici.numeroRuote = 273 SBAGLIATO, è una costante (2) dichiarata in Bicicletta come final
	miaBici.marcia = 3;
	miaBici.accelera(100);
	miaBici.rallenta(50);
	miaBici.calcolaVelocita();
	System.out.println(miaBici); //stampare direttamente l'oggetto quando abbiamo un toString lo richiama in automatico
	}
	
	
	
}
