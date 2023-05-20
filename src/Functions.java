/* Q.1 - Take an input of two numbers and return sum of those numbers. 

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        int ans = sum();
        System.out.println("The sum of two number is: " + ans);   
    }
    // Method created to sum two numbers 
    static int sum(){    
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the num1 value: ");
            int num1 = in.nextInt();
            System.out.print("Enter the num2 value: ");
            int num2 = in.nextInt();

            int sum = num1 + num2;

            return sum;
        }
    }
} */

/* Q.2 Return the string "Hello world" 

import java.util.Scanner;

class Functions{
    public static void main(String[] args) {

        String Message = greet();
        System.out.println("You got a message:");
        System.out.println(Message);
        
    }
    // Creating Method to return String Value
    static String greet(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your message");
            String msg = in.nextLine();

            return msg;
        }
    }
} */ 

/* Q.3 Variable length Arguments 
import java.util.Arrays;
class Functions{
    public static void main(String[] args) {
        fun("Harsh", "Vandana", "juhi", "Aaira");
    }
    static void fun(String...v){ // Variable length Argument is used and this can be used for any data type like int, char, float
        System.out.println(Arrays.toString(v));
    }
} */

/* Q.4 Print all 3 digit armstrong numbers 

import java.util.Scanner;

class Dsa_prac{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Enter the number: ");
            // int n = sc.nextInt();

            for (int i = 100; i < 1000; i++) {
                if(isArmstrong(i)){
                    System.out.println(i + " ");
                }   
            }
        }   
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
} */

/* Q.5 Take an input of numbers from user and tell whether number is prime or not prime. 

import java.util.Scanner;

class Dsa_prac{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = in.nextInt();
            
            boolean ans = isPrime(num);
            System.out.println(ans);
        }

    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int a = 2;
        while(a*a <= num){
            if(num % a == 0){
                return false;
            }
            a++;
        }
        return a*a > num;
    }
} */

/* Q.6 Take an input from user and print the factorial of n. */

import java.util.Scanner;

class Functions{
    static void sumFactorial(int n){
        if(n < 0){
            System.out.println("Invalid number");
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
    }
    System.out.println(factorial);
}
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            
            sumFactorial(n);
        }   
    }
}