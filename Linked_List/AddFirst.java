/*
 * In this a node is added at the first position of the existing Linked List .
 * 
 */
public class AddFirst {
    class Node{
        int data;
        Node next;

        Node(int  data){
            this.data=data;
            this.next=null;
        }
    }

    Node head = null;

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddFirst list = new AddFirst();
        
        list.printList();
    }

    
}
