//import shape.src.*;
//import shape.classes.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Balloon extends Circle implements Drawable
{
   //PROPERTIES
   private int defRadius;
   
   /** this is the constructor that
     * initialises the radius to 25*/
   public Balloon()
   {
      super( 25);
      Random rand;
      
      //defRadius = 25;
      rand = new Random();
      set( rand.nextInt( 600), rand.nextInt( 600));      
   }
   
   /** the useless draw method
     * @param g the graphics object*/   
   public void draw( Graphics g)
   {
      g.setColor( new Color(255, 0, 0));
      g.drawOval( getX(), getY(), defRadius, defRadius);
   }
   
   /**the grow method increments the
     * radius of the circle*/
   public void grow()
   {
      if ( defRadius <= 100)
      {
         defRadius = defRadius + 5;
         setRadius( defRadius);
      }
      else
      {
         setSelected( true);
         defRadius = 0;
      }
   }
   
}