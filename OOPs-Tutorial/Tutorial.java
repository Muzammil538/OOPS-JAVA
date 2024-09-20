import java.util.*;

class Tutorial {
  static int tutorial_num , question_num;
  static int[] t1 = {1,2,3,4,5,6};
  static int[] t2 = {1,2,3,4,5,6};
  static int[] t3 = {1,2,3,4,5,6};
  static int[] t4 = {1,2,3,4,5};

  static void takeQuestion(){
    
    if(tutorial_num == 1){
      for(int x : t1) System.out.println(x);
    }
    else if(tutorial_num == 2){
      for(int x : t2) System.out.println(x);
    }
    else if(tutorial_num == 3){
      for(int x : t3) System.out.println(x);
    }
    else if(tutorial_num == 4){
      for(int x : t4) System.out.println(x);
    }
    else{
      System.out.println("Invalid Tutorial Number");
    }
    
  }

  public static void main(String[] args) {
    // Objects 
    Scanner sc = new Scanner(System.in);

    // Main code 
    // Taking question 
    System.out.println("Enter Tutorial number : ");
    tutorial_num = sc.nextInt();
    System.out.println("Select question number for the Tutorial "+tutorial_num);
    takeQuestion();
    question_num = sc.nextInt();
    sc.close();

    
    
  }
}
