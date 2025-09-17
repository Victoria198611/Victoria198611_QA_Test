import java.util.Scanner;

public class Scanam{
    public static void main(String [] args) {

        // Creăm un obiect Scanner pentru citirea datelor de la tastatură
        Scanner scanner= new Scanner(System.in);

        // Cerem utilizatorului să introducă numele
        System.out.println("Introdu numele tau");
        String nume= scanner.nextLine();

        // Cerem utilizatorului să introducă vârsta
        System.out.println("Intrudu varsta ta");
        int varsta = scanner.nextInt();

        // Afișăm mesajul final personalizat
        System.out.println("Salut, " + nume + "! Ai " + varsta + " ani.");
        // Închidem Scanner-ul după folosire
        scanner.close();
    }
}