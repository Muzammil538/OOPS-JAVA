class A {
  void display() {
      System.out.println("Class A Display");
  }
}

class B extends A {
  @Override
  void display() {
      System.out.println("Class B Display");
  }
}

public class DynamicDispatchDemo {
  public static void main(String[] args) {
      A obj = new B();  // Reference of type A but object of type B
      obj.display();    // Calls B's display method due to dynamic dispatch
  }
}