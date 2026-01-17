public class RemoveDuplicate {
    public static String Remove(String str,int i,StringBuilder s, boolean map[]){
        if(i==str.length()){
            return s.toString();
        }
        char currchar=str.charAt(i);
        if(map[currchar-'a']==true){
            return Remove(str,i+1,s,map);
        }
        else{
            map[currchar-'a']=true;
            return Remove(str,i+1,s.append(currchar),map);

        }

    }
    public static void main(String[] args) {
        String str ="appnacollege";
        StringBuilder s = new StringBuilder();
        boolean map[] = new boolean[26];

        System.out.print(Remove(str,0,s,map));
    }
    
}
