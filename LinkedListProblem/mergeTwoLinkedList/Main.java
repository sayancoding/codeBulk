class Linkedlist {
  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  public void insert(int data) {
    Node new_node = new Node(data);
    if (head == null) {
      head = new_node;
    } else {
      Node lastNode = head;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      lastNode.next = new_node;
    }
  }

  public void print() {
    if (head != null) {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }
}
class Main{
  static public Linkedlist mergeTwoList(Linkedlist l1,Linkedlist l2){
    Linkedlist newList = new Linkedlist();
    Linkedlist temp = newList;
    while(l1.head != null && l2.head != null){
      if(l1.head.data == l2.head.data){
        newList.insert(l1.head.data);
        newList.insert(l1.head.data);
        l1.head = l1.head.next; 
        l2.head = l2.head.next; 
      }
      l1.head = l1.head.next;
      l2.head = l2.head.next;
    }
    newList.print();
    return l1;
  }
  public static void main(String[] args) {
    Linkedlist l1 = new Linkedlist();
    Linkedlist l2 = new Linkedlist();
  l1.insert(1);    
  l1.insert(2);    
  l1.insert(4);    
  l2.insert(1);    
  l2.insert(3);    
  l2.insert(4);
    mergeTwoList(l1, l2);
  }
}