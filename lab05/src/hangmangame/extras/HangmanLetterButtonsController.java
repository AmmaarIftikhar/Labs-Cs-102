package hangmangame.extras;

import java.awt.event.*;
import java.awt.*;
import cs102.hangman.*;
import javax.swing.*;

public class HangmanLetterButtonsController implements ActionListener
{
   //fields
   private Hangman hangman;
   
   //constructors
   public HangmanLetterButtonsController(Hangman hm)
   {
      this.hangman = hm;
   }
   
   //methods
   @Override
   public void actionPerformed( ActionEvent e)
   {
      hangman.tryThis( e.getActionCommand().charAt( 0));
      ( (JButton)e.getSource()).setEnabled( false);
   }
   
}

