// CREATE CONSTRUCTORS
public class Constructors {
    public static void main(String[] args) {
        Student vanshika ; //declaring reference variable 
        vanshika=new Student(); //initializing reference variable
        System.out.println(vanshika.rollno); // by default giving 0
       System.out.println(vanshika.marks);// by default giving 0.0
        System.out.println(vanshika.name);// by default giving null
        vanshika.changeName("pqr");
        vanshika.greeting();
        Student chaudhary=new Student(12,"mnc",87);
        System.out.println(chaudhary.name);
        System.out.println(vanshika.name);
        Student random = new Student(chaudhary);
        System.out.println(random.marks);
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

            void changeName(String newName){
                name=newName;
            }

            Student(Student other){
                this.rollno=other.rollno;
                this.name=other.name;
                this.marks=other.marks;
            }

            //If we want to call a constructor from another constructor then
            //it can be written as this(rno,name,marks) in an empty constructor like Student()
            //internally : new Student(13,"default person",100.0f);

            Student(){ //it is like a return type
                /*
                We need a way to add the values of the above 
                properties object by object
                So we need one word to access every object and that is "this" */
                this.marks=89.9f ;
                this.name="abc";
                this.rollno=19;
            }

    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

            
        } 