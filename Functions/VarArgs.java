
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,8,32,5,66,3453);
        multiple(2,3,"a","b","c");
    }

    static void multiple(int a,int b,String ...v){
     
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
