public class Biblioteca {
    Carte carte1;
    Carte carte2;

    //Constructor simplu a 2 carti
    Biblioteca(Carte c1, Carte c2) {
        carte1 = c1;
        carte2 = c2;
    }
    // Metoda pentru afisarea Cartilor
    void afiseazaCarti() {
    carte1.afiseazaInfo();
    carte2.afiseazaInfo();
}
}


