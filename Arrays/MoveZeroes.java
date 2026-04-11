public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
}


/*
In this program, the moveZeroes method takes an array of integers as input and moves all the zeroes to the end of the array while maintaining the relative order of the non-zero elements. The method uses a variable lastNonZeroFoundAt to keep track of the position where the next non-zero element should be placed. It iterates through the array, and whenever it encounters a non-zero element, it places it at the lastNonZeroFoundAt index and increments that index. After processing all elements, it fills the remaining positions in the array with zeroes. The time complexity of this algorithm is O(n), where n is the length of the input array, making it efficient for large arrays.

each line of code is explained as follows:
1. The main method initializes an array of integers and calls the moveZeroes method to rearrange the elements, then prints the modified array.
2. The moveZeroes method initializes a variable lastNonZeroFoundAt to keep track of the index where the next non-zero element should be placed.
3. The method iterates through the input array, and for each non-zero element, it places it at the lastNonZeroFoundAt index and increments that index.
4. After processing all elements, it fills the remaining positions in the array with zeroes, starting from the lastNonZeroFoundAt index to the end of the array.


leetcode problem number: 283. Move Zeroes
*/
