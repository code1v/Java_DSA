public class Scope { //Scope means that where we can access our variables
    public static void main(String[] args) {
        int a=10;
        int b=20;
//In the same main function or any block two values cannot have same reference variables. This means that value cannot be initialize again with same name .
        {
            a=78;
            int c=11;// Values which will be initialize in the block ,will remain in the block .
        }
    }
}
/*
 * Anything which is initialize in main function can be used inside the block but cannot be initialize again .
 * In opposite case it is not same as if anything is initialize inside the block will not be used and initialize outside the block . 
 */
