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
      frame1.setSize(600,600);
      frame1.setVisible(true);
      //----------Panel to hold the buttons--------
      JPanel panel1 = new JPanel(new GridLayout(3,3, 30,30));
      //---------------Label 1--------------------
      JLabel label1 = new JLabel("Lets see what you get");
      
      JTextField textfield1 = new JTextField(10);
      //---------------Label 2--------------------
      JLabel label2 = new JLabel("Count the ducks");
      JTextField textfield2 = new JTextField(10);

      //-----------------Button 1----------------
      JButton button1 = new JButton ("Ranking Generator");

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] ranking = {"General","Lord","Emperor", "Captain","Commander","Liuetenent","Admiral","Master"};
             String newText = ranking[(int)(Math.random() * ranking.length)];
             label1.setText(newText);
          }
        });
        //----------------Button 2 -------------------
      JButton button2 = new JButton ("Enter Your Last Name");
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          System.out.println(textfield1.getText());
          textfield1.setText("");
        }
      });
      //----------------Button 3 -------------------
      JButton button3 = new JButton ("Get some Text");
      button3.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          System.out.println(textfield2.getText());
          textfield2.setText("");
        }
      });
       panel1.add(button1);
       panel1.add(button2);
       panel1.add(label1);
       panel1.add(textfield1);
       panel1.add(button3);
       panel1.add(textfield2);
       panel1.add(label2);



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