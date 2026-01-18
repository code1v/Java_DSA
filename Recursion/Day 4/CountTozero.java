public class CountTozero{
    public static int steps(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return steps(n/2,c+1);
        }
        return steps(n-1,c+1);
    }
    public static void main(String[] args) {
        System.out.print(steps(12,0));
    }
}