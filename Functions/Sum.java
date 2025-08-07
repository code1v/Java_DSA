import java.util.*;
public class Sum {
    public static void main(String[] args) {
        
        /*int a,b,c;
        System.out.print("a = ");
        a=sc.nextInt();
        System.out.print("b = ");
        b=sc.nextInt();
        c = a+b;
        System.out.print("a + b = "+c);*/
       // sum();//Function is called by using the brackets.
        //int ans=sum2();
        //System.out.print(ans);
        int ans = sum3(2,3);
        System.err.println(ans);
    }
/* Same sum question using function named sum .
 * In this function in starting we use static .
 */
    static void sum(){ //when we don't want to return anything we generally use void here
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("a = ");
        a=sc.nextInt();
        System.out.print("b = ");
        b=sc.nextInt();
        c = a+b;
        System.out.print("a + b = "+c);
    }
//In this section we are returning a value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("a = ");
        a=sc.nextInt();
        System.out.print("b = ");
        b=sc.nextInt();
        c = a+b;
        return c;//return means function will end here 
        //If by chance we try to write anything after the return statement 
        //then an error willshown to it.
    }

    //Functions can also be made by passing parameters
    //Pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
}
