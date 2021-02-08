import java.util.*;

/**Ammaar Iftikhar
  * 21901257
  * Lab06 Exercise1*/

public class HwRecursion
{
   public static void main( String[] args)
   {
      int[] array = { 1, 2, 4, 99, 3, 7, 2, 3, 4, 2, 9, 5};
      ArrayList<Integer> display;
      
      //initialisation
      display = new ArrayList<Integer>();
      //code
      printf( array, 0, array.length);
      printR( array, 0, array.length);
      System.out.println( power( 2, 10));
      System.out.println( max( array, array.length));
      printNumbers( 100, 150);
      storeNumbers( 100, 150, display);
      System.out.println( display);
      
      display = new ArrayList<Integer>();
      getLocationArray( array, 2, 0, display);
      System.out.println( display);
   }
   
   public static void printf( int[] array, int i,int f)
   {      
      if ( f <= i)
      {
         System.out.println( array[i]);
      }
      else if ( f >= 0)
      {
         printf( array, i, f - 1);
         System.out.println( array[f - 1]);         
      }
   }
   
   public static void printR( int[] array, int i,int f)
   {
      
      if ( i >= (f - 1))
      {
         System.out.println( array[f]);
      }
      else if ( i < f)
      {    
         printf( array, i + 1, f);  
         System.out.println( array[i]);  
      }
   }
   
   public static int power( int x, int y)
   {
      if ( y == 0)
      {
         return 1;
      }
      else
      {
         return x * power(x, y - 1);
      }
   }
   
   public static int max( int[] array, int n)
   {
      if ( n <= 0)
      {
         return array[0];
      }
      else
      {
         return Math.max( array[n - 1], max( array, n - 1));
      }
   }
   
   public static void printNumbers( int s, int e)
   {
      if ( s == e)
      {
         System.out.println( String.valueOf( s));
      }
      else
      {
         System.out.println( String.valueOf( s));
         printNumbers( s + 1, e);
      }
   }
   
   public static void storeNumbers( int s, int e, ArrayList<Integer> arrayIntegers)
   {
      
      if ( s >= e)
      {
         arrayIntegers.add( e);
      }
      else
      {
         arrayIntegers.add( s);
         storeNumbers( s + 1, e, arrayIntegers);
      }      
   }
   
   
  /** finds the last location of 
    * an integer
    * @param array the first instance of a number
    * @param the value to be searched for
    * @ the final point of our search
    * @return the  first location of the  key*/
   public static int firstLocation( int[] array, int x, int i)
   {
      if ( i >= array.length)
      {
         return -1;
      }
      else if ( array[i] == x)
      {
         return i;
      }
      else
      {
         return firstLocation( array, x, i + 1);
      }
   }
   
  /** finds the last location of 
    * an integer
    * @param array the last instance of a number
    * @param the value to be searched for
    * @ the final point of our search
    * @return the location of the  key*/
   public static int lastLocation( int[] array, int x, int f)
   {
      if ( f < 0)
      {
         return -1;
      }
      else if ( array[f] == x)
      {
         return f;
      }
      else
      {
         return lastLocation( array, x, f - 1);
      }
   }
   
   public static void getLocationArray( int[] array, int x, int i, ArrayList<Integer> locations)
   {  
      
      if ( i < array.length)
      {
         if ( i >=  ( array.length - 1))
         {
            if ( array[i] == x)
            {
               locations.add( i);
            }
         }
         else if ( i >= 0 && i < array.length)
         {
            if ( array[i] == x)
            {
               locations.add( i);
            }
            getLocationArray( array, x, i + 1, locations);
         }
      }
      
      //return locations;
    }
}