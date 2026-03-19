public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=9;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
       //first we will find the range in which the target element is present
        int start=0;
        int end=1;

        //we will keep doubling the end index until the target element is less than or equal to the element at the end index
        while(target>arr[end]){
            int temp=end+1;//this is the new start index
            end=end*2;//this is the new end index
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
