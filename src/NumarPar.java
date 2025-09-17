import java.util.Scanner;

public class NumarPar {
    public static void main(String[] args) {
        // Creăm un obiect Scanner pentru citirea datelor de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Cerem utilizatorului să introducă numărul
        System.out.print("Introdu numarul: ");
        int x = scanner.nextInt();

        // Verificăm dacă numărul este par sau impar
        if (x % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

        // Închidem Scanner-ul
        scanner.close();
    }
}