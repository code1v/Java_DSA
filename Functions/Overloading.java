public class Overloading {
    public static void main(String[] args) {
        fun(12);
        fun("hi");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }
}
/*
 * Two functions with same name can be existed if there parameters are different . This is know as overloading .
 */