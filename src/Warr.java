import java.util.Scanner;
public class Warr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul numar");
        int a = scanner.nextInt();

        System.out.print("Introdu al doilea numar");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Primul numar este mai mare");
    } else if (a< b) {
        System.out.println("Al doilea numar este mai mare");

    }else{
        System.out.println("Numerele sunt egale");
    }
    }
    }