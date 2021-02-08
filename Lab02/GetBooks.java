import java.util.*;

/**Ammaar Iftikhar
  * Section 1
  * 21901257
  * Lab01a*/

public class GetBooks
{
   public static void main(String[] args)
   {
      //Field Declaration
      String url;
      HTMLFilterReader readIt;
      String text;
      ArrayList<String> books;
      int start;
      Scanner scan;
      

      //Initiation
      url = "https://stars.bilkent.edu.tr/syllabus/view/";
      books = new ArrayList<String>();
      scan = new Scanner( System.in);
      
      //Creating a url by using the info about course
      System.out.println( "Enter the course name: ");
      text = scan.nextLine();
      
      //Creating a url from the user input
      for ( int i = 0; i < text.length(); i++)
      {
         if ( Character.isLetter( text.charAt(i)))
         {
            url = url + text.charAt( i);
         }
         else if ( Character.isDigit( text.charAt(i)))
         {
            if ( Character.isLetter( text.charAt( i - 1)))
            {
               url = url + "/";
            }
            url = url + text.charAt( i);
         }
      }
      
      //Initialisation
      readIt = new HTMLFilterReader(url);
      
      //Program Code
      //System.out.println("The contents of the page are: \n" + readIt.getPageContents());
      //System.out.println( "The number of the lines are: \n" + readIt.getLineCount());
      
      text = readIt.getPageContents();
      start = text.indexOf( "Recommended - Textbook:");
      
      while ( ( start) < text.lastIndexOf( "Recommended - Textbook:"))
      {
         String temp;
         temp = text.substring( start + 23, text.indexOf( "\n", start + 23));
         books.add( temp);
         start = text.indexOf( "Recommended - Textbook: ", start + 23);          
      }
      
      books.add( text.substring( text.lastIndexOf( "Recommended - Textbook") + 23, text.indexOf( "\n", text.lastIndexOf( "Recommended - Textbook") + 23)));
      
      for ( String temp: books)
      {
         System.out.println( temp);
      }    
   }
}