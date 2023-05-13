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