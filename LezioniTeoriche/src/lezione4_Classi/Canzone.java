package lezione4_Classi;
//alt shift s
public class Canzone {
	String cantante;
	String titolo;
	double durata;
	//costruttore  di default esiste sempre, può essere non specificato se esiste quello in firma piena
	public Canzone() {
		
	};
	//costruttore con firma piena. Se ne esiste uno a firma pena e voglio utilizzarne uno di default, devo per forza speciicare quest'ultimo
	public Canzone(String cantante, String titolo, double durata) {
		this.cantante = cantante;
		this.titolo = titolo;
		this.durata = durata;
	}
	
	public Canzone (String cantante, String titolo) {
		this.cantante = cantante;
		this.titolo = titolo;
		
	}
	
	
	@Override
	//con il metodo stringottengo una rappresentazione fomrato stringa del mio oggetto
	//anche tostring può essere invocato senza essere specirficato
	public String toString() {
		
		
		if (durata == 0) {
			
			return "la durata è zero";
			
		}else {
			return "cantante" + cantante + "titolo=" + titolo + "durata:" + durata;
		
	}

}
}
