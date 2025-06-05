class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
        this.next = null;

    }
}
class LinkedList1{
    Node head;

     LinkedList1() {
        this.head = null;
    }

}
public class creation{
    public static void main(String args[]){
        LinkedList sll1 = new LinkedList();
        sll1.head = new Node(1);
        sll1.head.next = new Node(2);
        sll1.head.next.next = new Node(3);
        sll1.head.next.next.next = new Node(4);

        System.out.println(sll1.head.data);
        System.out.println(sll1.head.next.data);
        System.out.println(sll1.head.next.next.data); 
        System.out.println(sll1.head.next.next.next.data);
        System.out.println(sll1.head.next.next.next.next);
    }
}
/*insert at begin
 * insert at position
 * insert before position
 * insert before value
 * insert after value
 * insert at middle O(n),O(n/2)
 * deleted begain
 * delent end
 * delete pos
 * delete after value 
 * delete before 
 * delete at middle 
 * if(temp == null && k>1)
 * return"do not pos exist"
 * int count-1;
 * while((temp!= NULL &&
 *  count< k-1)(
 * if(temp == null && k>1)))
 * void dispaly(struct Node head){
 * while(head!=NULL){
 * print(head.data);
 * head = head.next;
 * }
 * }
*/