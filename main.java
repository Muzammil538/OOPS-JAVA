/**
 * main
 */
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    // input
    System.out.println("Enter elements");
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }
    // print
    for (int i = 0; i < 5; i++) {
      System.out.println(arr[i]);
    }
  }
  
}