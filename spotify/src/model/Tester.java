package model;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static Playlist creaPlaylist() {
        List<Brano> listaBrani = new ArrayList<>();
        
        Brano brano1 = new Brano(8, 45, "Bad Bunni", "olaolaola", "heavy metal");
        Brano brano2 = new Brano(2, 10, "Lupin III", "Suonata al chiaro di sole", "Rock");
        Brano brano3 = new Brano(1, 55, "Bugs Bunny", "Stagione di anatre", "Japanoise");

        listaBrani.add(brano1);
        listaBrani.add(brano2);
        listaBrani.add(brano3);

        Playlist playlist = new Playlist("Zio Pera", 0, 0, listaBrani);
        
        for (Brano brano : listaBrani) {
            playlist.durataTotale += brano.minuti;
            playlist.numeroBrani++;
        }

        return playlist;
    }
}
