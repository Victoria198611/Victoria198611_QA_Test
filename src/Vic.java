public class Vic {
    public static void main(String[] args) {
        int a[][] = new int[2][];
        a[0] = new int[2];
        a[1] = new int[3];
        // Metoda jagged array cu 2 rinduri
        int[] valori = {1, 2, 3, 4, 5};
        int k = 0;
        int totalSum = 0;

        for (int i = 0; i < a.length; i++) {
            int rowSum = 0; // suma pentru rândul curent

            // completăm rândul cu valorile fixe și calculăm suma
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = valori[k++];
                rowSum += a[i][j];
            }

            totalSum += rowSum;

            // afișăm rândul și suma lui
            for (int num : a[i]) {
                System.out.print(num + " ");
            }
            System.out.println(" | Suma rândului = " + rowSum);
        }

        System.out.println("Suma totală = " + totalSum);
    }
}