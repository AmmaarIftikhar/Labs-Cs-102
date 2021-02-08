package hangmangame.extras;

import cs102.hangman.*;
import javax.swing.*;
import java.awt.event.*;

public class NewGameButtonControl extends JButton implements IHangmanView
{
   
   //variables
   private Hangman hangman;
   
   //constructors
   public NewGameButtonControl( HangmanModel hangModel)
   {
      setText( "New Game");
      this.hangman = hangModel;
      setEnabled( false);
      
      //ActionListener
      addActionListener( new ActionListener(){    
         @Override
         public void actionPerformed( ActionEvent e)
         {
            hangModel.initNewGame();
         }
      });
   }
   
   @Override
   public void updateView( Hangman hangman)
   {
      setEnabled( true);
   }
}