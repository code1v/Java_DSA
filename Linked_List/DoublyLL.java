public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public  Node head;
    public  Node tail;
    public  int size;

    //add first(Day 3)
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //add last(Day 3)
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    //remove first(Day 3)
    public int removeFirst(){
        if(head==null){
            System.out.print("Empty!!");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //remove last(Day 3)
    public int removeLast(){
        if(head==null){
            System.out.print("Empty!!");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=tail.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        
        return val;
    }

    //reverse (Day 3)
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
}



    //Print a Doubly LinkedList
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
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL ll=new DoublyLL();
        ll.addFirst(4);
        ll.addLast(6);
        ll.addLast(8);
        ll.addLast(10);
        ll.addLast(12);
        ll.removeFirst();
        ll.removeLast();
        ll.reverse();
        ll.print();
    }
}
