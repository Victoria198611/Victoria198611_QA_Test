public class Carte {
    String titluCarte;
   String autorCarte;
   int anPublicareCarte;
// Constructor fara this

    Carte (String t, String a, int p) {
        titluCarte=t;
        autorCarte=a;
        anPublicareCarte=p;
    }
    void afiseazaInfo(){
        System.out.println("Titlu:" + titluCarte + "autor:" + autorCarte + "anPublicarea:" + anPublicareCarte);
    }
}
