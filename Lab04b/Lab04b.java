//import shape.*;
import javax.swing.*;

/** Ammaar iftikhar
  * 21901257
  * section 1*/

public class Lab04b
{
   public static void main( String[] args)
   {
      //Variables
      JFrame frame;
      BalloonsGamePanel balls;
      int input;
      
      balls = new BalloonsGamePanel();
      frame = new JFrame();
      input = 0;
      
      frame.setTitle( "Balloon Game");
      frame.setSize( 600, 600);
      frame.add( balls);
      //frame.pack();
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      frame.setVisible( true);
       
   }
}