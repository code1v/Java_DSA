public class Comparison {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        System.out.println(a==b);

        String c=new String("pqr");
        String d=new String("pqr");
        System.out.println(c==d);
        System.out.println(c.equals(d));//only care about the value
        
    }
}

/*  1. == method is actually a comparitor
    2. Creating different objects with same value outside the pool but in heap . 
    3. When we only need to check values use only == comparitor .
*/