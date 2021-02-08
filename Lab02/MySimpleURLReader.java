import cs1.SimpleURLReader;

/**Ammaar Iftikhar
 * Section 1
  * 21901257
  * Lab01a*/

public class MySimpleURLReader
                  extends SimpleURLReader
{
   
   //Field declaration
   private String url;
   
   
  /** This is the subclass constructor
    * @param url the String of the url*/
   public MySimpleURLReader( String url)
   {
      super(url);
      this.url = url;
   }
      
   /** the getURL method returns the url
     * @return url*/
   public String getURL()
   {
      return url;
   }
   
   /** the getName() returns the name of the file
     * to be or being read
     * @return name of the url read*/
   public String getName()
   {
      return url.substring( url.lastIndexOf("/") + 1, url.length());
   }
}