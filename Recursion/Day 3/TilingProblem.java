public class TilingProblem {
    public static int countways(int i,int n){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        int twostep = countways(i+2,n);
        int onestep = countways(i+1,n);
        return twostep+onestep;
    }
    public static void main(String[] args) {
        System.out.println(countways(0,6));
    }
    
}
