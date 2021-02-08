package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.*;

public class TextFieldControlPanel extends JPanel
{
   //Constants
   //Fields
   private Hangman hangman;
   private JTextField textField;
   
   //Constructors
   public TextFieldControlPanel( Hangman hangman)
   {
      //initialising the hangman field
      this.hangman  = hangman;
      
      //Instantiation and initialisation of textField
      textField = new JTextField( 10);
      textField.addActionListener( new ActionListener()
      {
         public void actionPerformed( ActionEvent e)
         {
            char temp;
            temp = textField.getText().charAt( 0);
            hangman.tryThis( temp);
         }
      });
      
      //adding field to the  panel
      add( textField);
   }
}


