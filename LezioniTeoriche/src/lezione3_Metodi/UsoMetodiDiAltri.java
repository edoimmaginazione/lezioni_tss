package lezione3_Metodi;

public class UsoMetodiDiAltri {

	public static void main(String[] args) {
		String qualcosa = MetodiAusiliari.cosaMiPassi("qualcosa ti apsserò");
		System.out.println(qualcosa);
		
		double somma = Calcolatrice0.addizione(5.2, 8.9);
		System.out.println("il valore somma è  " + somma);

	}

}
