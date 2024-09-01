
class VariableLength {
  public static void main(String[] args) {
    sum(1, 2, 3, 4, 5); // Test case 1
    sum(10, 20);        // Test case 2
}

static void sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    System.out.println("Sum: " + total);
}
}
