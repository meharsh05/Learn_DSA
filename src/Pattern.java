/* Pattern 1. Print pattern
        
        *****
        ****
        ***
        **
        *
 */

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Enter the value of n: ");
            n = sc.nextInt();

            for (int i = n; i>0; i--){
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.print("\n");

            }
        }
    }
}
