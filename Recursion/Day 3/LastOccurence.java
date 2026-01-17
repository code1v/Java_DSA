public class LastOccurence {
    public static int last(int arr[],int x,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
        return last(arr,x,i-1);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,1,5,0};
        System.out.println(last(arr,5,arr.length-1));
    }
    
}
