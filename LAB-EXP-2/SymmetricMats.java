import java.util.*;
class SymmetricMats {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r, c, nr, nc, i, j;
    System.out.println("Enter row and columns of matrix : ");
    r = sc.nextInt();
    c = sc.nextInt();
    sc.close();
    int[][] a = new int[r][c];
    System.out.println("Enter elements of matrix : ");
    for(i = 0; i < r; i++){
      for(j = 0; j < c; j++){
        a[i][j] = sc.nextInt();
      }
    }
    nr = c;
    nc = r;
    int[][] b = new int[nr][nc];
    for(i = 0; i < nr; i++){
      for(j = 0; j < nc; j++){
        b[i][j] = a[j][i];
      }
    }
    // symmetrics matrix
    boolean flag = true;
    for(i = 0; i < r; i++){
      for(j = 0; j < c; j++){
        if(a[i][j] != b[i][j]){
          flag = false;
          break;
        }
      }
    }
    if(flag){
      System.out.println("\nMatrix is symmetric.");
    }
    else{
      System.out.println("\nMatrix is not symmetric.");
    }

  }
}
