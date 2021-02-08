/**Ammaar Iftikhar
  * Section 1
  * 21901257
  * Lab01a*/

public class HTMLFilterReader extends
   MySimpleURLReader
{
   //Field Declaration
   
   /** constructor calls the superclass
     * and sends the url as an argument
     * to it
     * @param the url */
   public HTMLFilterReader( String url)
   {
      super(url); 
   }
   
   /**getPageContents removes the HTML code
     * gives access to the page contents 
     * @return contents*/
   @Override
   public String getPageContents()
   {
      //Variable declaration
      String contents;
      String temp;
      boolean status;

      //Initiation
      contents = "";
      status = true;
      temp = super.getPageContents();  //check if this works
      
      for ( int i = 0; i < temp.length(); i++)
      {         
         if ( temp.charAt(i) == '<')
            status = false;
         else if ( temp.charAt(i) == '>')
            status = true;
         
         if ( status && temp.charAt(i) != '<'&& temp.charAt(i) != '>')
            contents = contents + temp.charAt(i);
      }
      
      return contents;
   }
   
   /** this method returns the 
     * unedited version of the html page 
     * @return page contents*/
   public String getUnfilteredPageContents()
   {
      return super.getPageContents();
   }
}