import java.awt.*;
import javax.swing.*;

/**Ammaar Iftikhar
  * Section 1
  * 21901257*/

public class MyDrawingPanel extends JPanel
{
   //Constants
   final static int WIDTH = 300;
   final static int HEIGHT = 250;
   
   //variables
   
   //constructors
   public MyDrawingPanel()
   {
      setPreferredSize( new Dimension( WIDTH, HEIGHT));
      setBackground( Color.YELLOW);      
   }
   
   public MyDrawingPanel( int width, int height)
   {
      setPreferredSize( new Dimension( width, height));
      setBackground( Color.YELLOW);
   }
   
   //methods 
   
   public void setColor( Color color)
   {
      setBackground( color);
   }
   
   @Override
   public void paintComponent( Graphics g)
   {
      super.paintComponent( g);
      g.setColor( new Color( 255, 220, 140));
      g.drawRect( 0, 0, 25, 25);
      g.setColor( Color.MAGENTA);
      g.fillOval( 50, 50, 60, 60);
      g.setColor( Color.MAGENTA);
      g.fillRect( 150, 150, 60, 60);
      g.setColor( Color.BLACK);
      g.fillOval( 250, 250, 60, 60);
   }
}