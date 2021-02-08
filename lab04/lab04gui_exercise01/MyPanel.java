import java.awt.*;
import javax.swing.*;

/**
 *  
 * @Ammaar Iftikhar 
 * @version 
 */ 
public class MyPanel extends JPanel
{
   // properties

   // constructors
   public MyPanel()
   {
      JButton b;
      
      setLayout( new GridLayout( 2, 3) );
      
      add( new JLabel( "Welcome to the ONLINE world") );

      add( new JTextField( 25) );

      b = new JButton( "Neat");
      add( b);
      add( new JButton( "OK, time to go!") );
   }

   // methods
     
}