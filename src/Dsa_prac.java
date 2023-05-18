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

/* Q.2 Take an input from user as an charatcer and print lower case or upper case letter 

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
} */

/* Q.3 Find the nth fibonacci number 

import java.util.Scanner;

class Dsa_prac{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the value of n:");
            int n = in.nextInt();

            int a = 0;
            int b = 1;
            int count = 2;

            while(count <=n){
                int temp = b;
                b = b + a;
                a = temp;
                count++;

            }
            System.out.println(b);
        }    
    }
} */

/* Q.4 Count the number of 5's 

class Dsa_prac{
    public static void main(String[] args) {
        
        int n = 154535;
        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
} */

/* Q.5 Take an input from user as number and reverse that number  */

import java.util.Scanner;

class Dsa_prac{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number to be reveresed: ");
            int num = in.nextInt();

            int ans = 0;
            while(num > 0){
                int rem = num % 10;
                num /= 10;

                ans = ans * 10 + rem;
            }
            System.out.println("The reversed number is : " + ans);
        }

    }
}