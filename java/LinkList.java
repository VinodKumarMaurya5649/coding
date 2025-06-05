class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    LinkedList(){
        this.head = null;
    }

    public void insertAtBegain(int data) {
        Node newnode = new Node(data);
        newnode.next = this.head;
        head = newnode;
    }

    public void insertAtend(int data) {
        Node newnode = new Node(data);
        if (this.head == null) {
            head = newnode;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void insertAtPosition(int data, int position) {
        Node newnode = new Node(data);
        if (position < 1) {
            System.out.println("position invalid");
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("position out of range ");
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // public void insertAtmiddle(int data) {
    //     int j = 0;
    //     Node temp = this.head;
    //     while (temp != null) {
    //         j += 1;
    //         temp = temp.next;
    //     }
    //     Node temp2 =this.head;
    //     Node newnode = new Node(data);
    //     for (int i = 0; i < j/2-1; j++) {
    //         temp2 = temp2.next;
    //     }
    //     newnode.next = temp2.next;
    //     temp2.next = newnode;
    // }
    public void insertAtmiddle(int data) {
        Node newnode = new Node(data);
        if (this.head == null) {
            head = newnode;
            return;
        }
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newnode.next = slow.next;
        slow.next = newnode;
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

public class LinkList {
    public static void main(String[] args) {
        LinkedList s1 = new LinkedList();
        s1.insertAtBegain(1);
        s1.insertAtend(3);
        s1.insertAtend(8);
        s1.insertAtPosition(4, 1);
        s1.insertAtmiddle(56);
        s1.insertAtmiddle(78);
        s1.display();
    }
}