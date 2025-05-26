package azienda;

abstract class Dipendente {
    protected String nome;
    protected int livello;
    protected static final double STIPENDIO_BASE = 1000.0;

    public Dipendente(String nome, int livello) {
        this.nome = nome;
        this.livello = livello;
    }

    public abstract double calcolaStipendio();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Livello: " + livello + ", Stipendio: " + calcolaStipendio();
    }
}
