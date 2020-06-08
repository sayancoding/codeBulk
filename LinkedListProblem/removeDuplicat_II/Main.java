
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

  static void removeDuplication() {
    Node back = new Node(0);
    Node prev = new Node(0);
    Node next = head;
    while (next != null) {
      if (prev.data != next.data) {
        back = prev;
        prev = next;
        next = next.next;
      } else {
        Node temp = next;
        while (temp.data == temp.next.data) {
          temp = temp.next;
        }
        prev = temp.next;
        back.next = prev;
        next = prev.next;
      }
    }
  }

  public static void main(String[] args) {
    insert(1);
    insert(2);
    insert(2);
    insert(3);
    insert(4);
    // print();
    removeDuplication();
    print();

  }
}