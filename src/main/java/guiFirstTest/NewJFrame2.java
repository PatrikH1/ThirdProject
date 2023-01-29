package guiFirstTest;
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
public class NewJFrame2 extends javax.swing.JFrame {
	private JButton jButtonTest;
	private JButton jButtonGoodBye;
	private JLabel jLabelYourName;
	private JButton jButtonHui;
	private JButton jButtonSayHallo;
	private JTextField jTextFieldMyName;
	private JLabel jLabelHead;
	private JButton jButtonReset;
	private JTextField jTextFieldMessage;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame2 inst = new NewJFrame2();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame2() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jButtonTest = new JButton();
				getContentPane().add(jButtonTest);
				jButtonTest.setText("Hello");
				jButtonTest.setBounds(32, 134, 64, 28);
				jButtonTest.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//System.out.println("jButtonTest.actionPerformed, event="+evt);
						jTextFieldMessage.setText("Hello");
						//TODO add your code for jButtonTest.actionPerformed
					}
				});
			}
			{
				jButtonGoodBye = new JButton();
				getContentPane().add(jButtonGoodBye);
				jButtonGoodBye.setText("Good Bye");
				jButtonGoodBye.setBounds(115, 134, 115, 29);
				jButtonGoodBye.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jTextFieldMessage.setText("Good Bye");
						// System.out.println("jButtonGoodBye.actionPerformed, event="+evt);
						//TODO add your code for jButtonGoodBye.actionPerformed
					}
				});
			}
			{
				jTextFieldMessage = new JTextField();
				getContentPane().add(jTextFieldMessage);
				jTextFieldMessage.setBounds(86, 82, 302, 25);
				//jTextFieldMessage.setText("Hello");
			}
			{
				jButtonReset = new JButton();
				getContentPane().add(jButtonReset);
				jButtonReset.setBounds(341, 134, 93, 29);
				jButtonReset.setText("Reset");
				jButtonReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jTextFieldMessage.setText("");
						jTextFieldMyName.setText("");
						// System.out.println("jButtonReset.actionPerformed, event="+evt);
						//TODO add your code for jButtonReset.actionPerformed
					}
				});
			}
			{
				jLabelHead = new JLabel();
				getContentPane().add(jLabelHead);
				jLabelHead.setText("Funny Buttons, Push Them!!!");
				jLabelHead.setBounds(98, 12, 280, 58);
				jLabelHead.setFont(new java.awt.Font("Segoe UI",1,20));
			}
			{
				jLabelYourName = new JLabel();
				getContentPane().add(jLabelYourName);
				jLabelYourName.setText("What´s your name?");
				jLabelYourName.setBounds(53, 174, 128, 36);
				jLabelYourName.setFont(new java.awt.Font("Segoe UI",1,14));
			}
			{
				jTextFieldMyName = new JTextField();
				getContentPane().add(jTextFieldMyName);
				jTextFieldMyName.setBounds(193, 182, 155, 22);
			}
			{
				jButtonSayHallo = new JButton();
				getContentPane().add(jButtonSayHallo);
				jButtonSayHallo.setText("Say Hello!");
				jButtonSayHallo.setBounds(360, 182, 106, 24);
				jButtonSayHallo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jTextFieldMessage.setText("Hello " + jTextFieldMyName.getText() + "!");
						// System.out.println("jButtonSayHallo.actionPerformed, event="+evt);
						//TODO add your code for jButtonSayHallo.actionPerformed
					}
				});
			}
			{
				jButtonHui = new JButton();
				getContentPane().add(jButtonHui);
				jButtonHui.setText("Hello Hui");
				jButtonHui.setBounds(242, 134, 84, 29);
				jButtonHui.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jTextFieldMessage.setText("Hello Sleeping Hui!");
						
						//jTextFieldMessage.setText("Hello Sleeping Patrik!");
						//System.out.println("jButtonHui.actionPerformed, event="+evt);
						//TODO add your code for jButtonHui.actionPerformed
					}
				});
			}
			pack();
			this.setSize(509, 280);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
