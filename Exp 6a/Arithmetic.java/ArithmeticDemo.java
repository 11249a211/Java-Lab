# Experiment 6(a): Arithmetic Operations Using Packages

## Aim

To write a Java program to perform arithmetic operations using a user-defined package.

## Algorithm

1. Start the program.
2. Create a package named Exp6a.
3. Define methods for addition, subtraction, multiplication, and division in the Arithmetic class.
4. Create the ArithmeticDemo class.
5. Create an object of the Arithmetic class.
6. Call the arithmetic methods and display their results.
7. Stop the program.

## Program

The program is implemented in the following two files:

* Arithmetic.java
* ArithmeticDemo.java

## Result

Thus, the Java program to perform arithmetic operations using a user-defined package was written successfully.

  package Exp6a;

public class Arithmetic {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(
                "Division by zero is not allowed"
            );
        }
        return (double) a / b;
    }
}

package Exp6a;

public class ArithmeticDemo {
    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + obj.add(a, b));
        System.out.println("Subtraction: " + obj.subtract(a, b));
        System.out.println("Multiplication: " + obj.multiply(a, b));
        System.out.println("Division: " + obj.divide(a, b));
    }
}
