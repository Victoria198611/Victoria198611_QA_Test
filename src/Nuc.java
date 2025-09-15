public class Nuc {
   public static void main(String[] args) {
      int[][] myNumbers = {
         {1, 0, 0},
         {0, 1, 0},
         {0, 0, 1}
      };
      
      int sum = 0;

      for (int i = 0; i < myNumbers.length; ++i) {
         for (int j = 0; j < myNumbers[i].length; ++j) {
            System.out.print(myNumbers[i][j] + " "); 
            sum += myNumbers[i][j]; 
         }
         System.out.println(); 
      }

      System.out.println("Suma numerelor = " + sum);
   }
}