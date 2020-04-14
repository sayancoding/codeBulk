// package simpleTree;
class Node{
  int key;
  Node left,right;
  Node(int key)
  {
    this.key = key;
    left = right = null;
  }
}

//  class BinaryTree {
//    Node root;
//    BinaryTree(int key){
//    root = new Node(key);
//    }
//    BinaryTree(){
//    root = null;
//    }
//   public static void main(String[] args) {
//     BinaryTree tree = new BinaryTree();
//     tree.root = new Node(12);
//     tree.root.left = new Node(10);
//     tree.root.right = new Node(18);

//     System.out.println(tree.root.key);
//     System.out.println(tree.root.left.key);
//     System.out.println(tree.root.right.key);
//   }
// }
class BST{
  public Node insert(Node nd,int val)
  {

    return nd;
  }
}

class Main{
  public static void main(String[] args) {
    BST a = new BST();
    Node root = null;
  }
}