class Node
{
    int key;
    Node left , right;
}

class BST{
    public Node createNewNode(int val)
    {
        Node root = new Node();
        root.key = val;
        return root;
    }

    public Node insertNode(Node node,int val)
    {
        if(node == null)
        {
            return createNewNode(val);
        }
        if(val<node.key)
        {
            node.left = insertNode(node.left, val);
        }
        else if(val>node.key)
        {
            node.right = insertNode(node.right, val);
        }
        return node;
    }
}

class Main{
    public static void main(String[] args) {
        Node root = null;
        BST a = new BST();

        //Insert 1st as root
        root =  a.insertNode(root,12);
        root =  a.insertNode(root,4);
        root =  a.insertNode(root,6);
        root =  a.insertNode(root,10);
        root =  a.insertNode(root,4);
        root =  a.insertNode(root,7);
        root =  a.insertNode(root,1);
        root =  a.insertNode(root,14);
        root =  a.insertNode(root,13);
        System.out.println(root.left.right.right.key);
    }
}