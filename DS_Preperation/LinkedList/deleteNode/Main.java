
class LinkedList{
  public class Node{
    int data;
    Node next;
    Node(int val){
      data = val;
      this.next = null;
    }
  }
  public Node head;

  public void insert(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
    }else{
      Node curr = head;
      while(curr.next != null){
        curr = curr.next;
      }
      curr.next = newNode;
    }
  }

  public void print(){
    Node curr = head;
    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }
  public void deleteNode(int data){
    Node prev = null;
    Node curr = head;
    //id find at head
    if(head.data == data)
    {
      head = head.next;
      return;
    }

    while(curr != null){
      if(curr.data == data){
        prev.next = curr.next;
        return;
      }
      prev = curr;
      curr = curr.next;
    }
  }
}
class Main{
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(5);
    list.insert(1);
    list.insert(9);
    list.print();
    list.deleteNode(9);
    System.out.println("--------------");
    list.print();
  }
}