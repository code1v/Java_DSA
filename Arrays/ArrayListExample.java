import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);//An element will be added in the list 
        list.add(56);
        list.clear();//List will be present but elements in the list will be deleted .
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.contains(56));//Checks if the desired number is in the list or not and will return true/false .
        list.set(0,4);//Using set method we can change the value at any specific index .
        System.out.println(list);
        list.remove(2);//To remove an element an index number should be given to remove the desired number .
        System.out.println(list);


        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        //output
        //System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here .
        }
    }
}


//Syntax
/*
 * ArrayList<Integer> list = new ArrayList<Integer>();
 */

 /*
  * It is a resizable array in java .
  * This Array is not fixed like other regular arrays .
  * Elements are accessed by index .
  * Also allows duplicate values .
  * It also maintains insertion order .
  * we don't need to know the size in advance(unlike arrays) .
  * Comes with built-in methods like .add(), .remove(), .contains(), etc.
  * Makes code cleaner and easier to manage.
  */
  /* Internal working of an ArrayList 
   * Size is fixed internally .
   * If arraylist fills by some amount then ,
   * *It will create a new arraylist of say,double the size .
   * *Old elements are copied in new one .
   * *Old one is deleted .
   */