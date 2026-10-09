import org.w3c.dom.Node;

public class CollectionFramework {
    public static void main(String[] args) {

    }
}
class LinkedList {
    static class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }
    public void get(int data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
    }
}





/*
Java provide us collection framework so that we can easily implements our logics easily . collection frameworks are the Data structures we will make some models of dsa also
here the following collection frameworks

------- LinkedList
------- set
------- stack/ques
------- Maps
these 4 is divided into furtheer parts we will look them one by one in next few git push
 */
