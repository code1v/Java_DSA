public class PMostOptimized {
    public static int mop(int x,int n){
        if(n==0){
            return 1;
        }
        int hp=mop(x,n/2);
        int hp1=hp*hp;
        if(n%2!=0){
            return hp1*x;
        }
        return hp1;
    }
    public static void main(String[] args) {
        System.out.println(mop(2,3));
    }
    
}
