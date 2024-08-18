import java.util.*;

class SumOfDigits{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int sum = 0, temp , num;
    System.out.println("Enter the number");
    num = sc.nextInt();
    sc.close();
    temp = num;
    while(temp != 0){
      sum = sum + temp % 10;
      temp = temp / 10;
    }
    System.out.println("Sum of digits of the number is " + sum); 
  }
}