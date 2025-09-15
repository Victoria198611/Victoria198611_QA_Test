public class Persoana {
    String numePersoana;
    int varstaPersoana;

    //Constructor
    Persoana (String n, int v) {
        numePersoana=n;
        varstaPersoana=v;
    }
    void afiseazaInfo(){
        System.out.println("Nume:" + numePersoana + "Varsta;" +varstaPersoana);
    }
}
