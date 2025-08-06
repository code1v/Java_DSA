import java.util.*;
public class ArmstrongNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        boolean ans=isArmstrong(n);
        System.out.println(ans);}

        static boolean isArmstrong(int m){
            int original=m;
            int sum=0;
            while(m>0){
            int rem=m%10;
            int cube=rem*rem*rem;
            sum+=cube;
            m=m/10;   
        }
        return sum==original;
    }
       
    }


/*
 * Armstrong number is basically taking every digit of a number and taking power of every digit with the total digits in that particular number and then adding them will give the same number which is written .
 */