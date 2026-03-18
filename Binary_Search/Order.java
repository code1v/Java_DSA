public class Order{
    public static void main(String[] args) {
        int[] arr={88,77,66,22,11};
        int target=22;
        int bs=orderagnosticbs(arr, target);
        System.out.println(bs);
    }

    public static int orderagnosticbs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        //find whether the array is sorted in ascending in ascending or descending order 
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            }
            else {
                if(arr[mid]<target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            }

            
           
        }
        return -1;
    }
}



/*
in this binary search array we do not know whether it is sorted in descending order or ascending order.
when target>middle -> left end=mid-1
     target<middle -> right start=mid+1
*/