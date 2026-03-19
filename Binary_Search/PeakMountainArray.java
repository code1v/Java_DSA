public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //we will compare the middle element with the next element if the middle element is greater than the next element then we are in the decreasing part of the array so we will move the end pointer to mid otherwise we are in the increasing part of the array so we will move the start pointer to mid+1
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                //we are in the increasing part of the array so we will move the start pointer to mid+1
                start=mid+1;
            }
        }
        return start;//at the end of the while loop start and end will be pointing to the same element which is the peak element in the mountain array
    }

}
/* 
here question is to find the peak element in the mountain array
the approach is to use binary search and compare the middle element with the next element if the middle element is greater than the next element then we are in the decreasing part of the array so we will move the end pointer to mid otherwise we are in the increasing part of the array so we will move the start pointer to mid+1
the time complexity of this approach is O(logn) and the space complexity is O(1)

*/