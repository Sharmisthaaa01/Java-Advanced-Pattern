/*
    Print a hollow Butterfly.

      *        *
      **      **
      * *    * *
      *  *  *  *
      *   **   *
      *   **   *
      *  *  *  *
      * *    * *
      **      **
      *        *

 */
public class AdvancedPattern8 {
    public static void main(String[] args) {
        int n = 5; // Size of the butterfly (adjust as needed)

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left part of the upper half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right part of the upper half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left part of the lower half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right part of the lower half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

