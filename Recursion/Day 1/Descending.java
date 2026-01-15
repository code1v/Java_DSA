public class Descending {
    static void desc(int x){
        if(x<=0){
            return;
        }
        System.out.println(x);
        desc(x-1);
        
    }
    public static void main(String[] args) {
        desc(5);
    }
    
}