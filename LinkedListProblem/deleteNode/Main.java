

class Main {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static Node head;

  static void insert(int data) {
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

  static void print() {
    if (head != null) {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }
  static void delete(int data){
    Node prev = null;
    Node curr = head;
    if(head.data == data){
      head = head.next;
      return;
    }
    while(curr != null){
      if(curr.data == data){
        prev.next = curr.next;
        // print();
        return ;
      }
      prev = curr;
      curr = curr.next;
    }
  }
  public static void main(String[] args) {
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    insert(5);
    print();
    System.out.println("deleting..");
    // delete(1);
    delete(5);
    print();
  }  
}