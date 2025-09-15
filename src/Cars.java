public class Cars {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[0] = new int[4];
        a[1] = new int[2];
        a[2] = new int[3];
        int sum=0; // Metoda jagged array


        // Fill the jagged array with random numbers and calculate sum
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random() * 101); // random number [0-100]
                sum += a[i][j];
            }
        }

        // Print the array
        for (int[] ss : a) {
            for (int s : ss) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}