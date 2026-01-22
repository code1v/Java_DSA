import java.util.*;
public class Add{
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

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;
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
            Add ll = new Add();
            System.out.print("How many elements you want to add at first ? -> ");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter data: ");
                int m=sc.nextInt();
                ll.addFirst(m);
            }

            System.out.print("Enter the data you want to add at last : ");
            int a=sc.nextInt();
            ll.addLast(a);
            ll.print();
            System.out.println();
            System.out.print("Total size is "+size);
    }
}