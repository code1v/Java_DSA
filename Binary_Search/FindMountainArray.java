public class FindMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){//if the target element is found in the first half of the array then we will return the index of the target element
            return firstTry;
        }
        //if the target element is not found in the first half of the array then we will search for the target element in the second half of the array
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int orderAgnosticBS(int[] arr,int target,int start,int end){
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }   

    static int peakIndexInMountainArray(int[] arr){
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
        return start;
    }

}

/*
in this question we are given a mountain array and a target element and we have to find the index of the target element in the mountain array if it is present otherwise we have to return -1
the approach is to first find the peak element in the mountain array and then we will search for the target element in the first half of the array and if we do not find the target element in the first half of the array then we will search for the target element in the second half of the array
the time complexity of this approach is O(logn) and the space complexity is O(1
*/
