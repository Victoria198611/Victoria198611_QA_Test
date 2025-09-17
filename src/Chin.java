public class Chin {
    public static void main(String[] args) {
        // Creem tablou jagged array cu 4 rânduri
        int a[][] = new int[4][];
        a[0] = new int[3];
        a[1] = new int[5];
        a[2] = new int[2];
        a[3] = new int[6];

        // Valorile fixe pe care vrem să le punem
        int[] valori = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int k = 0; // index pentru array-ul de valori
        int totalSum = 0;

        // Umplem tabloul cu valorile fixe și calculăm sumele
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = valori[k++]; // luăm următoarea valoare fixă
                rowSum += a[i][j];
            }

            totalSum += rowSum;

            // Afișăm rândul curent și suma lui
            for (int num : a[i]) {
                System.out.print(num + " ");
            }
            System.out.println(" | Suma rândului = " + rowSum);
        }

        // Afișăm suma totală
        System.out.println("\nSuma totală a elementelor = " + totalSum);
    }
}