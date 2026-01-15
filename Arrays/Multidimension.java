import java.util.*;
public class Multidimension {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){//In this try block ";" this symbol is not usually required 
             /*
         * In 2D array , it is basically seen as a matrix with multiple rows and columns . 
         * Basically like arrays of array .
         * for example,   1 2 3
                         4 5 6
                         7 8 9
         */

         //int[][] arr =new int[3][3]; //During declaring the 2D array number ofrows to write are mandatory .

         //2D array can also be declared like this 
         /*int[][] array = {
            {1,2,3}, //0th index
            {4,5}, //1st index
            {6,7,8,9} //2nd index
         };*/

        //input
        /*for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                array1[j] = sc.nextInt();
            }
        }*/


System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

int[][] arr = new int[rows][];

for (int i = 0; i < rows; i++) {
    System.out.print("Enter number of columns for row " + i + ": ");
    int cols = sc.nextInt();
    arr[i] = new int[cols];

    for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
    }
}

        

            //output
            /*System.out.print(java.util.Arrays.toString(array));
             * when we write this code to print the 2-D array ,then we will not get the desired output .
             * infact we will get only the memory address instead of actual 2-D array .
             * which is something like this : [[I@3bd40a57, [I@fdefd3f, [I@d83da2e]
             */
           /*  for (int[] row : array) {
            for (int val : row) {
            System.out.print(val + " ");
            }
            System.out.println();
            }     */

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
       
    }
}
