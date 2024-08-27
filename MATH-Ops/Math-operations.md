# Math Operations Class Documentation

The `MathOps` class provides a variety of mathematical operations. Below is a brief explanation of each function:

## Methods

### Two Variable Operations

- **`sum(int a, int b)`**: Adds two integers.
- **`subs(int a, int b)`**: Subtracts the second integer from the first.
- **`prod(int a, int b)`**: Multiplies two integers.
- **`divide(double a, double b)`**: Divides the first double by the second.

### Array Operations

- **`sumArray(int[] arr)`**: Calculates the sum of all elements in an array.
- **`prodArray(int[] arr)`**: Calculates the product of all elements in an array.
- **`getMaxArray(int[] arr)`**: Finds the maximum value in an array.
- **`getMinArray(int[] arr)`**: Finds the minimum value in an array.

### Maximum and Minimum Operations

- **`getMax(int a, int b)`**: Prints the maximum of two integers.
- **`getMin(int a, int b)`**: Prints the minimum of two integers.

### Mathematical Operations

- **`square(int a)`**: Returns the square of an integer.
- **`cube(int a)`**: Returns the cube of an integer.
- **`power(double base, double n)`**: Raises the base to the power `n`.

### Area Calculations

- **`quadArea(int l, int b)`**: Calculates the area of a quadrilateral.
- **`circleArea(double r)`**: Calculates the area of a circle.

### Quadratic Equation Solver

- **`quadEqatn(double a , double b , double c)`**: Solves a quadratic equation and prints the roots.

### Factorial Calculation

- **`factorial(int a)`**: Computes and prints the factorial of an integer.

## How to Run the Code

To use the `MathOps` class:

1. **Instantiate the class**: 
  ```java
  MathOps mathOps = new MathOps();
  ```
   
2. **Call the methods and compile/run the code**:
  ```java 
  int result = mathOps.sum(5, 3);
  mathOps.getMax(10, 20);
  ```

3. **To run the code**:
  Compile: Use javac MathOps.java to compile the code.
  Run: Use java MathOps to execute the compiled code.