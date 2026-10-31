Experiment 2(d): Leap Year

Aim

To write a Java program to check whether a given year is a leap year or not.

Algorithm

Start the program.

Read a year from the user.

Check whether the year is divisible by 400.

If not, check whether the year is divisible by 100.

If not, check whether the year is divisible by 4.

If the year is divisible by 400, or divisible by 4 but not by 100, it is a leap year.

Otherwise, it is not a leap year.

Display the result.

Stop the program.

Source Code

import java.util.Scanner;

public class Exp2d_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        sc.close();
    }
}

Result
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.
