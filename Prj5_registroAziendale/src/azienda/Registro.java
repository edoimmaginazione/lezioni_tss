
package azienda;

import java.util.ArrayList;
import java.util.List;

import azienda.AttoriCoinvolti.Segretario;

class Registro {
    private List<Dipendente> dipendenti;

    public Registro() {
        dipendenti = new ArrayList<>();
    }

    public void aggiungiDipendente(Dipendente dipendente) {
        dipendenti.add(dipendente);
    }

    public void stampaTuttiDipendenti() {
        for (Dipendente d : dipendenti) {
            System.out.println(d);
        }
    }

    public void stampaDipendentiPerRuolo(Class<?> ruolo) {
        for (Dipendente d : dipendenti) {
            if (ruolo.isInstance(d)) {
                System.out.println(d);
            }
        }
    }

	public void aggiungiDipendente(Segretario dipendente) {
		// TODO Auto-generated method stub
		
	}
}
