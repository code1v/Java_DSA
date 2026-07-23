package Recursion;

public class ReverseArray {
    public static void reverse(int[] arr,int left,int right){
        
        if(left>=right){
            return;
        }       
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        int[] arr={22,44,10,45,67,89};
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
