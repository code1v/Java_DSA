import java.util.*;
public class ArraySrch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of an array : ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number which you want to find : ");
        int a = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("The number is found at index "+ i);
            }
        }
    }
}
