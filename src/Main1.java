public class Main1 {
    public static void main(String[] args) {
        // Creem Animal
        Animal a1 = new Animal("Aliosa ", "zebra ", 12);
        Animal a2 = new Animal("Lola ", "vaca ", 9);
        //Cream Zoo
        Zoo z = new Zoo(a1, a2);
        //afisam animalele
        z.afiseazaAnimale();
    }
}