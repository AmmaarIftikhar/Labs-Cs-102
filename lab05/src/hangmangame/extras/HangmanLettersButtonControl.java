package hangmangame.extras;

import cs102.hangman.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HangmanLettersButtonControl extends LetterButtonControls implements IHangmanView
{
   public HangmanLettersButtonControl( String temp, int row, int columns)
   {
      super( temp, row, columns);
   }
   
   //Variables
   @Override
   public void updateView( Hangman hm)
   {
      setEnabled( true);
      setDisabled( hm.getUsedLetters());
      if ( hm.hasLost())
      {
         setEnabledAll( true);
      }
   }   
}