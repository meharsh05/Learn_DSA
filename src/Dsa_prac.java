/* Q1. Take an input of 3 numbers from user and print the max.
 number using conditional statements.
 

import java.util.Scanner;

public class Dsa_prac {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");

            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            int max = 0;

            if(a > b){
                max = a;
            }
            else{
                max = b;
            }
            if(c > max){
                max = c;
            }
            System.out.println("The maximum value is " + max);
        }
    }
} */

/* Q.2 Take an input from user as an charatcer and print lower case or upper case letter */

import java.util.Scanner;

class Dsa_prac{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the character:");
            char ch = s.next().charAt(0); // Taking char as an input 

            if(ch >= 'a' && ch <= 'z'){
                System.out.println("It's lowercase");
            }
            else{
                System.out.println("It's Uppercase");
            }
        }
    }
}
