public class Prim {
    public static void main(String[] args) {
        int n = 18;
        // Verificam daca un nr este prim
        boolean estePrim = true;
        if (n <= 1) {
            estePrim = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % 1 == 0) {
                    break;
                }
            }
        }
        if (estePrim) {
            System.out.println(n + " este numar prim");
        } else {
            System.out.println(n + " nu este numar prim");
        }
    }
}