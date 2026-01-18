
import java.util.ArrayList;

public class AllOccurence {
    public static ArrayList<Integer> ao(int arr[] , int x,int i, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==x){
            list.add(i);
            return ao(arr,x,i+1,list);
        }
        return ao(arr,x,i+1,list);
    }
    public static void main(String[] args) {
        int arr[]={4,5,4,4,2,3,2};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print(ao(arr,7,0,list));
    }
    
}
