// Taking input from user of float values and storint into array
import java.util.Scanner;

public class Input_float{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of elements in the array: ");
        int n = sc.nextInt();

        float[] array = new float[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the float values for element " + i + ": ");
            array[i] = sc.nextFloat();
        }
        System.out.println("The array elements are: ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
