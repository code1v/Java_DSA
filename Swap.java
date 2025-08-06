public class Swap {
    public static void main(String[] args) {
        /*int a=10;
        int b=11;*/
       /* int temp=a;
        a=b;
        b=temp; */
        swap(12, 13);
        

    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.err.println(a+" "+b);
    }
}
