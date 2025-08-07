public class StringExample {
    public static void main(String[] args) {
        /*String str=greet();
        System.err.println(str);*/
        String ans = greet1("everyone");
        System.err.println(ans);
    }

    static String greet(){//we always have to return that data type which is mentioned here 
        //if there is written string then only string can be passed no other data type can be passed .
        String greeting="Heyy";
        return greeting;
    }

    static String greet1(String str1){
        String message="Heyy "+str1;
        return message;
    }
}
