
class AccessModifiersDemo {
  private int privateVar = 10;
  protected int protectedVar = 20;
  int defaultVar = 30;
  public int publicVar = 40;

  public static void main(String[] args) {
    AccessModifiersDemo obj = new AccessModifiersDemo();
    System.out.println("Private Var: " + obj.privateVar);
    System.out.println("Protected Var: " + obj.protectedVar);
    System.out.println("Default Var: " + obj.defaultVar);
    System.out.println("Public Var: " + obj.publicVar);
  }
}

