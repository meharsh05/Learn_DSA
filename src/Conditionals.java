 /* Q.1 Take an input from user of their age, If age is greater than or equal to 18 tell user are they "eligible to drive" and
 if age is les  than 18 tell user "they need to be adult first". 
 
 import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age :");
            int age = sc.nextInt();

            if(age > 18){
                System.out.println("You are eligible to drive");
            }
            else{
                System.out.println("You need to be adult first");
            }
        }

    }
} */


/* Q.2 - Distribute bonus of Rs. 2000 to employee whose salary is greater than 20000/- , give bonus 
 of 1000/- to employee whose salary is greater than 15000/- but less than 20000 and 500/- to the employee
 whose salary is less than 15000/- .
 */

import java.util.Scanner;

class Conditionals{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter your Salary: ");
             int salary = s.nextInt();

             if(salary>=20000){
                salary = salary + 2000;
             }
             else if(salary > 15000 && salary < 20000){
                salary = salary + 1000;
             }
             else{
                salary = salary + 500;
             }

             System.out.println("The new salary is : " + salary);
        }
    }
}