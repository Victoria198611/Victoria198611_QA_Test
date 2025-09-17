import java.util.Scanner;

public class Scan {
    // Clasa Scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu primul numar");
        int a = scanner.nextInt();

        System.out.print("Introdu al doilea numar");
        int b = scanner.nextInt();

        System.out.println("Suma " + (a + b));
        System.out.println("Diferenta " + (a - b));
        System.out.println("Inmultirea " + (a * b));
    }
}