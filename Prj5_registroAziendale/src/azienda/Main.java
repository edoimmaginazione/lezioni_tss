package azienda;

public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();

        registro.aggiungiDipendente(new AttoriCoinvolti.Programmatore("Doua", 3));
        registro.aggiungiDipendente(new AttoriCoinvolti.HR("Jacopo", 2));
        registro.aggiungiDipendente(new AttoriCoinvolti.Segretario("Vania", 1));
        registro.aggiungiDipendente(new AttoriCoinvolti.Manager("Sahar", 4));

        System.out.println("Tutti i dipendenti:");
        registro.stampaTuttiDipendenti();

        System.out.println("Dipendenti con ruolo Programmatore:");
        registro.stampaDipendentiPerRuolo(AttoriCoinvolti.Programmatore.class);
    }
}
