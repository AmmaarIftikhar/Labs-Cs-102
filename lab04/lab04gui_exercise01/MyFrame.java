import javax.swing.*;
import java.awt.*;

/**Ammaar Iftikhar
  * Section 1
  * 21901257*/

public class MyFrame extends JFrame
{
   // properties

   // constructors
   public MyFrame()
   {
      JButton b;
      JPanel  p;
      
      setSize( 400, 300);
      setLayout( new FlowLayout() );
      
      p = new MyPanel();
      add( new MyPanel() );
      add( new MyPanel() ); 
      
      p.setLayout( new GridLayout( 4, 1) );
      
      p.add( new JLabel( "Welcome to the ONLINE world") );

      p.add( new JTextField( 25) );

      b = new JButton( "Neat");
      p.add( b);
      p.add( new JButton( "OK, time to go!") );
      
      add( p);
      //to set the operation of the close button to exit
      //by default it is hidden
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      
      //pack();
      setVisible( true);      
   }
   

   // methods
     
}