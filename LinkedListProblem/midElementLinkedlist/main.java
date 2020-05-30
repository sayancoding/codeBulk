

class Linkedlist{
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
  public int midElement(){
    if(head!=null){
      Node slow = head;
      Node fast = head;
      while(fast!=null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow.data;
    }
    return -1;
  }
}

class Main{
  public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list.insert(5);  
    list.insert(1);  
    list.insert(9);
    System.out.println(list.midElement());  
  }
}