package contoCorrente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Tester {
	
	/**
	 * JAVADOC
	 * @param Conto[] listaConti 
	 * @param int numConto
	 * @return Conto
	 */
	public static Conto trovaConto(Conto[] listaConti, int numConto) {

		Conto contoTrovato = null;
		for(int i = 0; i < listaConti.length; i++) {
			if(listaConti[i] != null && listaConti[i].numConto == numConto) {
				contoTrovato = listaConti[i];
			}
		}
			
		return contoTrovato;
	}

	public static void main(String[] args) {
//		Date d = new Date(); //Questa data ci serve nel costruttore del conto
//		
//		Conto c1 = new Conto(1001, 1250.0, "Paolo Panini", d);
//		System.out.println(c1.stampaInfo());
//		c1.versamento(652);
//		
//		Conto c2 = new Conto(1002, 110.40, "Anna Verdi", d);
//		System.out.println(c2.stampaInfo());
//		c2.preleva(23);
		
		Date d = new Date();
		Conto[] contiCorrenti = new Conto[5]; //5 è la dimensione dell'array. Cioè ho a disposizione 5 slot
		
		Scanner input = new Scanner(System.in);
		
		char scelta;
		
		do {
			Menu.stampaMenu();

			scelta = input.next().toLowerCase().charAt(0);
			Conto mioConto = null;
			int numeroConto = 0;

			switch(scelta) {
			case '1':
				//posso essere sicuro che il mio contatore parta da 0
				
				contiCorrenti[Conto.contatore] = new Conto(1001, 120, "Laura Gialli", d);

				break;
			case '2': //Versamento
				System.out.println("Forniscimi un numero di conto: ");
				numeroConto = input.nextInt();
				mioConto = trovaConto(contiCorrenti, numeroConto);
				mioConto.versamento(500);		
				break;
			case '3':
				System.out.println("Forniscimi un numero di conto: ");
				numeroConto = input.nextInt();
				mioConto = trovaConto(contiCorrenti, numeroConto);
				mioConto.preleva(100);
				break;
			case '4':
				System.out.println(contiCorrenti[0].stampaInfo());
				
				break;
			default:
				System.out.println("Scelta non valida");
			break;
			}
			
		}while(scelta != 'q');
		

		
				
	}
}
