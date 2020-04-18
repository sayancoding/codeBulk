class Node
{
  int key;
  Node left,right;
}

class BST
{
  public Node createNewNode(int value)
  {
    Node node = new Node();
    node.key = value;
    node.left = node.right = null;
    return node;
  }

  public Node insetNode(Node nd,int value)
  {
    if(nd == null)
    {
      return createNewNode(value);
    }
    if(nd.key>value)
    {
      nd.left = insetNode(nd.left,value);
    }
    else if(nd.key<value)
    {
      nd.right = insetNode(nd.right, value);
    }
    return nd;
  }
}

class Main
{
  public static void main(String[] args) {
    Node root = new Node();
    BST a = new BST();
    root = null;
    root = a.insetNode(root, 5);
    root = a.insetNode(root, 3);
    root = a.insetNode(root, 10);
    root = a.insetNode(root, 4);
    root = a.insetNode(root, 8);
    root = a.insetNode(root, 12);
    System.out.println(root.left.key);
  }
}