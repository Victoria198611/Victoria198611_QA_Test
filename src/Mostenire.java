class Mostenire {
    protected String nume = "Maria";
    public void afisezNume() {
        System.out.println("zzzz");
        // Java Inheritance
    }
}
class Prenume extends Mostenire {
    private String lastName = "Cazacu";
    public static void main(String[] args) {
        Prenume myLastName = new Prenume();
        myLastName.afisezNume();
        System.out.println(myLastName.nume + " " + myLastName.lastName);
    }
}