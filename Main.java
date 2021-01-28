import javax.swing.*;//this is to get the swing
import java.awt.event.*; //this enables the events
import java.awt.*;//this is  for the swing 
import java.util.*;//this gets the ArrayList

public class Main
{
  public static void main (String args[])
  {
    System.out.println ("Andy Sanchez,Swing App");
    JFrame frame1 = new JFrame ("Star Wars: GET CHARACTER NAME");//this  chnges frame name of the top
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for the frame
      //YOU MUST HAVE THIS LINE
      frame1.setSize(640,600);//size of the fram
      frame1.setVisible(true);//makes this visible

      //----------Panel to hold the buttons--------
      JPanel panel1 = new JPanel(new GridLayout(4,4, 40,40));//this is the panel size

      //---------------Label 1--------------------
      JLabel label1 = new JLabel("Lets see what you get");//the label
       JTextField textfield1 = new JTextField(10);//how big

      //---------------Label 2--------------------
      JLabel label2 = new JLabel("Are you Social Distancing (True/False)");
      //the thing that is poping out
      JTextField textfield2 = new JTextField(10);//how big this is

      //-----------------Button 1----------------
      JButton button1 = new JButton ("Ranking Generator");//name of button

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            ArrayList <String> ranking = new ArrayList <String>();
            ranking.add ("General");//added to list
            ranking.add ("Lord");//added to list
            ranking.add ("Emperor");//added to list
            ranking.add ("Captain");//added to list
            ranking.add ("Commander");//added to list
            ranking.add ("Admiral");//added to list
            ranking.add ("Liuetenent");//added to list
            ranking.add ("Master");//added to list
             String newText = ranking.get((int)(Math.random() * ranking.size()));//this gets it randomized
             label1.setText(newText);//sets the ranking
             System.out.print ("Hello welcome Star Wars fans please fill out infomation to get your name.");//little message
             System.out.print("Your name is  "+newText);//to give a name
          }//end of actionPerformed
        });//end of main button1

        //----------------Button 2 -------------------
      JButton button2 = new JButton ("Enter Your Last Name");//title for button
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
           System.out.print(" ");//this is for a space in the console
          System.out.print(textfield1.getText());//gets text to put to console
          textfield1.setText("");//clears the textfield1
          System.out.print("You are needed at the battle front get on the cruiser and destroy our enemies to bring peace. ");
          System.out.println("Well after a long battle I have worring news a new plague has entered the into of our galaxy.");
          System.out.println("We order you to quarantine your cruiser and your troops immediately this deadly disease has been identified in many planets and fear for our troops.");
          System.out.println ("Please answer placed on the screen?");
          //this is extra text inputeed to get a little story
        }//this end actionPerformed
      });//end of main fo button2

      //----------------Button 3 -------------------
      JButton button3 = new JButton ("Submit Resposnse");//title for button
      button3.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          System.out.print("You responded: ");//to format response
          System.out.println(textfield2.getText());//gets the text and prints it out
          //this is the exceptions that is allowed in textfield2
          if (textfield2.getText().equals ("true")||textfield2.getText().equals("TRUE")||textfield2.getText().equals("True")
          )
          {
            System.out.println (" Great Job! Please continue these efforts and please let us know if you're troops are infected!.");//when it is true prints it out
            label2.setText("Great Job! YAYA!");//changes label
          }//end of if
          else 
          {
            //when false it prints this out
            System.out.println (" Well what are you waiting for! This is a serioud matter take it seriously!");
            label2.setText("What are you doing loser!");//Changes label
          }//end of else
          System.out.println("ALL our ships will remain in space please just come to refuel. We will soon be able to be together this is not a joke. MAY THE FORCE BE WITH YOU! Always!");
          //prints after if and else is done
          textfield2.setText("");//to clear the textfield2
        }//end of actioPerformed()
      });//end of main for button 3
       
       panel1.add(button1);//adds button1 to screen
       panel1.add(label1);//adds the label to screen
       panel1.add(button2);//adds button2 to screen
       panel1.add(textfield1);//adds textfield1 to screen
       panel1.add(button3);//adds the button3 to screen
       panel1.add(textfield2);//adds textfield2 to screen
       panel1.add(label2);//adds label2 to screen
       
     //-----------------Panel 2-----------------
      JPanel panel2 = new JPanel (new BorderLayout(10,10));//layout of panel2

      //--------------Image 1 - the DUCK-------------
      ImageIcon starwars = new ImageIcon("darthvader.jpg", "A remainder from Lord Vader");//creates variable of the image
      JLabel StarLabelPic = new JLabel(starwars);//creates a label
      panel2.add(StarLabelPic);//adds the image to the screen

      frame1.getContentPane().add(BorderLayout.NORTH, panel1);//gets frame
      frame1.getContentPane().add(BorderLayout.CENTER, panel2);//gets fram
  }
}