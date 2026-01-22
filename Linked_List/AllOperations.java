

public class AllOperations {
    public static class Node{
        //Customised Datatype
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Global Variables
    public static Node head;
    public static Node tail;
    public static int size;

    //Adding  node at first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

        
    }

    //Adding node at last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //Adding node at middle
    public void addMiddle(int data,int index){
        Node newNode=new Node(data);
        size++;
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int count=0;
        while(count<index-1){
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }


    //Remove node at first
    public int removeFirst(){
        if(head==null){
            System.out.print("Already Empty!!");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        size--;
        head=head.next;
      //  System.out.print(val);
        return val;
    }

    //Remove node at last
    public int removeLast(){
        if(size==0){
            System.out.print("Already Empty!!");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
       // System.out.print(val);
        return val;
    }


    //Remove node at middle
    public int removeMiddle(int index ){
        if(size==0){
            System.out.print("Already Empty!!");
            return Integer.MAX_VALUE;
        }
        else if(index==0 || size==1){
            return removeFirst();
            
        }
        else if(index==size-1){
            return removeLast();
        }

        Node nextValue=head;
        int count=0;
        while(count<index-1){
            nextValue=nextValue.next;
            count++;
        }
        int val=nextValue.next.data;
        nextValue.next=nextValue.next.next;
        size--;
       // System.out.print(val);
        return val;
    }


    //Search Iterative
    public int itrSearch(int key){
        if(head==null){
            System.out.print("Empty");
            return Integer.MAX_VALUE;
        }
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
     //   System.out.print(i);
        return -1;
    }



    //Print a LinkedList
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
        AllOperations ll = new AllOperations();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addMiddle(9, 1);
        ll.removeFirst();
        ll.removeLast();
        ll.removeMiddle(3);
        ll.itrSearch(6);
        ll.print();


    }



    
}
