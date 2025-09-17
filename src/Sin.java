public class Sin {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 4, 2}, {67, 6, 8}};
        int max = myNumbers[0][0];
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                max = Math.max(max, myNumbers[i][j]);
            }
        }
        // Aratam numarul maxim dintr-un Array
        System.out.println(" Numarul maxim este " + max);
    }
}