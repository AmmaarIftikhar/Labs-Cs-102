/**Ammaar Iftikhar
  * Section 1
  * 21901257
  * Lab01a*/

public class HTMLSimpleUrlDemo1
{
   public static void main(String[] args)
   {
      //Field Declaration
      String url;
      HTMLFilterReader readIt;
      
     //Initiation
      url = "http://www.cs.bilkent.edu.tr/~david/housman.htm";
      
      //Initialisation
      readIt = new HTMLFilterReader(url);
      
      //Program Code
      System.out.println("The contents of the page are: \n" + readIt.getPageContents());
      System.out.println( "The number of the lines are: \n" + readIt.getLineCount());
      
      
   }
}
