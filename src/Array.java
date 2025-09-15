public class Array {
    public static void main(String[] args) {
        int[] myNumbers = { 1, 2, 8, 4, 5 } ;
        int max = myNumbers[0];
        // Căutăm cel mai mare număr

        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i] > max) {
                max = myNumbers[i];
            }
        }
            System.out.println(" Cel mai mare numar este " + max);
        }
    }