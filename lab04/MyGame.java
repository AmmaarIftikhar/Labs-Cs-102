import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**Ammaar Iftikhar
  * Lab04 a
  * 21901257*/

public class MyGame extends Frame
{
   //CONSTANTS
   final int WIDTH = 600;
   final int HEIGHT= 600;
   final int GRID_ROWS = 5;
   final int GRID_COLUMNS = 5;
   
   //Varaiables 
   private int tries;
   private int prize;
   private Button[] array;
   private Frame temp;
   private Frame winningMsg;
   
   //Constructor
   public MyGame()
   {
      //Empty the basket
      tries = 0;
      prize = 0;
      array = new Button[GRID_ROWS * GRID_COLUMNS];
      temp = this;
      
      //set the title of the farme
      setTitle("AWESOME GAME");
      
      //set the size of the pane and frame
      setSize( WIDTH, HEIGHT);
      
      //Create buttons to fit the grids in the pane
      createButtons();
      
      //set the layout of the pane
      setLayout( new GridLayout( GRID_ROWS, GRID_COLUMNS));
      
      //set the value of the  prize
      hidePrize();
      
      //add the buttons to the  pane
      addButtons();
      addWindowListener( new GameWindowListener());
      
      //set visible
      setVisible( true);
   }
   
   /** createButtons method creates the
     * required amount of buttons */
   private void createButtons()
   {
      for ( int i = 0; i < array.length; i++)
      {
         array[i] = new Button( String.valueOf( i));
         array[i].addActionListener( new GameActionListener());
      }
   }
   
   /* hidePrize method randomly selects a value
    * and then stores it in the prize variable*/
    private void hidePrize()
    {
       Random rand;
       rand = new Random();
       
       prize = rand.nextInt(23) + 1;
    }
    
    /** addButtons method adds buttons to the
      * panel*/
    private void addButtons()
    {
       for ( int i = 0; i < array.length; i++)
       {
          super.add( array[i]);
       }
    }
    
    
    //Inner class
    private class GameActionListener implements ActionListener
    {
       /** the only method that has to
         * be implemented is the
         * actioPerformed method
         * @param e the ActionEvent which calls the method*/
       @Override
       public void actionPerformed( ActionEvent e)
       {
          if ( e.getSource() == array[ prize])
          {
             tries++;
             //display the winning message
             temp.dispose();

             winningMsg = new Frame();
             
             winningMsg.setTitle( "MyGame");
             winningMsg.setSize( WIDTH, HEIGHT);
             winningMsg.setVisible(true);
             
             winningMsg.addWindowListener( new GameWindowListener());
             winningMsg.add( new Label( "You won after " + tries +" tries. " +
                                   "The prize was always hidden under the " +
                                       prize + " box"));
          }
          else
          {
             tries++;
          }
       }
    }
    
    /** inner class*/
    private class GameWindowListener extends WindowAdapter
    {
       @Override
       public void windowClosing( WindowEvent e)
       {
          ( (Frame) e.getSource()).dispose();
       }
    }
    
    
    public static void main( String[] args)
    {
       new MyGame();
    }
}