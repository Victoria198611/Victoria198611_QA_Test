public class Angajat {
    String numeAngajat;
    int varstaAngajat;
    double salariu;

    //Constructor
    Angajat(String n, int v, double s) {
        numeAngajat = n;
        varstaAngajat = v;
        salariu = s;
    }
    void afiseazaInfo() {
        System.out.println("Nume:" + numeAngajat + "varsta:" + varstaAngajat + " salariu:" + salariu);
    }
    }