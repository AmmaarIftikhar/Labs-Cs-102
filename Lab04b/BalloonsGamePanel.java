//import shape.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BalloonsGamePanel extends JPanel
{
   //properties
   private ShapeContainer balloons;
   private int points;
   private JLabel label;
   private JPanel thisPanel;
   private long time;
   
   //constructor
   public BalloonsGamePanel()
   {
      //initialisation
      points = 0;
      balloons = new ShapeContainer();
      label =  new JLabel("Points: " +  points);
      
      add( label);
      thisPanel = this;   
      //setPreferredSize( new Dimension( 600, 600));
      setBackground( new Color( 0, 255, 0));
      
      for ( int i = 0; i < 25; i++)
      {
         balloons.add( new Balloon());
      }
      
      addMouseListener( new BalloonMouseListener());
      Timer timer;
      
      timer = new Timer( 250, new BalloonActionListener());
      timer.start();
      setFocusable( true);
      time = System.currentTimeMillis();
   }   
   
   /** overriding the paint component method 
     * of the JComponent
     * @param A graphics object*/
   public void paintComponent( Graphics g)
   {
      super.paintComponent( g);
      for ( Object shape : balloons)
      {
         Balloon temp;
         temp = ( Balloon)shape;        //Check
         ( ( Balloon)shape).draw( g);
      }
   }
   
   //Inner class
   public class BalloonActionListener implements ActionListener
   {
      public void actionPerformed( ActionEvent e)
      {
         for ( Object shape: balloons)
         {
            if ( balloons.size() < 15)
            {
               balloons.add( new Balloon());
            }
            Balloon temp;
            temp = ( Balloon)shape;        //Check
            ( ( Balloon)shape).grow();
            repaint();
         }              
         
         if ( balloons.size() == 0)
         {
            int input; 
            time = System.currentTimeMillis() - time;
            input = JOptionPane.showConfirmDialog( thisPanel, "Do you want to continue?");
            if (  input == JOptionPane.YES_OPTION)
            {
               points = 0;
               for ( int i = 0; i < 25; i++)
               {
                  balloons.add( new Balloon());
               }
            }
         }
      }
   }
   
   /** this is the mouselistener that listens
     * to the mouse events and ermoves the selected
     * balloons*/
   public class BalloonMouseListener extends MouseAdapter
   {
      @Override
      public void mousePressed( MouseEvent e)
      {
         int bursts;
         
         bursts = balloons.selectAllAt( e.getX(), e.getY());
         if ( bursts >= 2)
         {
            points = points + bursts;
         }
         label.setText("Points: " +  points);
         balloons.removeAll();
         repaint();              //don't forget repaint()
         
         for ( Object shape: balloons)
         {
            if ( balloons.size() < 15)
            {
               balloons.add( new Balloon());
            }
            Balloon temp;
            temp = ( Balloon)shape;        //Check
            ( ( Balloon)shape).grow();
            repaint();
         } 
      }
   }
}
