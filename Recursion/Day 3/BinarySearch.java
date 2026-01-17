public class BinarySearch {
    public static int bs(int arr[],int x,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            return bs(arr,x,s,mid-1);
        }
        else{
            return bs(arr,x,mid+1,e);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6};
        int l=arr.length-1;
        System.out.println(bs(arr,3,0,l));
    }
    
}
