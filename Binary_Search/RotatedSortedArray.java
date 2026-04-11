public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int pivot = searchPivot(arr);
        System.out.println("Pivot index: " + pivot);

    }

    public static int searchPivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            // 4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[start]>=arr[mid]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }   return -1;
    }

}


/*
leetcode question link: https://leetcode.com/problems/find-pivot-index/description/
in this question we have to find the pivot element in the rotated sorted array. The pivot element is the largest element in the array and it is the point where the array is rotated. We can use binary search to find the pivot element in O(log n) time complexity. We will check for 4 cases in each iteration of the binary search to find the pivot element. If we find the pivot element, we will return its index. If we don't find the pivot element, we will return -1.
*/