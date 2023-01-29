package guiFirstTest;
//import com.cloudgarden.layout.AnchorLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrameOkError extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JButton jButtonPushMe;
	private boolean okOn = true;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrameOkError inst = new NewJFrameOkError();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrameOkError() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel("", JLabel.RIGHT);
				getContentPane().add(jLabel1);
				//getContentPane().add(jLabel1, BorderLayout.EAST);
				
				// Error
				jLabel1.setForeground(new java.awt.Color(128,128,255));	
				jLabel1.setHorizontalTextPosition(JLabel.RIGHT);
				//jLabel1.setText("OK");
				
				// OK
				//jLabel1.setForeground(new java.awt.Color(28,210,23));
				//jLabel1.setText("OK");
				
				jLabel1.setBounds(160, 89, 121, 92);
				jLabel1.setFont(new java.awt.Font("Times New Roman",0,48));
				//jLabel1.setBounds(133, 103, 50, 37);
				//jLabel1.setBounds(106, 57, 100, 94);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setHorizontalTextPosition(JLabel.LEFT);
				jLabel2.setAlignmentY(JLabel.RIGHT_ALIGNMENT);				
				//jLabel2.setText("Error");
				jLabel2.setFont(new java.awt.Font("Times New Roman",0,48));
				jLabel2.setForeground(new java.awt.Color(255,0,0));
				jLabel2.setBounds(40, 89, 121, 93);
			}
			{
				jButtonPushMe = new JButton();
				getContentPane().add(jButtonPushMe);
				jButtonPushMe.setText("Push me!");
				jButtonPushMe.setBounds(110, 62, 120, 22);
				jButtonPushMe.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonPushMeActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(345, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButtonPushMeActionPerformed(ActionEvent evt) {
		//System.out.println("jButtonPushMe.actionPerformed, event="+evt);
		//TODO add your code for jButtonPushMe.actionPerformed
			
		if (okOn)
		{
			jLabel1.setText("OK");
			jLabel2.setText("");
			okOn = false;
		}
		else
		{
			jLabel1.setText("");
			jLabel2.setText("Error");
			okOn = true;			
		}
	}

}
