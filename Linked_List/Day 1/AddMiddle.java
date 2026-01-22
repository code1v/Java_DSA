
public class AddMiddle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    public void addMiddle(int data, int index) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        // add at head
        if (index == 0) {
            newNode.next = head;
            head = newNode;

            if (size == 0) {
                tail = newNode;
            }
            size++;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        AddMiddle list = new AddMiddle();

        list.addMiddle(1, 0);
        list.addMiddle(2, 1);
        list.addMiddle(3, 2);
        list.addMiddle(5, 3);

        list.print();   

        list.addMiddle(4, 3);

        list.print();
        System.out.println();
        System.out.print("Total size is "+size);
    }
}
