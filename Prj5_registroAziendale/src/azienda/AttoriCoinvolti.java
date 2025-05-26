package azienda;

public class AttoriCoinvolti {
    // Classi specifiche come classi interne statiche
    static class Programmatore extends Dipendente {
        public Programmatore(String nome, int livello) {
            super(nome, livello);
        }

        @Override
        public double calcolaStipendio() {
            return STIPENDIO_BASE * livello;
        }
    }

    static class HR extends Dipendente {
        public HR(String nome, int livello) {
            super(nome, livello);
        }

        @Override
        public double calcolaStipendio() {
            return STIPENDIO_BASE * (livello + 0.5);
        }
    }

    static class Segretario extends Dipendente {
        public Segretario(String nome, int livello) {
            super(nome, livello);
        }

        @Override
        public double calcolaStipendio() {
            return STIPENDIO_BASE * (livello + 0.2);
        }
    }

    static class Manager extends Dipendente {
        public Manager(String nome, int livello) {
            super(nome, livello);
        }

        @Override
        public double calcolaStipendio() {
            return STIPENDIO_BASE * (livello + 1);
        }
    }
}
