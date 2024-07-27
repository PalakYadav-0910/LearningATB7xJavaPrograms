package Coding_Assignments;

public class LeftTriangle_StarPattern {

    public static void main(String[] args) {

        // ✅ Left Triangle Star Pattern
        /*

         *****
         ****
         ***
         **
         *

         */

        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
