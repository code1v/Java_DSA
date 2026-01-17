public class POptimized {
    public static int op(int x,int n){
        if(n==0){
            return 1;
        }
        int hp=op(x,n/2)*op(x,n/2);
        if(n%2!=0){
            return hp*x;
        }
        return hp;
    }
    public static void main(String[] args) {
        System.out.println(op(2,3));
    }
    
}
