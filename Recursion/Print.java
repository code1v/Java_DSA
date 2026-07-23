package Recursion;

public class Print {
    static void printNumbers(int x,int n){
        if(x>n){
            return;
        }
        System.out.println(x);
        printNumbers(x+1,n);
    }
    public static void main(String[] args) {
        printNumbers(1,10);
    }
}
