package guiFirstTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// JFrame
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;


/**

*/
public class CalcTimer extends JFrame {
	private JButton jButtonStartTime;
	private JButton jButtonStopTime;
	private JButton jButtonResetTime;
	private JLabel jLabelSecondDigits;
	private JLabel jLabelSeconds;
	private JLabel jLabelMinutes;
	private JLabel jLabelMinuteDigits;
	
	// Coordinates
	private Coordinates coordStartButton;
	private Coordinates coordStopButton;
	private Coordinates coordResetButton;
	
	// Start coordinates.	
	int startX, startY;
	
	Timer countUpTimer;
	int timeCountsUp = 0;
	int minCountsUp = 0;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//CalcTimer inst = new CalcTimer(new Coordinates(48, 188, 85, 50),
				//		new Coordinates(156, 188, 85, 50),
				//		new Coordinates(265, 188, 85, 50),
				//		90, 100);
				CalcTimer inst = new CalcTimer();
				inst.initGUI(inst);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				
			}
		});
	}
	
	/**
	 * Constructor for CalcTimer.
	 * 
	 * @param coordStartButton Coordinates for start button.
	 * @param coordStopButton Coordinates for stop button.
	 * @param coordResetButton Coordinates for reset button.
	 * @param startX x-coordinate for timer part.
	 * @param startY y-coordinate for timer part.
	 */
	public CalcTimer(Coordinates coordStartButton,
			Coordinates coordStopButton,
			Coordinates coordResetButton,
			int startX, int startY) {
		super(); 
		this.coordStartButton = coordStartButton;
		this.coordStopButton = coordStopButton;
		this.coordResetButton = coordResetButton;
		this.startX = startX;
		this.startY = startY;
	}
	
	public CalcTimer() {
		super();
		this.coordStartButton = new Coordinates(48, 188, 85, 50);
		this.coordStopButton = new Coordinates(156, 188, 85, 50);
		this.coordResetButton = new Coordinates(265, 188, 85, 50);
		this.startX = 90;
		this.startY = 100;
	}	
	
	public void initGUI(JFrame jFrameToUse) {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			jFrameToUse.getContentPane().setLayout(null);
		    countUpTimer = new Timer(1000, new CountUpTimerListener());
		    int sizeOfCounter = 32;
			{
				jButtonStartTime = new JButton();
				jFrameToUse.getContentPane().add(jButtonStartTime);
				jButtonStartTime.setText("<html><center>Start<br/>Time</center></html>");
				jButtonStartTime.setBounds(coordStartButton.getX1(), 
						coordStartButton.getY1(), 
						coordStartButton.getX2(), 
						coordStartButton.getY2());
				jButtonStartTime.addActionListener(new StartButtonListener());
			}
			{
				jButtonStopTime = new JButton();
				jFrameToUse.getContentPane().add(jButtonStopTime);
				jButtonStopTime.setText("<html><center>Stop<br/>Time</center></html>");
				jButtonStopTime.setBounds(coordStopButton.getX1(), 
						coordStopButton.getY1(), 
						coordStopButton.getX2(), 
						coordStopButton.getY2());
				jButtonStopTime.addActionListener(new StopButtonListener());
			}
			{
				jButtonResetTime = new JButton();
				jFrameToUse.getContentPane().add(jButtonResetTime);
				jButtonResetTime.setText("<html><center>Reset<br/>Time</center></html>");
				jButtonResetTime.setBounds(coordResetButton.getX1(), 
						coordResetButton.getY1(), 
						coordResetButton.getX2(), 
						coordResetButton.getY2());
				jButtonResetTime.addActionListener(new ResetButtonListener());
			}			
			{
				jLabelMinuteDigits = new JLabel("", JLabel.RIGHT);
				jFrameToUse.getContentPane().add(jLabelMinuteDigits);
				jLabelMinuteDigits.setText("0");
				jLabelMinuteDigits.setBounds(startX, startY, 21, 30);
				jLabelMinuteDigits.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}
			{
				jLabelMinutes = new JLabel();
				jFrameToUse.getContentPane().add(jLabelMinutes);
				jLabelMinutes.setText("min");
				jLabelMinutes.setBounds(startX + 36, startY + 5, 49, 21);
				jLabelMinutes.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}
			{
				jLabelSecondDigits = new JLabel();
				jFrameToUse.getContentPane().add(jLabelSecondDigits);
				jLabelSecondDigits.setText("0");
				jLabelSecondDigits.setHorizontalAlignment(JLabel.RIGHT);
				jLabelSecondDigits.setBounds(startX + 91, startY, 43, 30);
				jLabelSecondDigits.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}			
			{
				jLabelSeconds = new JLabel();
				jFrameToUse.getContentPane().add(jLabelSeconds);
				jLabelSeconds.setText("sec");
				jLabelSeconds.setBounds(startX + 149, startY + 5, 49, 21);
				jLabelSeconds.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}

			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void resetTimer() {
		countUpTimer.stop();	
		timeCountsUp = 0;
		minCountsUp = 0;
		jLabelSecondDigits.setText(String.valueOf(timeCountsUp));
		jLabelMinuteDigits.setText(String.valueOf(minCountsUp));				
	}
	
	class CountUpTimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (timeCountsUp == 59) {
				timeCountsUp = 0;
				minCountsUp++;
			}
			else
			{
				timeCountsUp++;	
			}
			jLabelSecondDigits.setText(String.valueOf(timeCountsUp));
			jLabelMinuteDigits.setText(String.valueOf(minCountsUp));
		}
	}	
	
	class StartButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			countUpTimer = new Timer(1000, new CountUpTimerListener());
			countUpTimer.start();	
		}
	}	
	
	class StopButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {				
			countUpTimer.stop();	
		}
	}		
	
	class ResetButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {				
			countUpTimer.stop();	
			timeCountsUp = 0;
			minCountsUp = 0;
			jLabelSecondDigits.setText(String.valueOf(timeCountsUp));
			jLabelMinuteDigits.setText(String.valueOf(minCountsUp));		
		}
	}			

}
