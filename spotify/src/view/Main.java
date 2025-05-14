package view;

import model.Playlist;
import model.Tester;
import model.Brano;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = Tester.creaPlaylist();

        boolean avvio = true;
        while (avvio) {
            System.out.println("Opzioni:");
            System.out.println("1 - Aggiungi un brano");
            System.out.println("2 - Rimuovi un brano");
            System.out.println("3 - Visualizza info playlist");
            System.out.println("4 - Riproduci un brano");
            System.out.println("5 - Esci");

            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il titolo del brano: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Inserisci l'autore del brano: ");
                    String autore = scanner.nextLine();
                    System.out.print("Inserisci il genere del brano: ");
                    String genere = scanner.nextLine();
                    System.out.print("Inserisci la durata (minuti): ");
                    int minuti = scanner.nextInt();
                    System.out.print("Inserisci la durata (secondi): ");
                    int secondi = scanner.nextInt();

                    Brano nuovoBrano = new Brano(minuti, secondi, autore, titolo, genere);
                    playlist.listaBrani.add(nuovoBrano);
                    playlist.durataTotale += minuti;
                    playlist.numeroBrani++;

                    System.out.println("Brano aggiunto con successo!");
                    break;

                case 2:
                    System.out.print("Inserisci il titolo del brano da rimuovere: ");
                    String titoloRimuovere = scanner.nextLine();
                    Brano branoRimuovere = null;

                    for (Brano brano : playlist.listaBrani) {
                        if (brano.titolo.equalsIgnoreCase(titoloRimuovere)) {
                            branoRimuovere = brano;
                            break;
                        }
                    }

                    if (branoRimuovere != null) {
                        playlist.listaBrani.remove(branoRimuovere);
                        playlist.durataTotale -= branoRimuovere.minuti;
                        playlist.numeroBrani--;
                        System.out.println("Brano rimosso con successo!");
                    } else {
                        System.out.println("Brano non trovato.");
                    }
                    break;

                case 3:
                	for (int i = 0; i < playlist.listaBrani.size(); i++) {
                	    playlist.listaBrani.get(i).stampaInfo();
                	}

                case 4:
                    System.out.print("Inserisci il titolo del brano da riprodurre: ");
                    String titoloPlay = scanner.nextLine();

                    for (Brano brano : playlist.listaBrani) {
                        if (brano.titolo.equalsIgnoreCase(titoloPlay)) {
                            brano.play();
                            break;
                        }
                    }
                    break;

                case 5:
                    avvio = false;
                    System.out.println("Uscita...");
                    break;

                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }
        scanner.close();
    }
}
