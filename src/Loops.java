 /*  1. Printing Counting using while loop

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the value of num : ");
        num = sc.nextInt();10

        int i = 1;
       
         while(i<=num){
            System.out.print(i + " ");  // Double quotation mark stand for space
            i++;
        }
        System.out.println("Counting Finished!"); 
    }
    } */

    /* 2. Printing an table */

// import java.util.Scanner;

// public class Loops{
//         public static void main(String[] args) {
//             Scanner s = new Scanner(System.in);
//             int num;
//             int range;
//             int i = 1;

//             System.out.print("Enter the value of num: ");
//             num = s.nextInt();
//             System.out.print("Enter the range of table: ");
//             range = s.nextInt();

//             while(i<=range){
//                 System.out.println(num + " * " + i + " = " + num * i);
//                 i++;
//             }

//         }
//     }


/* 3. Print first 5 odd numbers  
public class Loops{
    public static void main(String[] args) {
        for(int i = 1; i<=10 ; i=i+2){
            System.out.println(i);
        }
    }
} */

/* 4. Print first 10 numbers using While loop  */

class Loops{
    public static void main(String[] args) {
        int count = 1;
        //int n = 10;
        while(count != 11){
            System.out.println(count);
            count++;
        }
    }
}

