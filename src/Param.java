public class Param {
    int a = 4;
    int b = 5;
    String text = "Hello";

    public void afisare() {
        int sum = a + b;

        String rez = text + " " + sum;
        System.out.println(rez);
    }

    public static void main(String[] args) {
        Param t = new Param();
        t.afisare();
    }
}