package guiFirstTest;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JButton;

public class TimerExample extends JFrame {

   final JLabel label;
   // Timer countdownTimer;
   Timer countUpTimer;
   int timeRemaining = 10;
   int timeCountsUp = 0;
   int timeStop = 10;
   boolean started = true;
   
	// Buttons
	private JButton jButtonStop;

   public TimerExample() {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(200, 200);
      label = new JLabel(String.valueOf(timeCountsUp), JLabel.CENTER);
      getContentPane().add(label);

      jButtonStop = new JButton();
	  getContentPane().add(jButtonStop);
	  //jButtonStop.setText("Stop");
	  jButtonStop.setBounds(50, 50, 120, 26);
	  jButtonStop.addActionListener(new stopStartListener());  
	
      countUpTimer = new Timer(1000, new CountUpTimerListener());
      setVisible(true);
      countUpTimer.start();
   }

   class CountUpTimerListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
            jButtonStop.setText(String.valueOf(timeCountsUp));
            timeCountsUp++;
         }
   }
   
   class CountdownTimerListener implements ActionListener {
	      public void actionPerformed(ActionEvent e) {
	         if (--timeRemaining > 0) {
	            label.setText(String.valueOf(timeRemaining));
	         } else {
	            label.setText("Time's up!");
	            countUpTimer.stop();
	         }
	      }
	   }   
   
      class stopStartListener implements ActionListener {
	      public void actionPerformed(ActionEvent e) {
             if (started) {
	            countUpTimer.stop();	
	            started = false;
             }
             else {
 	            countUpTimer.start();	
 	            started = true;
             }          	 
	      }
	   }      

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TimerExample();
         }
      });
   }

}