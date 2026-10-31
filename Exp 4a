Experiment 4(a): Armstrong Number

Aim
To write a Java program to check whether a given number is an Armstrong number or not.

Algorithm
Start the program.

Read a number from the user.

Count the number of digits in the given number.

Extract each digit using the modulus operator.

Raise each digit to the power of the total number of digits and add the results.

Compare the sum with the original number.

If both are equal, print that the number is an Armstrong number; otherwise, print that it is not.

Stop the program.

Source Code
import java.util.Scanner;

public class Exp4a_Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        if (num < 0) {
            System.out.println(num + " is not an Armstrong number");
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original + " is an Armstrong number");
            } else {
                System.out.println(original + " is not an Armstrong number");
            }
        }

        sc.close();
    }
}

Result
Thus, the Java program to check whether a number is an Armstrong number was executed successfully.
