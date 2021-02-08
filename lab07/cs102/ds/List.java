package cs102.ds;
   
/**Ammaar Iftikhar
  * 21901257
  * Section 1*/

public class List
{
   //Constants
   
   //Fields
   private Node head;
   
   /** this constructor initialises the the 
     * head to null*/
   public List()
   {
      head = null;
   }
   
   /** this is the node class, an inner class 
     * of List class*/
   public class Node
   {
      //Fields
      String data;
      Node next;
   
      /** this the constructor of the initialises the
        * data and next fields
        * @param data 
        * @param next the node after this node*/
      public Node( String data, Node next)
      {
         //Initialisation
         this.data = data;
         this.next = next;
      }
   }
   
      /** this method adds to the head of the 
        * list 
        * @param the String to be added to the 
        * head of the list*/
      public void addToHead( String item)
      {
         head = new Node( item, head);
      }
      
      /** this method adds to the tail of the
        * list
        * @param item the String data of the 
        * new node*/
      public void addToTail( String item)
      {
         Node temp;
         temp = head;
         
         //loop to go through the entire list upto tail
         while( temp.next != null)
         {
            temp = temp.next;
         }
         
         //adding at tail
         temp.next = new Node( item, null);
      }
      
      /** this element removes the object at the head
        * of the list from the head of the list
        * @return the data of the head*/
      public String removeFromHead()
      {
         String headData;
         headData = head.data;
         
         //remove the head
         head = head.next;
         
         return headData;
      }
      
      /** this method checks if the list is empty or
        * not 
        * @return bool*/
      public boolean isEmpty()
      {
         return head == null;
      }
      
      /** this method gives returns the data at 
        * index*
        * return string*/
      public String getData( int index)
      {
         Node temp;
         int i;
         
         //Initialisation
         temp = head;
         i = 0;
         
         if ( !isEmpty())
         {
            temp = head;
            while( temp.next != null && i <= index) 
            {
               temp = temp.next;

               if ( i == index)
               {
                  return temp.data;
               }
               i++;
            } 
         }
         
         return null;
      }
      
      /** this method prints the list in the forward 
        * direction*/
      public void print()
      {
         //local variable declaration
         Node temp;
         
         //Initialisation
         temp = head;
         do
         {
            if ( temp.next == null)
            {
               System.out.println( ", " + temp.data + "}");
            }
            else if ( temp == head)
            {
               System.out.print( "{ " + temp.data);
            }
            else
            {
               System.out.print( ", " + temp.data);
            }
            
            temp = temp.next;
         } while ( temp != null);
      }
      
      /** this is the toString() of the list class 
        * and overrides the method inherited from the 
        * Object class
        * @return the reperesentation of the list*/
      public String toString()
      {
         //local variable declaration
         Node temp;
         String print;
         
         temp = head;
         print = "{ ";
         
         do
         {
            if ( temp.next == null)
            {
               print = print + temp.data + "}";
            }
            else
            {
               print = print  + temp.data + ", ";
            }
            
            temp = temp.next;
         } while ( temp != null);
         
         return print;
      }
      
      /** this method prints the reverse order 
        * recursively*/
      public void printReverse()
      {
         printReverse( head);
         System.out.print( " }");
      }
      
      /** this method prints a list recursively
        * in reverse order
        * @param node*/
      private void printReverse( Node node)
      {
         if ( node.next == null)
         {
            System.out.print( "{ " + node.data + ", ");
         }
         else
         {
            printReverse( node.next);
            System.out.print( node.data + ", ");
         }
      }
      
      /**  this method returns if the list contains
        *  a node with a certain data
        *  @return bool*/
      public boolean contains( String target)
      {
         return contains( head, target);
      }
      
      /** this method displays the result of the
        * if a list contains a target data
        * @return boolean*/
      private boolean contains( Node node, String target)
      {
         if ( node.data.equals( target))
         {
            return true;
         }
         else if ( node.next == null)
         {
            return false;
         }
         else 
         {
            return contains( node.next, target);
         }
      }
      
      /** checks if a list is ordered in an increasing 
        * order*/
      public boolean isOrdered()
      {
         return isOrdered( head);
      }
      
      /** checks if a list is ordered in an increasing 
        * order*/
      public boolean isOrdered( Node node)
      {
         if( node.next == null)
         {
            return true;
         }
         else if ( ( node.data).compareTo( ( node.next.data)) < 0)
         {
            return false;
         }
         else
         {
            return isOrdered( node.next);
         }
      }
      
      /** this method creates another list with the
        * elements of a string array
        * @param array of strings
        * @return list*/
      public List createFrom( String[] array)
      {
         List list;
         list = new List();
         
         for ( String temp: array)
         {
            list.addToHead( temp);
         }
         
         return list;
      }
      
      /** this method creates a list from the characters 
        * of a string argument
        * @param a string object
        * @return a list with characters of the string*/
      public List createFrom( String temp)
      {
         List list;
         list = new List();
         
         for ( int i = 0; i < temp.length(); i++)
         {
            list.addToHead( temp.charAt( i) + "");
         }
         
         return list;
      }
      
      /**this is the next(), returns the node after the
        * parameter node
        * @return node*/
      public Node next( Node node)
      {
         return node.next;
      }
      
      /** the previous node method of the list
        * @return the node prior to the argument node*/
      public Node previous( Node node)
      {
         Node temp;
         temp = head;
         while ( temp.next != null && temp.next != node)
         {
            temp = temp.next;
         }
         
         return temp;
      }
            
      /** the tail node method of the list
        * @return the node prior to the argument node*/
      public Node tail()
      {
         Node temp;
         temp = head;
         while ( temp.next != null)
         {
            temp = temp.next;
         }
         
         return temp;
      }
      
      /** this is the merger method that craetes a 
        * list with the mutually exclusive elements of the
        * two list sent as parameter
        * @param List a
        * @param List b
        * @return list */
      public static List merger( List a, List b)
      {
         List temp;
         Node node;
         temp = new List();
         node = a.head;
         
         while ( node != null)
         {
            if ( !( b.contains( node.data)))
            {
               temp.addToHead( node.data);
            }
            node = node.next;
         }
         
         node = b.head;
         while ( node != null)
         {
            if ( !( a.contains( node.data)))
            {
               temp.addToHead( node.data);
            }
            node = node.next;
         }
         // o(n ) = n ^ 2
         return temp;
      }
   }