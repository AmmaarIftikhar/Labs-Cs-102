import java.awt.*;
import java.awt.event.*;

/**Ammaar Iftikhar
  * 21901257
  * Section 1
  */

public class MyOtherActionListener implements ActionListener
{
   
   //constants
   //variables 
   
   //methods 
   public void actionPerformed( ActionEvent e)
   {
      System.out.println( "Button Pressed");
      if ( e.getActionCommand().equals( "Maybe"))
      {
         ( (Button)e.getSource()).setLabel( "OK");
      }
      else
      {
         ( (Button)e.getSource()).setLabel( "Maybe");
      }
   }
}
   