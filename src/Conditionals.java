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
}
