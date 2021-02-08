import cs1.SimpleURLReader;

/**Ammaar Iftikhar
  * Section 1
  * 21901257
  * Lab01a*/

public class SimpleUrlDemo1
{
   public static void main(String[] args)
   {
      //Field Declaration
      String url;
      SimpleURLReader readIt;
      
     //Initiation
      url = "http://www.cs.bilkent.edu.tr/~david/housman.txt";
      
      //Initialisation
      readIt = new SimpleURLReader(url);
      
      //Program Code
      System.out.println("The contents of the page are: \n" + readIt.getPageContents());
      System.out.println( "The number of the lines are: \n" + readIt.getLineCount());
   }
}
