import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num, i;

        System.out.println("Enter the elemts which you want to enter: ");
        num = sc.nextFloat();

        float arr[] = new float[num];
        System.out.println("enter the elements of array");

        for(i=0; i<num; i++){
            arr[i] = sc.nextFloat();
        }
        System.out.println("Dispaly elemnts of an array:");
        for(i = 0; i<num; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
