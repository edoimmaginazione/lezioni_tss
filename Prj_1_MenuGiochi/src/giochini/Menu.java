package giochini;

import java.util.Scanner;

public class Menu {
	
	public static void multipli() {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " BANGARANG");
			}else if(i % 3 == 0) {
				System.out.println(i + " BOOM");
			}else if(i % 5 == 0) {
				System.out.println(i + " ZOOM");
			}else {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner mioScann = new Scanner(System.in);
		char scelta;
		
		do {
			System.out.println("----MENU----");
			System.out.println("1. Gioco1");
			System.out.println("2. Gioco2");
			System.out.println("3. Gioco3");
			System.out.println("Q. Esci");
			System.out.println("----------");
			
			scelta = mioScann.nextLine().charAt(0);
			
			switch(scelta) {
			
			case 'a':
			case 'A':
			case '1':
				System.out.println("Hai scelto il gioco 1 dei multipli");
				//multipli
				//Stampa i numeri da 1 a 100. Per tutti i multipli di 3 stampa BOOM. Per tutti i multipli di 5 stampa ZOOM. Per tutti i multipli di 3 e 5 stampa BANGARANG
				
				//Modo 1: posso scrivere qui dentro tutta la logica
				//Modo 2: posso creare un metodo ausiliare in questa classe
				multipli();
				//Modo 3: posso creare una classe a parte con dei metodi e richiamarli
				
				
				break;
			case '2':
				System.out.println("Hai scelto il gioco 2");
				//pattern
				//Elabora un algoritmo per stampare il seguente Star Pattern
				//
				//				Es4
				//			     *
				//			    * *
				//			   *   *
				//			  *     *
				//			 *********  
				Triangolo.disegnaTriangolo();

				break;
			case '3':
				System.out.println("Hai scelto il gioco 3 - Il gioco della tombola");
				//tombola
				//Ricrea il gioco della tombola. Da un set di 90 numeri estraine 20. Mi raccomando non posso estrarre 2 volte lo stesso numero.
				Scanner input = new Scanner(System.in);
				System.out.println("Quanti numeri vuoi estrarre ? ");
				Tombola.estrazione3(input.nextInt());
				
				break;
			case 'q':
				System.out.println("Stai uscendo dal programma...");
				break;
				
			default:
				System.out.println("Scusa non capisco questo comando");
					
			}
			
		
		}while(scelta != 'q' && scelta != 'Q');
		
		System.out.println("Ciao, alla prossima partita !");
	}
}