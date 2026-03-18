public class Wrapper {
    public static void main(String[] args) {
        int a=10;

        Integer num=45; // now it is created like an object

        final A vanshika=new A("Vanshika");
        vanshika.name="Chaudhary";

        //when a non primitive is final , we cannot reassign it .
        //like vanshika=new A("new object");

        
    }
}

class A{
    final int num=36; //now this is immutable
    String name;

    public A(String name){
        this.name=name;
    }
}