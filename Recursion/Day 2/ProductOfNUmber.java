public class ProductOfNUmber {
    public static int product(int x){
        if(x==0){
            return 1;
        }
        return x%10*product(x/10);
    }
    public static void main(String[] args) {
        System.out.println(product(54321));
    }
    
}
