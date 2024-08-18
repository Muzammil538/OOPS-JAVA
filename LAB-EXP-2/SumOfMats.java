import java.util.*;

class SumOfMats {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1, r2, c1, c2, i, j;
    System.out.println("Enter the row and column of first matrix : ");
    r1 = sc.nextInt();
    c1 = sc.nextInt();
    System.out.println("Enter the row and column of second matrix : ");
    r2 = sc.nextInt();
    c2 = sc.nextInt();
    int[][] mat1 = new int[r1][c1];
    int[][] mat2 = new int[r2][c2];
    System.out.println("Enter elements of matrix one");
    for (i = 0; i < r1; i++) {
      for (j = 0; j < c1; j++) {
        mat1[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter elements of matrix two");
    for (i = 0; i < r2; i++) {
      for (j = 0; j < c2; j++) {
        mat2[i][j] = sc.nextInt();
      }
    }
    if (r1 == r2 && c1 == c2) {
      int[][] sum = new int[r1][c1];
      for (i = 0; i < r1; i++) {
        for (j = 0; j < c1; j++) {
          sum[i][j] = mat1[i][j] + mat2[i][j];
        }
      }

    } else {
      System.out.println("Matrices cannot be added");
    }

  }
}
