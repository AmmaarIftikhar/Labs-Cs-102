package hangmangame.extras;

import cs102.hangman.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * Collection of UI components to form a complete Hangman game. 
 * View components implement IHangmanView, so they can automatically update
 * whenever the hangmanModel associated with changes, changes.
 * Other components are hangman controllers that update the model.
 * @author david
 */
public class HangmanGUIPanel extends JPanel {

   HangmanModel hm;
   
   public HangmanGUIPanel( HangmanModel hm) {
      this.hm = hm;
      setPreferredSize( new Dimension( 500, 350) );
      setLayout( new BorderLayout() );
      setBackground(Color.YELLOW);

      // add controls and views here...
      NewGameButtonControl newGame;
      newGame = new NewGameButtonControl( hm);
      hm.addView( newGame);
      add( newGame, BorderLayout.SOUTH);
      add( new TextFieldControlPanel( (Hangman)hm), BorderLayout.NORTH);
      
      //adding theLabelsHangmaanView
      LabelsHangmanView viewLabel;
      viewLabel = new LabelsHangmanView();
      add( viewLabel, BorderLayout.WEST);
      hm.addView( viewLabel);
      
      //adding gallows view to HangmanModel
      GallowsHangmanView gallowView;
      gallowView = new GallowsHangmanView( hm);      
      add( gallowView, BorderLayout.CENTER);
      hm.addView( gallowView);
      
      //Adding letterButtonControls panel to the panel
      HangmanLettersButtonControl letters;
      letters = new HangmanLettersButtonControl( hm.getAllLetters(), 13, 2);
      add( letters, BorderLayout.EAST);
      letters.addActionListener( new HangmanLetterButtonsController( hm));
      
      //setPreferredSize( new Dimension( 400, 300));
      hm.addView( letters);
   }
   
}
