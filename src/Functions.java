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