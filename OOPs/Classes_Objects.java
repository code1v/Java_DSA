// CLASS and OBJECTS
public class Classes_Objects{
    public static void main(String[] args) {
       

        Student vanshika ; //declaring reference variable 
        vanshika=new Student(); //initializing reference variable
        vanshika.marks=89.9f ;
        vanshika.name="abc";
        vanshika.rollno=19;

       System.out.println(vanshika); //by default it is giving some random value like Student@25359ed8
       System.out.println(vanshika.rollno); // by default giving 0
       System.out.println(vanshika.marks);// by default giving 0.0
        System.out.println(vanshika.name);// by default giving null
    }
}

 //CREATE A CLASS
        //for every single student
        class Student{
            int rollno;
            String name ;
            float marks;
        }