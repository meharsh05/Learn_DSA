/* Ques 1 - Print the sum of given n nmubers 

import java.util.Scanner;

public class PracticeQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("The sum of even numbers is: ");
        System.out.println(sum);    
    }
} */

/* Ques 2. Print table  

import java.util.Scanner;

public class PracticeQues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        
    }
} */

/* Ques 3. Write a program to find factorial of a given number using for loop 

import java.util.Scanner;

public class PracticeQues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int factorial = 1;

        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
} */

/* Ques 4.  Create an array of 5 floats and print sum of them */

public class PracticeQues{
    public static void main(String[] args){
        float[] marks = {20.12f, 35.25f, 55.10f, 60.12f};
        float sum = 0;

        // for(int i = 0; i<marks.length; i++){
        //     sum = sum + marks[i];
        // }

        for(float Element : marks){
            sum = sum + Element;
        }
        System.out.println("The value of sum is: " + sum);
        
    }
}
