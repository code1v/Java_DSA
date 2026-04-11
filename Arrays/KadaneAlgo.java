public class KadaneAlgo {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}

/*
this program implements Kadane's Algorithm to find the maximum sum of a contiguous subarray within a one-dimensional array of integers. The algorithm iterates through the array, keeping track of the current sum of the subarray and updating the maximum sum found so far. If the current sum becomes negative, it resets to zero, as a negative sum would not contribute to a maximum sum in future iterations. The time complexity of this algorithm is O(n), where n is the length of the input array, making it efficient for large arrays.

each line of code is explained as follows:
1. The main method initializes an array of integers and calls the maxSubArray method to find the maximum sum of a contiguous subarray, printing the result.
2. The maxSubArray method takes an array of integers as input and initializes two variables: maxSum to the smallest possible integer value and currentSum to zero.
3. The method iterates through each number in the input array, adding it to currentSum.
4. After updating currentSum, it compares it with maxSum and updates maxSum if currentSum is greater.
5. If currentSum becomes negative, it resets to zero, as a negative sum would not contribute to a maximum sum in future iterations. 


leetcode problem number: 53. Maximum Subarray
*/