import java.awt.*;
import java.awt.event.*;
/**Ammaar Iftikhar
  * 21901257
  * Section 1
  */

public class MyOtherTFActionListener implements ActionListener
{
   
   //constants
   //variables 
   
   //methods 
   public void actionPerformed( ActionEvent e)
   {
      System.out.println( "Text field enter key Pressed " +  ( (TextField)e.getSource()).getText());
      
   }
}