import java.util.*;
public class ColNoFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr ={
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
