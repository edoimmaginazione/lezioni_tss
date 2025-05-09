package lezione3_Metodi;

import java.util.Scanner;

public class Intro {
	//Metodo: termine legato alla OOP
	// servono a wrappare codice, mettere codice sotto un unico nome
	
	//permettono di scomporre un problema in sottoproblemi.
	
	//re-use del codice
	
	//i metodi statici fanno parte della classe in cui vengono dichiarati
	
	
	/**
	 * SINTASSI:
	 *(modificatore
	 *public static il metood appartiene alla stanza non istanza
	 *
	 *
	 *
	 *
	 *FIRMA DEL METODO:
	 *modificatori, tipo restituito, nome del metodo, argomenti o parametri
	 *rispettivamente
	 *public static, void, main (String[] args)
	 *	 
	 *
	 * body del metodo..
	 * 
	 * OPZIONALE:
	 * return qualcosa; il return sostituisce qualcosa
	 *
	 * 
	 * 
	 */
	
	
	
	public static void main (String[] args) {
	
		System.out.println("Ciao dal metodo main");
		
		//richiamo salutaUser(). uso la logica funzioanle
		salutaUser();
		
		//al metood sotto devo passare un argomento, o parametro/i
		salutaDocente("PIERPAOLO", "pierangela", 61);
		salutaDocente("topolino", "paperino");
		salutaDocente("anna lazni");
		salutaDocente();
		
		
	}
		
		//qyesto è un metodo
		public static void salutaUser() {
			//Dentro il metood la logica sarà sempre imperativo/procedurale
			

			System.out.println("ciao fabiolo");
			System.out.println("cognome?");
            Scanner in = new Scanner(System.in);
			System.out.println("ciao fabiolo " + in.nextLine());

		}
		
		
	
	
		public static void salutaDocente(String nomeDoc, String cognomeDoc) {
			System.out.println("Buongiorno docente " + nomeDoc + " " + cognomeDoc);
		}
			
			
			
			//OVERLOADING; sovraccarico del metodo per poter avere più o meno parametri
			public static void salutaDocente(String nomeDoc, String cognomeDoc, int etaDoc) {
				
				System.out.println("Esimio docente " + nomeDoc + " " + cognomeDoc + " adesso so quanti anni hai");
				int etaPensione = 65;
				int anniRestanti = etaPensione - etaDoc;
				System.out.println("Le mancano " + ++anniRestanti + " anni al funerale");
				
			
				
				
			
		}
	
			
			public static void salutaDocente(String nomeCognome) {
				System.out.println("Buongiorno docente " + nomeCognome);
				
				
				
			}
			
			
			
			public static void salutaDocente() {
				System.out.println("buongiorno docente");
				
			}

	
	                                                                                                                                                                                                                                                                        

}
