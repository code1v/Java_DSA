import java.util.*;
public class SortedArray {
    public static boolean sr(int arr[],int i){
        if(i>arr.length-1){
            return true;
        }
        if(arr[i]<arr[i-1]){
            return false;
        }
        return sr(arr,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(sr(arr,1));
    }
    
}
