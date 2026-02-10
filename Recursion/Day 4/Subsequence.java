public class Subsequence {
    static void subset(String up,String p){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subset(up.substring(1), p+ch);
        subset(up.substring(1), p);


    }
    public static void main(String[] args) {
        subset("abc", "");
        System.out.print("null");
    }
}
