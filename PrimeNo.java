import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int m){
        if(m<=1){
            return false;
        }
        int c=2;
        while(c*c<=m){
            if(m%c==0){
                return false;
            }
            c++;
        }
        
            if(c*c>m){
                return true;
            }
            return false;
    }
}
