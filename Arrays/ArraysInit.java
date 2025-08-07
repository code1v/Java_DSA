import java.util.*;
public class ArraysInit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int[] marks = new int[3];
       int abc[]={1,2,3};
        marks[0]=67;
        marks[1]=98;
        marks[2]=25;
        System.out.println(marks[0]);
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }*/

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        //input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //output
        System.out.print(java.util.Arrays.toString(arr));// this is one of the method to print an array in java 
       /*  System.out.println("Array is ");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }  

        //This loop is for each loop
        for(int j : arr){ // for every element in array print the element . 
            System.out.print(j+" ");//Here j represents elements of an array .
        }*/
    }


    static boolean ToString(int[][] array) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

/*
 * Declaring an array 
 * data_type[] name = new data_type[size]
 */

/*
 * All the type of data in an array should be same . we cannot store different data_types data in an array .
 */

/*
 * Dynamic memory Allocation :- At the runtime memory is allocated .
 */

 