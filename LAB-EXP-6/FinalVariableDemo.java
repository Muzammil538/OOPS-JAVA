public class FinalVariableDemo {
  public static void main(String[] args) {
      final int MAX_VALUE = 100;
      System.out.println("Max Value: " + MAX_VALUE);

      // Uncommenting the following line will cause a compile-time error
      // MAX_VALUE = 200; 

      useFinalVariable(MAX_VALUE);
  }

  static void useFinalVariable(final int value) {
      System.out.println("Using final variable: " + value);
      // value = 300; // Compile-time error
  }
}