import java.util.*;

public class MenuReader
{
   public static void main( String[] args)
   {
      //Variable declaration
      ArrayList<MySimpleURLReader> collection;
      int choice;
      Scanner scan;
      
      //Initiation
      scan = new Scanner( System.in);
      collection = new ArrayList<MySimpleURLReader>();
      
      System.out.printf( "%10s","****WELCOME****");
      
      do 
      {
         System.out.printf( "%5s %5s %5s", "1. ADD URL.", "2. SHOW COLLECTION.", "3. QUIT.");
         choice = scan.nextInt();
         
         if ( choice == 1)
         {
            add(collection);
         }
         else if ( choice == 2)
         {
            display(collection);
         }
      } while ( choice != 3);
   }
   
   /** display option
     * @param collection of urls*/
   public static void display( ArrayList<MySimpleURLReader> collection)
   {
      //variable declaration
      int open;
      Scanner scan;
      
      //Initiation
      scan = new Scanner( System.in);
      open = 0;
      for ( int i = 0; i < collection.size(); i++)
      {
         System.out.println( i + 1 + ". " + collection.get(i).getName());
      }
      
      do
      {
         System.out.println( "Do you want to open any of the poems?");
         open = scan.nextInt();
         if ( open > 0 || open < collection.size())
         {
            System.out.println( collection.get( open - 1).getPageContents());
         }
      } while ( open != ( collection.size() + 1)); 
   }
   
   /** add method adds a book creates an instance of
     * the MySimpleURLReader and adds it to the collection
     * @param the reference of the collection*/
   public static void add( ArrayList<MySimpleURLReader> collection)
   {
      Scanner scan;
      String url;
      MySimpleURLReader addPoem;
      
      scan = new Scanner( System.in);
      System.out.println( "Enter the url to be added");
      url = scan.nextLine();
      
      addPoem = new MySimpleURLReader( url);
      collection.add( addPoem);
   }
}