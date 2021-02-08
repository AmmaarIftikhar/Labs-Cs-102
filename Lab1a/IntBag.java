/**Ammaar Iftikhar
  * 21901257
  * Section 1
  * Lab01 a & b*/

public class IntBag
{
   //Properties/ fields
   private int[] bag;
   private int valid;
   
   /** Constructor : takes and int as a argument, 
     * then creates an array with initial size as
     * entered as the user
     * @param size trhe initial size of teh array*/
   public IntBag( int size)
   {
      bag = new int[size];
      valid = 0;   //even though the default value is zero
   }
   
   /** no-arg constructor - takes no input, and
     * gives the array an innitial size of 100.*/
   public IntBag()
   {
      this(100);
   }
   
   /** add() add method: adds the sent element at
     * the end of the array
     * @param element the element to be added.*/
   public void add( int element)
   {
      if ( valid >= bag.length)
      {
         //calls the expand method 
         expand();
      }
      bag[valid] = element;
      valid++;
   }
   
   /** add( element : int, position : int)
     * @param element the element to be added.*/
   public void add( int element, int position)
   {
      if ( valid >= bag.length)
      {
         //calls the expandArray method 
         expand();
      }
      //insert the element
      for ( int i = ( bag.length - 1); i > position; i--)
      {
         bag[i + 1] = bag[i];
      }
      
      bag[position] = element;   
      valid++;
   }
   
   /**remove removes an element from the array
     * @param position the element index to be removed*/
   public void remove( int position)
   {
      int[] array;
      
      array = new int[valid - 1];
      
      for( int i = 0; i < valid; i++)
      {
         if ( i < position)
         {
            array[i] = bag[i];
         }
         else if ( i > position)
         {
            array[i - 1] = bag[i];
         }
      }
      //Array reference is copied into the bag varible
      bag = array;
      valid--;
   } 
   
   /** expand method: the array size is expanded
     * to twice the size*/
   private void expand()
   {
      int[] array;
      array = new int[2 * bag.length];
      
      copy(array);
      
      bag = array;
   }
   
   /** copy method cpoies the array elements 
     * in order*/
   private void copy( int[] array)
   {
      for ( int i = 0; i < bag.length; i++)
      {
         array[i] = bag[i];
      }
   }
   
   /** the toString method is returned as 
     * a String
     * @return arrayString the string representation*/
   public String toString()
   {
      String arrayString;
      
      arrayString = "{" ;
      for ( int i = 0; i < ( valid - 1); i++)
      {
         arrayString = arrayString + bag[i] + ", ";
      }
      arrayString = arrayString + bag[valid - 1] + "}"; 
      return arrayString;
   }
  
   /** get method returns the element located
     * at bag sub position 
     * @return the element located at that position*/
   public int get( int position)
   {
      return bag[position];
   }
 
   
   //*************************************************************PART B****************************************************************************
   /** the location of the number is returned in the form of 
     * a string
     * @param element the element to be searched
     * @return the string that give the absence and presence of 
     * an element in the string.*/
   public String findAll( int element)
   {
      String location;
      location = "";
      for ( int i = 0; i < valid; i++)
      {
         if ( bag[i] == element)
         {
            location = location + "1";
         }
         else
         {
            location = location + "0";
         }
      }
      
      return location;
   }
}