package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	
	public String nome;
    public int durataTotale;
    public int numeroBrani;

    public List<Brano> listaBrani = new ArrayList<Brano>();
	    
	
  
   public Playlist(String nome, int durataTotale, int numeroBrani, List<Brano> listaBrani) {
		
	   this.nome = nome;
		this.durataTotale = durataTotale;
		this.numeroBrani = numeroBrani;
		this.listaBrani = listaBrani;
	}
	
    
    
    //provare a studiare il comparable
    
    
    public void addBrano(int durata) {
        durataTotale += durata;
        numeroBrani++;
    }

    public void removeBrano(int durata) {
        if (numeroBrani > 0) {
            durataTotale -= durata;
            numeroBrani--;
        } else {
        	System.out.println("La playlist è vuota!!!");
        }
    }


    
    
    public void infoPlaylist() {
        System.out.println("Nome playlist: " + nome);
        System.out.println("Durata totale: " + durataTotale + " minuti");
        System.out.println("Numero brani: " + numeroBrani);
  
        
        
    }
}

