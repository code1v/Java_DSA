public class Subset{
    public static void subset(String up,String p){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char chr=up.charAt(0);
        subset(up.substring(1), p+chr);
        subset(up.substring(1), p);
    }
    public static void main(String args[]){
        String up="abc";
        String p=" ";
        subset(up,p);
    }
}