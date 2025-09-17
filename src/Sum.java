public class Sum {
    public static void main(String[] args) {
        int[][] n = {{1, 3, 4, 6, 7}, {2, 5, 7, 9, 4}};
        int sum = 0;
        // Suma numerelor
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                sum += n[i][j];
            }
        }
        System.out.println("Suma numerelor " + sum);
    }
}