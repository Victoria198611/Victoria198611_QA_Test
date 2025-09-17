public class Stude {
    String nume;
    int[] note;

    public Stude(String nume, int[] note) {
        this.nume = nume;
        this.note = note;
        // Metoda instanta
    }

    public double media() {
        int suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return (double) suma / note.length;
    }

    public void afiseazaDetalii() {
        System.out.println(" Stude " + nume + " Media " + media());
    }

    public static void main(String[] args) {
        Stude s1 = new Stude("Andrei", new int[]{7, 8, 9});
        Stude s2 = new Stude("Maria", new int[]{8, 9, 10});
        s1.afiseazaDetalii();
        s2.afiseazaDetalii();
    }
}