package Linear_Search;
public class LinearSrch {
    public static void main(String args[]){
        int[] arr={23,45,78,98,34};
        int n=45;
        LinearSearch(arr, n);
    }

    //Search in the array : return the index if item found in an array
    //Otherwise if item not found return -1
    static int LinearSearch(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element=arr[i];
            if(element==target){
                System.out.println("Element found at index "+element);
            }
            else{
                return -1;
            }
        }
        return 0;
    }
}
