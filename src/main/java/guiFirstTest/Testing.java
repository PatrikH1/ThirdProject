package guiFirstTest;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
class Testing extends JFrame  
{  
  public Testing()  
  {  
    setSize(600,400);  
    setLocation(200,100);  
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    getContentPane().add(new StatusBar(),BorderLayout.SOUTH);  
  }  
  public static void main(String[] args){new Testing().setVisible(true);}  
}  
class StatusBar extends JPanel  
{  
  public StatusBar()  
  {  
    setLayout(new FlowLayout(FlowLayout.LEFT));  
    final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");  
    final JLabel timeLabel = new JLabel(sdf.format(new java.util.Date()));  
    add(timeLabel);  
    ActionListener al = new ActionListener(){  
      public void actionPerformed(ActionEvent ae){  
        timeLabel.setText(sdf.format(new java.util.Date()));  
      }  
    };  
    new Timer(1000,al).start();
  }  
}  