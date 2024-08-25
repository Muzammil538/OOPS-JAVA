class GiveObj{
  int num1, num2;
  GiveObj(int a ,int b){
    num1 = a;
    num2 = b;
    System.out.println("num1 : " + num1 +  "num2 : " + num2);
  }
}

class Add{
  void sum(GiveObj c){
    int sum = c.num1 + c.num2;
    System.out.println("Sum : " + sum);
  }
}

class PassObj {
  public static void main(String[] args) {
    GiveObj obj = new GiveObj(10, 2);
    Add add = new Add();
    add.sum(obj);

  }
}
