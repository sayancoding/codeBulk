class LinkedList {
  public class Node {
    int data;
    Node next;

    Node(int val) {
      data = val;
      this.next = null;
    }
  }

  public Node head;

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node curr = head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = newNode;
    }
  }

  public void print() {
    Node curr = head;
    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }
  public void deletedNthFromLast(int pos){
    int count = 0;
    Node last = head;
    while(last != null){
      count++;
      last = last.next;
    }
    int thFromFirst = count - pos;
    int countFromFirst = 0;
    if (countFromFirst == thFromFirst) {
      head = head.next;
      return ;
    }
    Node prev = null;
    Node curr = head;
    while(curr != null && countFromFirst!=thFromFirst){
      prev = curr;
      curr = curr.next;
      countFromFirst++;
    }
    prev.next = curr.next;

  }
}
class Main{
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(5);
    list.insert(2);
    list.insert(0);
    list.insert(1);
    list.insert(6);
    // list.print();
    list.deletedNthFromLast(2);
    list.print();
  }
}