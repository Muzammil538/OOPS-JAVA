class AddByObj {
  int n1 , n2;
  AddByObj(int a , int b){
    n1 = a;
    n2 = b;
  }
  int add(){
    return n1 + n2;
  }

  public static void main(String[] args) {
    AddByObj obj = new AddByObj(10 , 20);
    int sum = obj.add();
    System.out.println("Sum is : " + sum);
  }

}
