import java.util.*;

class RectAreaByObj {
  int l , w;
  RectAreaByObj(int a , int b){
    l = a;
    w = b;
  
  }
  int area(){
    return l * w;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length and width of rectangle:");
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();
    RectAreaByObj r = new RectAreaByObj(x , y);
    System.out.println("Area of rectangle is : " + r.area());
  }
}
