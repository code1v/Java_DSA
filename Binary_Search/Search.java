public class Search{
    public static void main(String[] args) {
        int[] arr={1,5,7,22,88};
        int target=23;
        int bs=BS(arr, target);
        System.out.println(bs);
    }

    public static  int BS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}