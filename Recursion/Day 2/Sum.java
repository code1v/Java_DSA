public class Sum {
    public static int nsum(int x){
        if(x==0){
            return 0;
        }
        return x+nsum(x-1);
    }
    public static void main(String args[]){
        System.out.println(nsum(5));
    }
    
}
