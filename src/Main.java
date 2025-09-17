public class Main {
    public static void main(String[] args) {
        // Creem cartile
        Carte c1 = new Carte("Amintiri din copilarie", "Ion Creanga", 1970);
        Carte c2 = new Carte("Capra cu trei iezi", "Ion Creanga", 1890);
        //Cream biblioteca
        Biblioteca b = new Biblioteca(c1, c2);
        //afisam cartile
        b.afiseazaCarti();
    }
}