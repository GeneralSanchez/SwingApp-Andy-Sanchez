import javax.swing.*;
import java.awt.event.*; //this enables the events
import java.awt.*;
import java.util.*;

public class Main
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame ("Star Wars: GET CHARACTER NAME");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //YOU MUST HAVE THIS LINE
      frame1.setSize(640,600);
      frame1.setVisible(true);
      //----------Panel to hold the buttons--------
      JPanel panel1 = new JPanel(new GridLayout(4,4, 40,40));
      //---------------Label 1--------------------
      JLabel label1 = new JLabel("Lets see what you get");
      
      JTextField textfield1 = new JTextField(10);
      //---------------Label 2--------------------
      JLabel label2 = new JLabel("Are you Social Distancing (True/False)");
      JTextField textfield2 = new JTextField(10);

      //-----------------Button 1----------------
      JButton button1 = new JButton ("Ranking Generator");

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            ArrayList <String> ranking = new ArrayList <String>();
            ranking.add ("General");
            ranking.add ("Lord");
            ranking.add ("Emperor");
            ranking.add ("Captain");
            ranking.add ("Commander");
            ranking.add ("Admiral");
            ranking.add ("Liuetenent");
            ranking.add ("Master");
            //String[] ranking = {"General","Lord","Emperor", "Captain","Commander","Liuetenent","Admiral","Master"};
             String newText = ranking[(int)(Math.random() * ranking.length)];
             label1.setText(newText);
             System.out.print ("Hello welcome Star Wars fans please fill out infomation to get your name.");
             System.out.print("Your name is  "+newText);
          }
        });
        //----------------Button 2 -------------------
      JButton button2 = new JButton ("Enter Your Last Name");
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
           System.out.print(" ");
          System.out.print(textfield1.getText());
          textfield1.setText("");
          System.out.print("You are needed at the battle front get on the cruiser and destroy our enemies to bring peace. ");
          System.out.println("Well after a long battle I have worring news a new plague has entered the into of our galaxy.");
          System.out.println("We order you to quarantine your cruiser and your troops immediately this deadly disease has been identified in many planets and fear for our troops.");
          System.out.println ("Please answer placed on the screen?");
        }
      });
      //----------------Button 3 -------------------
      JButton button3 = new JButton ("Submit Resposnse");
      button3.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          System.out.print("You responded: ");
          System.out.print(textfield2.getText());
          if (textfield2.getText().equals ("true")||textfield2.getText().equals("TRUE")||textfield2.getText().equals("True")
          )
          {
            System.out.println (" Great Job! Please continue these efforts and please let us know if you're troops are infected!.");
          }
          else 
          {
            System.out.println (" Well what are you waiting for! This is a serioud matter take it seriously!");
          }
          System.out.println("ALL our ships will remain in space please just come to refuel. We will soon be able to be together this is not a joke. MAY THE FORCE BE WITH YOU! Always!");
          
          textfield2.setText("");
        }
      });
       panel1.add(button1);
       
       panel1.add(label1);
       panel1.add(button2);
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