import java.util.*;
public class AddFirst{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void print(){
        if(head==null){
            System.out.print("Empty!!");
            return ;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            AddFirst ll = new AddFirst();
            System.out.print("How many elements you want to add ? -> ");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter data: ");
                int m=sc.nextInt();
                ll.addFirst(m);
            }
            ll.print();
      
        
        
    }
}