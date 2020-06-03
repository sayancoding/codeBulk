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

  static void groupReverse(int m,int n){
    int index = 1;
    Node curr = head;
    Node prev = null;
    while(index<m){
      prev = curr;
      curr = curr.next;
      index++;
    }
    System.out.println(prev.data);
    System.out.println(curr.data);
  }
  public static void main(String[] args) {
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    insert(5);
    groupReverse(2, 4);
  }
}