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

    //Adding  node at first (Day 1)
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

    //Adding node at last (Day 1)
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

    //Adding node at middle (Day 1)
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


    //Remove node at first (Day 1)
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

    //Remove node at last (Day 1)
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


    //Remove node at middle (Day 1)
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


    //Search Iterative (Day 1)
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


    //Reverse a LinkedList (Day 2)
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //Find and Remove the node from end (Day 2)
    public void deletefromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        Node prev=head;
        int i=1;
        int find=sz-n;
        while(i<find){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //Palindrome (Day 2)
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid = findMid(head);
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

   

    //Detect a loop cycle (Day 2)
    public boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next; 

            if (slow == fast) {
                return true; 
            }
        }
        return false; 
    }

    //Creating a loop cycle and remove it also (Day 2)
    public Node addCycle(Node head){
         Node node3 = head.next.next;
        tail.next = node3;
        return head;
    }
    public void removeLoop(Node head) {

        if (head == null || head.next == null) return;

   
        //Node node3 = head.next.next;
        //tail.next = node3;
 
   
        Node slow = head;
        Node fast = head;
        boolean hasLoop = false;

        while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;

        if (slow == fast) {
            hasLoop = true;
            break;
        }
    }

        if (!hasLoop) return;

  
        slow = head;
        Node prev=null;
         while (slow != fast) {
          slow = slow.next;
          prev=fast;
          fast = fast.next;
    }
    prev.next=null;
}


//Merge Sort (Day 3)
public Node mergeSort(Node head){
    if(head==null || head.next==null){
        return head;
    }
    Node mid=findMid(head);
    Node rightHead=mid.next;
    mid.next=null;

    Node newLeft=mergeSort(head);
    Node newRight=mergeSort(rightHead);

    return merge(newLeft,newRight);
}
public Node merge(Node head1,Node head2){
    Node mergeLL=new Node(-1);
    Node temp=mergeLL;
    while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
    while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
    }
    while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
    }
    return mergeLL.next;

    
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
        System.out.println("null");
    }

    public static void main(String[] args) {
        AllOperations ll = new AllOperations();
        AllOperations LL =new AllOperations();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(7);
      //  LL.addFirst(2);
      //  LL.addLast(66);
       // LL.addLast(3);
       // LL.addLast(44);
       // LL.addLast(55);
       // LL.addLast(63);
      //  LL.addLast(77);
     //   ll.addMiddle(9, 1);
     //   ll.removeFirst();
      //  ll.removeLast();
      //  ll.removeMiddle(3);
      //  ll.itrSearch(6);
       // ll.reverse();
     //  ll.deletefromEnd(3);
   // System.out.println( ll.hasCycle(head));
    //ll.addCycle(head);
    //System.out.println( ll.hasCycle(head));
    //ll.removeLoop(head);
  //  head=ll.mergeSort(head);
    ll.print();
    }    
}
