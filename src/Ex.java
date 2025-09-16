public class Ex {
    public static void main(String[] args) {
        int i = 10;

        while (i >= 0) { // continuă până la 0
            if (i % 2 == 0) { // verifică dacă e par
                System.out.println(i);
            }
            i--; // scade cu 1
        }
    }
}