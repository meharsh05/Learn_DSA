
import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the value of a: ");
        a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        b = sc.nextInt();

        char op;
        System.out.print("Enter the function you want to perform: ");
        op = sc.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            default -> System.out.println("Please enter a valid operation");
        }

    }
}