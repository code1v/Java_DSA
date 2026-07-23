package Recursion;

public class PrintReverse {
    static void printreverse(int x,int n){
        if(x<n){
            return;
        }
        System.out.println(x);
        printreverse(x-1,n);
    }
    public static void main(String[] args) {
        printreverse(10,1);
    }
    
}
