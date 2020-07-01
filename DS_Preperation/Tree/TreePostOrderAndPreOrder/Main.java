class BST {
  class Node {
    int key;
    Node left, right;

    Node(int key) {
      this.key = key;
      this.left = this.right = null;
    }
  }

  Node root;

  BST() {
    root = null;
  }

  void insert(int key) {
    root = insertNode(root, key);
  }

  // check and insert node individually..
  Node insertNode(Node root, int key) {
    Node newNode = new Node(key);
    if (root == null) {
      root = newNode;
      return root;
    }
    if (root.key > key) {
      root.left = insertNode(root.left, key);
    }
    if (root.key < key) {
      root.right = insertNode(root.right, key);
    }
    return root;
  }

  void print() {
    System.out.println("PostOrder print...");
    this.postOrder(root);
    System.out.println("PreOrder print...");
    this.preOrder(root);
  }

  void postOrder(Node root) {
    if (root != null) {
      postOrder(root.left);
      postOrder(root.right);
      System.out.println(root.key);
    }
  }
  void preOrder(Node root) {
    if (root != null) {
      System.out.println(root.key);
      preOrder(root.left);
      preOrder(root.right);
    }
  }
}

class Main {
  public static void main(String[] args) {
    BST tree = new BST();
    tree.insert(11);
    tree.insert(5);
    tree.insert(13);
    tree.insert(10);
    tree.insert(3);

    tree.print();
  }
}