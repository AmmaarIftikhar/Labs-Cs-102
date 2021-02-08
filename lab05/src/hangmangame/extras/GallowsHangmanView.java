package hangmangame.extras;

import javax.swing.*;
import cs102.hangman.*;
import java.awt.*;

public class GallowsHangmanView extends JPanel implements IHangmanView
{
   //constants
   //Fields
   private HangmanModel hangman;
   
   //constructors
   public GallowsHangmanView( HangmanModel hm)
   {
      hangman = hm;
      //setPreferredSize( new Dimension( 200, 200));
   }
   
   //methods
   /** the paintComponent method of the JPanel class
     * is being overidden to draw a hangman
     * @param g a graphics class instance*/
   public void paintComponent( Graphics g)
   {
      super.paintComponent( g);
      
      g.fillRect( 50, 50, 5, 100);
      g.fillRect( 40, 150, 110, 5);
      g.fillRect( 55, 50, 100, 5);
      
      setBackground( Color.YELLOW);
      if ( hangman != null)
      {
         if ( hangman.getNumOfIncorrectTries() >= 1)
         {
            g.drawLine( 95, 60, 95, 70);
         }
         if ( hangman.getNumOfIncorrectTries() >= 2)
         {
            g.drawOval( 90, 70, 10, 10);
         }
         if ( hangman.getNumOfIncorrectTries() >= 3)
         {
            g.drawLine( 95, 80, 95, 90);
         }
         if ( hangman.getNumOfIncorrectTries() >= 4)
         {
            g.drawLine( 95, 90, 90, 100);
         }
         if ( hangman.getNumOfIncorrectTries() >= 5)
         {
            g.drawLine( 95, 90, 100, 100);
         }
         if ( hangman.getNumOfIncorrectTries() == 6)
         {
            g.drawLine(95, 82, 99, 88);
         }
      }
   }
   
   /** overriding the updateView method*/
   @Override
   public void updateView( Hangman hangman)
   {
      //this.hangman = (HangmanModel)hangman;
      repaint();
   }
}