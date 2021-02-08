import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

/**Ammaar Iftikhar
  * Section 1
  * 21901257*/

public class GUIDemo1
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      MyFrame  f;
      MyFrame b;
      JFrame c;
      JPanel temp;

      // program code
      System.out.println( "Start...");

      //Instantiation and initialisation
      f = new MyFrame();
      temp = new JPanel();
      b = new MyFrame();
      c = new JFrame();
      
      //SetLayout
      b.setLayout( new GridLayout( 4, 1));
      temp.setLayout( new BorderLayout());
      
      //Adding components
      //to b
      b.add(new JLabel( "Cs102"));
      b.add(new JLabel( "Instructor "));
      b.add(new JLabel( "Mr. David"));
      
      //to panel temp
      temp.add( new JButton( "Next Page"), BorderLayout.WEST);
      temp.add( new JButton( "Next Page"), BorderLayout.SOUTH);
      temp.add( new JButton( "Next Page"),  BorderLayout.NORTH);
      temp.add( new MyDrawingPanel(), BorderLayout.CENTER);

      //          Answer to question 4
      //Incase we don't set the position of a component when 
      // we use border layout the component willbe added to the center
      // and if cenetr is used the it won't be added 
      
      //           Answer
      // in case we don't add a layout manager the 
      // the frame or panel by default uses a layout.
      //in case of panel it is flow layout.
      
      //setting the c frame
      c.add( temp);
      c.setSize( 600, 600);
      
      c.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      c.setVisible( true);

      System.out.println( "End.");
   }

}