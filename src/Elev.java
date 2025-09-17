public class Elev {
    String nume;
    int varsta;

    // Instance method (Metoda instanta)
    public void afiseazaDetalii() {
        System.out.println(" Elevul " + nume + " are " + varsta + " ani ");
    }

    public static void scoala() {
        System.out.println("Scoala Nationala de Informatica");
    }

    public static void main(String[] args) {
        Elev e1 = new Elev();
        e1.nume = "Victoria";
        e1.varsta = 20;
        Elev e2 = new Elev();
        e2.nume = "Maria";
        e2.varsta = 29;
        e1.afiseazaDetalii();
        e2.afiseazaDetalii();
        scoala();

    }
}