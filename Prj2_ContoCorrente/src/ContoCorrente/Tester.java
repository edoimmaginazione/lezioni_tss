package ContoCorrente;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Tester {

    public static Conto trovaConto(ArrayList<Conto> listaConti, int numConto) {
        for (Conto conto : listaConti) {
            if (conto.getNumConto() == numConto) {
                return conto;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Date d = new Date();
        ArrayList<Conto> contiCorrenti = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        char scelta;

        do {
            Menu.stampaMenu();
            scelta = input.next().toLowerCase().charAt(0);

            switch (scelta) {
                case '1':
                    System.out.print("Inserisci il nome del titolare: ");
                    String nome = input.next();
                    System.out.print("Inserisci il saldo iniziale: ");
                    double saldo = input.nextDouble();
                    contiCorrenti.add(new Conto(nome, saldo, d));
                    break;
                case '2':
                    System.out.print("Inserisci il numero del conto: ");
                    int numeroConto = input.nextInt();
                    Conto mioConto = trovaConto(contiCorrenti, numeroConto);
                    if (mioConto != null) {
                        System.out.print("Inserisci l'importo da depositare: ");
                        double importo = input.nextDouble();
                        mioConto.deposita(importo);
                    } else {
                        System.out.println("Conto non trovato.");
                    }
                    break;
                case '3':
                    System.out.print("Inserisci il numero del conto: ");
                    numeroConto = input.nextInt();
                    mioConto = trovaConto(contiCorrenti, numeroConto);
                    if (mioConto != null) {
                        System.out.print("Inserisci l'importo da prelevare: ");
                        double importo = input.nextDouble();
                        mioConto.preleva(importo);
                    } else {
                        System.out.println("Conto non trovato.");
                    }
                    break;
                case '4':
                    System.out.print("Inserisci il numero del conto: ");
                    numeroConto = input.nextInt();
                    mioConto = trovaConto(contiCorrenti, numeroConto);
                    if (mioConto != null) {
                        System.out.println(mioConto.stampaInfo());
                    } else {
                        System.out.println("Conto non trovato.");
                    }
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 'q');

        input.close();
    }
}



/*/* /*package Conto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Tester {
	
	
	/**
	 * JAVADOC
	 * @param Conto[] listaConti
	 * @param numConto
	 * @return Conto
	
	
	
	public static Conto trovaConto(conto[] listaConti, int numConto) {
		
	Conto mioConto=null;
		
		
	for (int i = 0; i < listaConti.length; i++) {
			if(listaConti[i].numConto == numConto) {
				return listaConti[i];
			}
			
		}	return mioConto;

		
	}

	
	
	
	
	
	
	
	
	
	
    public static void main(String[] args) {
    	
    	Date d = new Date(); //seeve nella stringa
    			
    			/* Conto c1 = new Conto(100, 2782, "paolo panini", d);
    	System.out.println(c1.stampaInfo());
    			
		Conto c2 = new Conto(100, 244782, "berlusconii", d);
    	System.out.println(c1.stampaInfo()); */
    			
    			/*
    			
    			Conto[] contoCorrenti = new Conto[5];
    	
    	ArrayList<Conto> contiCorrenti = new ArrayList<Conto>();
    	
    	

		Scanner input = new Scanner(System.in);
	
		char scelta;
    	
    			do {
    				
    				Menu.stampaMenu();
    				
    				
    		scelta = input.next().toLowerCase().charAt(0);
    		
    		
    		switch(scelta) {
    		
    	      case 1:
                 mioConto[Conto.contatore] = new Conto (1828, 323, "papera", d)
                 
                 
                 
                 break;
              case 2: //versamento
            	  
                  System.out.print("Inserisci l'importo da depositare: ");
                  
                  numeroConto = input.nextInt();
                  mioConto  = trovaConto (contiCorrenti, numeroConto);
                  mioConto.deposita(599);
                                    break;
              case 3:
                  System.out.print("Inserisci l'importo da prelevare: ");
                  numeroConto = input.nextInt();
                  mioConto  = trovaConto (contiCorrenti, numeroConto);
                  mioConto.preleva(599);
                  break;
              case 4:
            	  System.out.print("Info Conto");
            	  mioConto[0].stampaInfo();
            	  break;
              default:
                  System.out.println("Scelta non valida. Riprova.");
    		
    		} 
    			}while (scelta != 'q'); 

    			
    			
    			
    			
    		
    			
    			
    			
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 
    	
    	
    	
    	
    	
    	/*   Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il nome del titolare: ");
        String nome = input.nextLine();
        System.out.print("Inserisci l'importo iniziale da depositare: ");
        double iniziale = input.nextDouble();
        Conto conto = new Conto(contatore, nome, iniziale, dataApertura);
        System.out.println("Conto creato correttamente. Il numero del conto è: " + conto.numConto);
        
    */