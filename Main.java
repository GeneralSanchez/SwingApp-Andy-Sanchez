import javax.swing.*;
import java.awt.event.*; //this enables the events
import java.awt.*;

public class Main
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame ("Star Wars: GET CHARACTER NAME");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //YOU MUST HAVE THIS LINE
      frame1.setSize(500,500);
      frame1.setVisible(true);
      //----------Panel to hold the buttons--------
      JPanel panel1 = new JPanel(new GridLayout(2,2, 20,20));






     //-----------------Panel 2-----------------
      JPanel panel2 = new JPanel (new BorderLayout(10,10));


      //--------------Image 1 - the DUCK-------------
      ImageIcon starwars = new ImageIcon("darthvader.jpg", "A remainder from Lord Vader");
      JLabel StarLabelPic = new JLabel(starwars);
      panel2.add(StarLabelPic);

      frame1.getContentPane().add(BorderLayout.NORTH, panel1);
      frame1.getContentPane().add(BorderLayout.CENTER, panel2);
  }
}