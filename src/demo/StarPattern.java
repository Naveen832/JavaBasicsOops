package demo;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Print the pattern
        for (int i = 0; i < rows; i++) {
            // Print spaces before stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < (rows - i); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
