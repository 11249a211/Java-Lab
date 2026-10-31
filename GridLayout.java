# Experiment 11: Grid Layout

## Aim

To write a Java program to demonstrate GridLayout and arrange components in rows and columns.

## Algorithm

1. Start the program.
2. Import the `java.awt` and `javax.swing` packages.
3. Create a `JFrame` window.
4. Set the layout manager to `GridLayout(3, 2)`.
5. Create six buttons.
6. Add all six buttons to the `JFrame`.
7. Set the size of the window.
8. Set the default close operation.
9. Make the window visible.
10. Stop the program.

## Program

import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("Grid Layout Example");

        f.setLayout(new GridLayout(3, 2));

        f.add(new JButton("Button 1"));
        f.add(new JButton("Button 2"));
        f.add(new JButton("Button 3"));
        f.add(new JButton("Button 4"));
        f.add(new JButton("Button 5"));
        f.add(new JButton("Button 6"));

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

Result
Thus, the Java program to demonstrate GridLayout was executed successfully, displaying buttons in a grid format with 3 rows and 2 columns with equal-sized cells.
