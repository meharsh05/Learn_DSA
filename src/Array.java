// /* 1 - 1D Array 
// public class Array {
//     public static void main(String[] args) {
//         int [] marks = {25, 35, 22, 55, 45};
//         System.out.println(marks.length);

//         for (int Element : marks){
//             System.out.print(Element + " ");
//         }
//     }
// } */

/* 2 - Printing 2D Array */

public class Array{
    public static void main(String[] args) {
        int[][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
                
            }
            System.out.println(" ");

        }
        }
    }
