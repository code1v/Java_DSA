public class Count {
    static void count(int x){
        if(x>5){
            return;
        }
        
        System.out.println(x);
        count(x+1);
        
    }
    public static void main(String[] args) {
      
        count(1);
    }
    
}
