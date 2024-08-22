class MathOps {
  // two vairable operations
  int sum(int a, int b){
    return a + b;
  }
  int subs(int a, int b){
    return a - b;
  }
  int prod(int a, int b){
    return a * b;
  }
  double divide(double a, double b){
    return a / b;
  }
  // gives sum of all the elements of the array 
  int sumArray(int[] arr){
    int sum = 0;
    for(int x : arr){
      sum += x;
    }
    return sum;
  }
  // gives product of all elements of an array
  int prodArray(int[] arr){
    int prod = 1;
    for(int x : arr){
      prod *= x;
    }
    return prod;
  }
  // gives the maximum among 2
  void getMax(int a, int b){
    if(a == b) System.out.println("Both are equal\n");
    else if(a > b) System.out.println("Max is : " + a);
    else System.out.println("Max is : " + b);
  }
  // gives the minimum among 2
  void getMin(int a, int b){
    if(a == b) System.out.println("Both are equal\n");
    else if(a > b) System.out.println("Min is : " + b);
    else System.out.println("Min is : " + a);
  }
  // gives the maximum number from the array
  int getMaxArray(int[] arr){
    int max = arr[0];
    for(int x : arr){
      if(x > max) max = x;
    }
    return max;
  }
  // gives the minimum number from the array 
  int getMinArray(int[] arr){
    int min = arr[0];
    for(int x : arr){
      if(x < min) min = x;
    }
    return min;
  }
  // gives square of a number
  int square(int a){
    return a * a;
  }
  // gives cube of a number
  int cube(int a){
    return a * a * a;
  }
  // gives power of two numbers
  double power(double base, double n){
    return Math.pow(base, n);
  }
  // gives area of quadrilateral
  int quadArea(int l, int b){
    return l * b;
  }
  // gives area of circle
  double circleArea(double r){
    return Math.PI * r * r;
  }
  // gives the roots for quadratic equation
  void quadEqatn(double a , double b , double c){
    double d = (b * b) - 4 * a * c;
    double r1, r2;
    if(a == 0) System.out.println("Not a quadratic equation\n");
    else {
      if(d > 0){
        r1 = (-b + Math.sqrt(d)) / (2 * a);
        r2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Roots are real and distinct\n");
        System.out.println("Root 1 is : " + r1);
        System.out.println("Root 2 is : " + r2);
      }
      else if (d == 0){
        r1 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println("Roots are real and equal\n");
        System.out.println("Root is : " + r1);
      }
      else{
        System.out.println("Roots are imaginary\n");
      }
    }
  }
  // factorial 
  void factorial(int a) {
    double fact = 1;
    if(a < 0) System.out.println("Factorial not possible\n");
    else if(a == 0 || a== 1) System.out.println("Factorial : 1");
    else{
      for(int i = a; i >= 1; i--){
        fact *= i;
      }
      System.out.println("Factorial : " + fact);      
    }
  }
}