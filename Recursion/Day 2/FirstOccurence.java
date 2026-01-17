public class FirstOccurence {
    public static int number(int arr[],int x,int index){
        if(index>arr.length-1){
            return -1;
        }
        if(arr[index]==x){
            return index;
        }
        return number(arr,x,index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,9,3,3,4,3,9};
        System.out.println("The number is present at index "+number(arr,5,0));
    }
    
}
