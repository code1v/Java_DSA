public class PassingInFunctions {
    public static void main(String[] args) {
        int[] num={3,4,5,6};
        System.out.println(java.util.Arrays.toString(num));
        change(num);
        System.out.println(java.util.Arrays.toString(num));
    }

    static void change(int[] arr){
        arr[0]=99;
    }
}
