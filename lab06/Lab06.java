import java.util.Scanner;
import java.util.ArrayList;

/**Ammaar Iftikhar
  * 21901257
  * Lab06*/

public class Lab06
{
   public static void main( String[] args)
   {
      ArrayList<String> array;
      int[] integers = { 4, 8, 99, 110, 6};
      
      array = new ArrayList<String>();
      
      array.add( "apple");
      array.add( "orange");
      array.add( "creed");
      array.add( "enmity");
      array.add( "elegent");
      array.add( "eel");
      array.add( "easteregg");
      
      for ( String temp: array)
      {
         System.out.println( counte( 0, temp.length(),temp));
      }
      
      System.out.println( "\n\n*******This is Binary Display*********");
      
      for ( int e : integers)
      {
         displayBinary( e);
         System.out.println();
      }
      
      System.out.println( lexicographic( array, 0, array.size() - 1));
      
      //code to get the even number
      displayEven( 3, 999);
   }
   
   /**this is the counte method 
     * @return the number of "e" in the 
     * string
     * @param the initial position
     * @param the final position
     * @param the string to be checked*/
   public static int counte( int from, int to, String string)
   {
      if ( from >= to)
      {
         return 0;
      }
      else if ( string.charAt(from) == 'e')
      {
         return 1 + counte( from + 1, to, string);
      }
      else
      {
         return 0 + counte( from + 1, to, string);
      }
   }
   
   /** displayBinary is the method that displays
     * the binary form of an integer
     * @param an integer n*/
   public static  void displayBinary( int n)
   {
      if ( n == 1)
      {
         System.out.print( String.valueOf( 1));
      }
      else if ( n == 0)
      {
         System.out.print( String.valueOf( 0));
      }
      else
      {
         displayBinary( ( int)( n / 2));
         System.out.print( String.valueOf( n % 2));
      }
   }
      
   /** checks if the strings in an 
     * array are placed lexographically
     * @param the terms in the array*/
   public static boolean lexicographic( ArrayList<String> string, int init, int end)
   {
      if ( init < end && string.get( init).compareTo( string.get( init +  1)) > 0)
      {
         return false;
      }
      else if ( init <= end && init == end)
      {
         return true;
      }
      else
      {
         return true && lexicographic( string, init + 1, end);
      }
   }
   
   /** this is the displayEven method;
     * this method displays the even numbers with 
     * digits in increasing order*/
   public static void displayEven( int n, int largest)
   {
      if ( String.valueOf(largest).length() == n)
      {
         checkValues( largest, 0);
         displayEven( n, largest - 1);
      }
      
   }
 
   public static void checkValues( int check, int i)
   {
      String temp;
      temp = String.valueOf( check);

      if ( i == ( temp.length() - 1) && ( Integer.parseInt( temp.charAt( temp.length() - 1) + "") % 2) == 0)
      {
          System.out.println( temp);
      }
      else if ( i < ( temp.length() - 1))
      {
         if ( Integer.parseInt( temp.charAt( i) + "") < Integer.parseInt( temp.charAt(i + 1) + ""))
         {
            checkValues( check, i + 1);
         }
      }
   }  
}
