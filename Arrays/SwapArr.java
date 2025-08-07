
import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);//Here while swapping in an array indexes are given to be swaped not the values .
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr ,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
}

/*
 * swapping is about changing the positions of elements in the array, and to change positions, we need to know their indexes, not just their values.
 */
