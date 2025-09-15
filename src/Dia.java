public class Dia {
   public static void main(String[] args) {
      int[][] matrice = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
      };

      int sumSecundar = 0;
//Afiseaza intreaga matrice
      for (int i = 0; i < matrice.length; ++i) {
      for (int j = 0; j < matrice[i].length; j++) {
          System.out.print(matrice[i][j] + " ");
         }
       System.out.println();
   
    sumSecundar += matrice[i][matrice.length - 1 - i];
}

System.out.println("Suma diagonalei secundare = " + sumSecundar);
}
}