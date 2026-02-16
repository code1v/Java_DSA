// CREATE CONSTRUCTORS
public class Constructors {
    public static void main(String[] args) {
        Student vanshika ; //declaring reference variable 
        vanshika=new Student(); //initializing reference variable
        System.out.println(vanshika.rollno); // by default giving 0
       System.out.println(vanshika.marks);// by default giving 0.0
        System.out.println(vanshika.name);// by default giving null
        vanshika.greeting();
    }
}


//CREATE A CLASS
        //for every single student
        class Student{
            int rollno;
            String name ;
            float marks;

            void greeting() {
                System.out.println("Hello my name is "+name);
            }

            Student(){ //it is like a return type
                /*
                We need a way to add the values of the above 
                properties object by object
                So we need one word to access every object and that is "this" */
                this.marks=89.9f ;
                this.name="abc";
                this.rollno=19;
            }
        } 