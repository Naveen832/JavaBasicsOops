package demo;

public class CrossPattern {
    public static void main(String[] args) {
        int n = 5;

        // Print the upper half of the cross pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}











      /*  // Print the middle line of the cross pattern
        for (int i = 1; i <= n; i++) {
            if (i == (n / 2) + 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

     /*   // Print the lower half of the cross pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n - j + 1) || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }*/
        
 

