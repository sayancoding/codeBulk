import java.util.LinkedList;
import java.util.Queue;

class TreeNode
{
  int key;
  TreeNode left,right;
}

public class Main {
  static public TreeNode buildBST(TreeNode nd,int data)
  {
      if(nd == null){
        TreeNode node  = new TreeNode();
        node.key = data;
        node.left = null;
        node.right = null;
        nd = node;
      }
      else if(nd != null){
        if(nd.key>data)
        {
          nd.left = buildBST(nd.left, data);
        }
        if(nd.key<data)
        {
          nd.right = buildBST(nd.right, data);
        }
      }
      return nd;
  }

  static public void levelOrder(TreeNode root)
  {
    if(root == null) return;
    Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
    TreeNode cur = new TreeNode();
    cur = root;
    myQueue.add(cur);
    while(!myQueue.isEmpty())
    {
      System.out.println(myQueue.element().key);
      try{
        if(myQueue.element().left != null)
        myQueue.add(myQueue.element().left);        
        if (myQueue.element().right != null)
        myQueue.add(myQueue.element().right);
        myQueue.poll();
      }
      catch(Exception e){}

    }
  }
  
  public static void main(String[] args) {
    int[] preorder = new int[] { 8, 5, 1, 7, 10, 12};
    
    TreeNode root = new TreeNode();
    root = null;

    for(int i : preorder)
    {
      root = buildBST(root,i);
    }

    levelOrder(root);
  }
}