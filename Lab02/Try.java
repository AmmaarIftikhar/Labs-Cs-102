import javax.swing.*;

public class Try
{
   public static void main(String[] args)
   {
      JFrame frame;
      JPanel panel;
      JLabel label;
      JButton button;
      
      frame = new JFrame();
      panel = new JPanel();
      
      frame.setSize( 400, 400);
      frame.setTitle( "Awesome");
      
      button = new JButton( "print");
      label = new JLabel( "great");
      
      panel.add( button);
      panel.add( label);
      frame.add( panel);
      
      frame.setVisible( true);
      frame.setDefaultCloseOperation( JFrame.Exit_On_Close);
   }
}