Experiment 1(d): To Print Marks Above Sixty

Aim
To write a Java program to print the marks that are above 60 from a given array of marks.

Algorithm

Start the program.

Declare and initialize an integer array containing marks.

Traverse the array using a for loop.

Check whether each mark is greater than 60.

If the condition is true, print that mark.

Stop the program.

Source Code

public class Exp1d_MarksAboveSixty {
    public static void main(String[] args) {

        // Array containing student marks
        int[] marks = {45, 75, 60, 85, 55, 92, 68, 40};

        System.out.println("Marks above 60:");

        // Check and print marks above 60
        for (int mark : marks) {
            if (mark > 60) {
                System.out.println(mark);
            }
        }
    }
}

Result
Thus, the Java program to print marks above 60 was executed successfully.
