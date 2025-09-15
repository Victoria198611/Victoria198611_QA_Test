public class Stati {
// Metoda non statica
    public void salut() {
        System.out.println("Salut! Eu sunt din Moldova.");
    }
    //Metoda statica
    public static void mess() {
        System.out.println("Salut! Eu m-am saturat.");
    }
    public static void main(String[] args) {
        mess();
        Stati obj = new Stati();
        obj.salut();
    }
}