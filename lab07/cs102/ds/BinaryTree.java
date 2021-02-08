/** this is a binary tree*/

public class BinaryTree
{
   //Fields
   private Node root;
   
   //constructors
   public BinaryTree()
   {
      root = null;
   }
   
   /** This is the inner class
     * Node*/
   public class Node
   {
      //Fields
      String data;
      Node left;
      Node right;
      
      
      /** Adds to the tree based on the nature  of the 
        * node.data*/
      public void add( Node node)
      {
         if ( ( node.data).compareTo( node) < 0)                //Check the left side 
         {
            if ( left == null)
            {
               left = node;
            }
            else
            {
               left.add( node);
            }
         }
         else if ( ( node.data).compareTo( node) > 0)            //check the right side
         {
            if ( right == null)
            {
               right = node;
            }
            else
            {
               right.add( node);
            }
         }
         // we need to do nothing if node.data == this.data
      }
   }   
}