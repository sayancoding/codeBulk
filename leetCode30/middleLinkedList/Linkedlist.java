class Linkedlist{
  public class Node {
    int value;
    Node next;

    Node(int val) {
      this.value = val;
      this.next = null;
    }
    
    Node head;
    
    public void insertNode(int data) {
    Node node = new Node(data);
    if (head == null) {
      head = node;
    } else {
      Node n = head;
      while (n != null) {
        n = n.next;
      }
      n.next = node;
    }
  }

  public void showList() {
    Node n = head;
    while (n != null) {
      System.out.println(n.value);
      n = n.next;
    }
  }
  }
  public static void main(String[] args) {
    Linkedlist obj = new Linkedlist();
  }
}