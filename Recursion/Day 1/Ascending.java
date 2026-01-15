
public class Ascending {
    static void asc(int x){
        if(x >5){
            return;
        }
        System.out.println(x);
        asc(x+1);
      
        
    }
    public static void main(String[] args) {
      
        asc(1);
    }
}
