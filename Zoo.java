public class Zoo {
    Animal animal1;
    Animal animal2;

    //Constructor simplu a 2 animale
    Zoo (Animal a1, Animal a2) {
        animal1 = a1;
        animal2 = a2;
    }
    // Metoda pentru afisarea Animalelor
    void afiseazaAnimale() {
        animal1.afiseazaInfo();
        animal2.afiseazaInfo();
    }
}
