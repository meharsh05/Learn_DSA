import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = input.nextInt();

        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        int sum = a + b;
        int multi = a * b;

        System.out.println("The sum of a + b = " + sum);
        System.out.println("The multi of a * b = " + multi);
    }
}
