public class RemoveA {
    public static String remove(String str,StringBuilder s,int i){
        if(i==str.length()){
            return s.toString();
        }
        char currchar=str.charAt(i);
        if(currchar=='a'){
            return remove(str,s,i+1);
        }
        return remove(str,s.append(currchar),i+1);
    }
    public static void main(String[] args) {
        String str="baccad";
        StringBuilder s=new StringBuilder();
        System.out.print(remove(str,s,0));
        
    }
    
}
