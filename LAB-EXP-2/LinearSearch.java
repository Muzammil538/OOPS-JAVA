import java.util.*;

class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, target, i, j;
    System.out.println("Enter the number of elements in the array:");
    n = sc.nextInt();
    sc.close();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target element:");
    target = sc.nextInt();
    sc.close();
    for(i = 0; i < n; i++){
      for(j = i+1; j < n; j++){
        if(arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(i = 0; i < n; i++){
      if(arr[i] == target){
        System.out.println("Target element found at position " + (i+1));
      }
    }
  }
}
