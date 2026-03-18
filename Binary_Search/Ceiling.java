public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int t=22;
        int ans=ceil(arr, t);
        System.out.println(ans);
    }

    static int ceil(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
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
        return start;
    }
}


/*
*>we are given an array like sorted array and target number too

*>ceiling of a number means in this array smallest element that is greater or equal to the target element.

*>if target is not present in an array then the closest(smallest) next bigger element to target element in the array will be the answer.

*>
*/


