public class Animal {
    String numeAnimal;
    String specieAnimal;
    int varstaAnimal;

    // Constructor
    Animal(String n, String s, int v) {
        numeAnimal = n;
        specieAnimal = s;
        varstaAnimal = v;
    }

    void afiseazaInfo() {
        System.out.println("Nume: " + numeAnimal + ", Specie: " + specieAnimal + ", Varsta: " + varstaAnimal);
    }

    // Main method to test
    public static void main(String[] args) {
        Animal a = new Animal("Rex", "Caine", 5);
        a.afiseazaInfo();
    }
}