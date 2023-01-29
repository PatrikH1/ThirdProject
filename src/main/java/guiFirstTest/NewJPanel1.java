package guiFirstTest;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;


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
public class NewJPanel1 extends javax.swing.JPanel {
	private JButton jButton1;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new NewJPanel1());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public NewJPanel1() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			FlowLayout thisLayout = new FlowLayout();
			thisLayout.setAlignment(FlowLayout.RIGHT);
			this.setLayout(thisLayout);
			this.setPreferredSize(new Dimension(304, 146));
			{
				jButton1 = new JButton();
				this.add(jButton1);
				jButton1.setText("jButton1");
				jButton1.setPreferredSize(new Dimension(77, 41));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
