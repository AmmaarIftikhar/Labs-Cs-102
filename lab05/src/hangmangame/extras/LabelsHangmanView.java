package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView
{
   //constants
   //Variables
   private JLabel[] array;
   
   //Constructors
   public LabelsHangmanView()
   {
      setLayout( new GridLayout( 5, 1));
      //setPreferredSize( new Dimension( 100, 100));
      //instantiating the array
      array = new JLabel[ 4];
      
      //initialising the variables in the array
      //and adding them to the panel
      for ( int i = 0; i < array.length; i++)
      {
         array[ i] = new JLabel( "---");
         add( array[i]);
      }
      
   }
   
   /**this is the update method, which will be used to 
     * update the graphical interface of the hangman game
     * @param hangman an instance of the hangman game*/
   @Override
   public void updateView( Hangman hangman)
   {
      //update the incorrectTries
      array[0].setText( String.valueOf( hangman.getNumOfIncorrectTries()));
      
      //update the game status: won or lost
      if ( !hangman.hasLost())
      {
         array[1].setText( "Won");
      }
      else
      {
         array[1].setText( "Lost");
      }
      
      //upate the letters used
      array[2].setText( hangman.getUsedLetters());
      
      //update what is known
      array[3].setText( hangman.getKnownSoFar());
   }
}
