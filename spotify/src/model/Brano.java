package model;

public class Brano {


	public int minuti;
	public int secondi;
		boolean play = false;


	String autore;
	public String titolo;
	String genere;	
	String durata; 
//costruttore
	public Brano(int minuti, int secondi, String autore, String titolo, String genere) {
		this.durata = minuti + ":" + secondi;
		this.autore = autore;
		this.titolo = titolo;
		this.genere = genere;
	}



	 public void play() {
		
	        
		 if (play){
		 
		  System.out.println("Riproduzione: " + titolo + " - Durata: " + durata);
	        
	    } else { 
			  System.out.println("Nessun brano in riproduzione"); }

	 
}



	public void stampaInfo() {
	        System.out.println("Titolo: " + titolo);
	        System.out.println("Autore: " + autore);
	        System.out.println("Genere: " + genere);
	        System.out.println("Durata: " + durata);


	}







}
