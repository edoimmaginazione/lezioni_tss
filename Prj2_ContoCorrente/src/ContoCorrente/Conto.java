package ContoCorrente;

import java.util.Date;

public class Conto {
    public static int contatore = 0; // Conta quanti conti sono aperti nella banca
    private int numConto;
    private double saldo;
    private String titolare;
    private Date dataApertura;

    public Conto() {
        System.out.println("Hai appena creato un Conto Corrente vuoto, devi inserire i dati.");
    }

    public Conto(String titolare, double saldo, Date dataApertura) {
        this.numConto = ++contatore;
        this.titolare = titolare;
        this.saldo = saldo;
        this.dataApertura = dataApertura;
        System.out.println("Hai appena creato un Conto Corrente :D");
        System.out.println("Nella tua banca ci sono " + contatore + " conti.");
    }

    public double preleva(double importo) {
        if (importo > saldo) {
            System.out.println("Saldo insufficiente. Operazione non effettuata.");
            return saldo;
        }
        saldo -= importo;
        System.out.println("Prelievo effettuato. Nuovo saldo: " + saldo);
        return saldo;
    }

    public void deposita(double importo) {
        if (importo < 0) {
            System.out.println("Non è possibile depositare una somma negativa.");
            return;
        }
        saldo += importo;
        System.out.println("Deposito effettuato. Nuovo saldo: " + saldo);
    }

    public String stampaInfo() {
        return "Numero conto: " + numConto + "\nTitolare: " + titolare + "\nSaldo attuale: " + saldo;
    }

    @Override
    public String toString() {
        return "Conto [numConto=" + numConto + ", saldo=" + saldo + ", titolare=" + titolare + ", dataApertura=" + dataApertura + "]";
    }
}
