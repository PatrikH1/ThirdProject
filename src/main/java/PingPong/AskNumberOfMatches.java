package PingPong;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
public class AskNumberOfMatches extends javax.swing.JFrame {
	private JTextField jTextFieldNumberOfPlayers;
	private JLabel jLabelNumberOfPlayers;
	private JButton jButtonCalculate;
	private JLabel jLabelNumberOfMatches;
	private JTextField jTextFieldNumberOfMatches;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AskNumberOfMatches inst = new AskNumberOfMatches();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public AskNumberOfMatches() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jTextFieldNumberOfPlayers = new JTextField();
				getContentPane().add(jTextFieldNumberOfPlayers);
				jTextFieldNumberOfPlayers.setBounds(163, 28, 43, 21);
			}
			{
				jLabelNumberOfPlayers = new JLabel();
				getContentPane().add(jLabelNumberOfPlayers);
				jLabelNumberOfPlayers.setText("Hur m\u00E5nga spelare");
				jLabelNumberOfPlayers.setBounds(32, 31, 119, 15);
			}
			{
				jTextFieldNumberOfMatches = new JTextField();
				getContentPane().add(jTextFieldNumberOfMatches);
				jTextFieldNumberOfMatches.setBounds(163, 61, 43, 21);
			}
			{
				jLabelNumberOfMatches = new JLabel();
				getContentPane().add(jLabelNumberOfMatches);
				jLabelNumberOfMatches.setText("Antal matcher");
				jLabelNumberOfMatches.setBounds(51, 64, 100, 14);
			}
			{
				jButtonCalculate = new JButton();
				getContentPane().add(jButtonCalculate);
				jButtonCalculate.setText("Ber\u00E4kna");
				jButtonCalculate.setBounds(75, 102, 87, 21);
				jButtonCalculate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						String input = jTextFieldNumberOfPlayers.getText();
						int n = Integer.valueOf(input).intValue();
						jTextFieldNumberOfMatches.setText(NumberOfPingPongMatches.calcNumberOfMatches(n) + "");
					}
				});
			}
			pack();
			this.setSize(257, 186);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
