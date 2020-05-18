class LinkedList{
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  Node head;
  public LinkedList insert(LinkedList list,int data){
    Node new_node = new Node(data);
    
    if(list.head == null){
      list.head = new_node;
    }else{
      Node lastNode = list.head;
      while(lastNode.next != null){
        lastNode = lastNode.next;
      }
      lastNode.next = new_node;
    }
    return list; 
  }
  public void print(LinkedList list){
    if(list != null){
      Node temp = list.head ;
      while(temp!=null)
      {
        System.out.println(temp.data);
        temp = temp.next;
      }  
    }
  }
  public void evenOddPrint(LinkedList list){
    if(list.head == null) return ;
    else if(list.head.next == null || list.head.next.next == null ){
      print(list);
    }else{
      Node even = list.head;
      Node odd = list.head.next;
      while(even != null){
        System.out.println(even.data);
        if(even.next !=null)
        even = even.next.next;
        else
        break;
      }
      while(odd != null){
        System.out.println(odd.data);
        if(odd.next !=null)
        odd = odd.next.next;
        else
        break;
      }
    }
  }
}

class Main{
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list  = list.insert(list, 2);
    list  = list.insert(list, 5);
    list  = list.insert(list, 1);
    list  = list.insert(list, 4);
    list  = list.insert(list, 6);
    list.print(list);
    System.out.println("even - odd positioning..");
    list.evenOddPrint(list);
  }
}