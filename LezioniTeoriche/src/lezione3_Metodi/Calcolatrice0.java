package lezione3_Metodi;

import java.util.Scanner;

public class Calcolatrice0 {

	public static void main(String[] args) {
		
		double primoNum = getInput ("Inserisci primo numero ?");
				double secondoNum = getInput ("inserisci secondo numero ?");
				
				System.out.println(addizione(primoNum, secondoNum));
				System.out.println(sottrazione(primoNum, secondoNum));
				System.out.println(moltiplicazione(primoNum, secondoNum));
				System.out.println(divisione(primoNum, secondoNum));

	}
			public static double addizione (double a, double b) {
				double somma = a + b;
				return somma;

}

	public static double moltiplicazione (double a, double b) {
		
		return a*b;
		
	}
	
	
	public static double sottrazione (double a, double b) {
		
		return a-b;
		
		
		
	}
	
	public static double divisione (double a, double b) {
		double quoziente = a/b;
		return quoziente;
		
	}
	
	
	
	
	
	
	public static double getInput(String domanda) {
		
		System.out.println(domanda);
	
	
		Scanner input = new Scanner (System.in);
		
		double mioDouble = input.nextDouble();
		
		return mioDouble;
		
		
	}
	
	
}


