public class LinearSearch{
    public static int ls(int arr[],int key,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return ls(arr,key,idx+1);
    }
    public static void main(String args[]){
        int arr[]={9,5,3,6};
        System.out.print(ls(arr,4,0));
    }
}