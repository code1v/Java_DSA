import java.util.Arrays;

public class MergeSort {
    public static int[] ms(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int leftarr[]=ms(Arrays.copyOfRange(arr,0,mid));
        int rightarr[]=ms(Arrays.copyOfRange(arr,mid+1,arr.length));

        merge(leftarr,rightarr);
        

    }
    public static int[] merge(int leftarr,int rightarr){
        int i=0;
        int j=0;
        int k=0;
        int newarr[]=new int[k];
        while(i<leftarr.length && j<rightarr.length){
            if(leftarr[i]<rightarr[j]){
                newarr[k]=leftarr[i];
                k++;
                i++;
            }
            if(leftarr[i]>rightarr[j]){
                newarr[k]=rightarr[j];
                k++;
                j++;
            }
        }
         while (i < leftarr.length) {
            newarr[k++] = leftarr[i++];
        }

        while (j < rightarr.length) {
            newarr[k++] = rightarr[j++];
        }
        return newarr;

    }
    public static void main(String[] args) {
        int arr[]={8,3,4,12,5,6};

    }
    
}
