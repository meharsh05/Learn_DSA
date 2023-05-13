import javax.swing.text.html.parser.Element;

public class Array {
     public static void main(String[] args) {
        int [] marks = {45, 25, 35, 78, 95};
        System.out.println(marks[3]);
        System.err.println(marks.length );  // Finding the length of an array

        // for(int i = 0; i<marks.length; i++){
        //     System.out.print(marks[i] + " ");  // Using for loop to dispaly an array 

        for(int Element : marks){
            System.out.print(Element + " "); // Using for each loop to print an array 
        }
        }
     }
