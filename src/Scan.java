import java.util.Scanner;

public class Scan {
    // Clasa Scanner
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Facem adunarea si scaderea lui A");
        int a= scanner.nextInt();
        System.out.println(a);
        int b= scanner.nextInt();
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }
}