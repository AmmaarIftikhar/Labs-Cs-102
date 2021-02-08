import java.util.*;

/**Ammaar Iftikhar
  * Section 1
  * 21901257
  * Lab01d*/

public class XHTMLFilterReader
              extends HTMLFilterReader
{
   //Field declaration
   
   /** the constructor
     * @param url*/
   public XHTMLFilterReader( String url)
   {
      super(url);
   }
   
   /** the getLinks method
     * @return links Arraylist*/
   public ArrayList<String> getLinks()
   {
      //Variable declaration
      ArrayList<String> links;
      String search;
      int index;
      String temp;
      
      //initiation
      links = new ArrayList<String>();
      search = "";
      temp = getUnfilteredPageContents();
      index = temp.indexOf("href=\"");
     
      while ( index < temp.length())
      {
         search = temp.substring(index + 7, temp.indexOf( "\"", index + 8));
         links.add( search);
         
         index = temp.indexOf( "href=\"");
      }
      
      return links;
   }
}