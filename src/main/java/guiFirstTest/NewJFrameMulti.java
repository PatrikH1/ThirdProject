package guiFirstTest;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

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
/**
* Class to be used for chosen which type of calculation
* window to use.
*/
public class NewJFrameMulti extends javax.swing.JFrame {
	private JButton jButtonMultiWindow;
	private ButtonGroup buttonGroupTable;
	private JLabel jLabelWhichTable;
	private JRadioButton jRadioButtonTable3;
	private JRadioButton jRadioButtonTable2;
	private JRadioButton jRadioButtonTable1;
	private JRadioButton jRadioButtonTable4;
	private JRadioButton jRadioButtonTable5;	
	private JRadioButton jRadioButtonTable6;
	private JRadioButton jRadioButtonTable7;
	private JRadioButton jRadioButtonTable8;
	private JRadioButton jRadioButtonTable12;
	private JRadioButton jRadioButtonTable11;
	private JRadioButton jRadioButtonRandom;
	private JRadioButton jRadioButtonTable9;
	private JRadioButton jRadioButtonTable10;

	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrameMulti inst = new NewJFrameMulti();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrameMulti() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jButtonMultiWindow = new JButton();
				getContentPane().add(jButtonMultiWindow);
				jButtonMultiWindow.setText("Create Multi Table");
				jButtonMultiWindow.setBounds(198, 101, 140, 32);
				jButtonMultiWindow.addActionListener(new multiWindow());
			}
			{
				jRadioButtonTable1 = new JRadioButton();
				getContentPane().add(jRadioButtonTable1);
				jRadioButtonTable1.setText("1");
				jRadioButtonTable1.setBounds(42, 61, 43, 20);
				jRadioButtonTable1.setSelected(true);
			}
			{
				jRadioButtonTable6 = new JRadioButton();
				getContentPane().add(jRadioButtonTable6);
				jRadioButtonTable6.setText("6");
				jRadioButtonTable6.setBounds(42, 210, 43, 20);
				jRadioButtonTable6.setSelected(true);
			}			
			{
				jRadioButtonTable2 = new JRadioButton();
				getContentPane().add(jRadioButtonTable2);
				jRadioButtonTable2.setText("2");
				jRadioButtonTable2.setBounds(42, 90, 43, 20);
			}
			{
				jRadioButtonTable7 = new JRadioButton();
				getContentPane().add(jRadioButtonTable7);
				jRadioButtonTable7.setText("7");
				jRadioButtonTable7.setBounds(102, 62, 43, 20);
			}			
			{
				jRadioButtonTable3 = new JRadioButton();
				getContentPane().add(jRadioButtonTable3);
				jRadioButtonTable3.setText("3");
				jRadioButtonTable3.setBounds(42, 119, 43, 20);
			}
			{
				jRadioButtonTable8 = new JRadioButton();
				getContentPane().add(jRadioButtonTable8);
				jRadioButtonTable8.setText("8");
				jRadioButtonTable8.setBounds(102, 91, 43, 20);
			}			
			{
				jRadioButtonTable4 = new JRadioButton();
				getContentPane().add(jRadioButtonTable4);
				jRadioButtonTable4.setText("4");
				jRadioButtonTable4.setBounds(42, 148, 43, 20);
			}	
			{
				jRadioButtonTable9 = new JRadioButton();
				getContentPane().add(jRadioButtonTable9);
				jRadioButtonTable9.setText("9");
				jRadioButtonTable9.setBounds(102, 120, 43, 20);
			}				
			{
				jRadioButtonTable5 = new JRadioButton();
				getContentPane().add(jRadioButtonTable5);
				jRadioButtonTable5.setText("5");
				jRadioButtonTable5.setBounds(42, 177, 43, 20);
			}		
			{
				jRadioButtonTable10 = new JRadioButton();
				getContentPane().add(jRadioButtonTable10);
				jRadioButtonTable10.setText("10");
				jRadioButtonTable10.setBounds(102, 149, 43, 20);
			}	
			{
				jRadioButtonTable11 = new JRadioButton();
				getContentPane().add(jRadioButtonTable11);
				jRadioButtonTable11.setText("11");
				jRadioButtonTable11.setBounds(102, 178, 43, 20);
			}
			{
				jRadioButtonTable12 = new JRadioButton();
				getContentPane().add(jRadioButtonTable12);
				jRadioButtonTable12.setText("12");
				jRadioButtonTable12.setBounds(102, 210, 43, 20);
			}			
			
			{
				jRadioButtonRandom = new JRadioButton();
				getContentPane().add(jRadioButtonRandom);
				jRadioButtonRandom.setText("Random");
				jRadioButtonRandom.setBounds(42, 245, 92, 20);
			}			
			{
				ButtonGroup buttonGroup = getButtonGroupTable();
				buttonGroup.add(jRadioButtonTable1);
				buttonGroup.add(jRadioButtonTable2);
				buttonGroup.add(jRadioButtonTable3);
				buttonGroup.add(jRadioButtonTable4);
				buttonGroup.add(jRadioButtonTable5);
				buttonGroup.add(jRadioButtonTable6);
				buttonGroup.add(jRadioButtonTable7);
				buttonGroup.add(jRadioButtonTable8);
				buttonGroup.add(jRadioButtonTable9);
				buttonGroup.add(jRadioButtonTable10);	
				buttonGroup.add(jRadioButtonTable11);
				buttonGroup.add(jRadioButtonTable12);						
				buttonGroup.add(jRadioButtonRandom);
			}
			{
				jLabelWhichTable = new JLabel();
				getContentPane().add(jLabelWhichTable);
				jLabelWhichTable.setText("Choose your table");
				jLabelWhichTable.setBounds(37, 27, 148, 30);
			}


			pack();
			this.setSize(497, 342);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public JButton getJButtonMultiWindow() {
		return jButtonMultiWindow;
	}
		
	private ButtonGroup getButtonGroupTable() {
		if(buttonGroupTable == null) {
			buttonGroupTable = new ButtonGroup();
		}
		return buttonGroupTable;
	}
	
	public class multiWindow implements ActionListener 
	{
		public void actionPerformed(ActionEvent evt) 
		{
			SwingUtilities.invokeLater(new Runnable() 
			   {
				   public void run() 
				   {
					   int multiTableChosen = 1;
					   boolean randomChosen = false;
					   
					   if (jRadioButtonTable1.isSelected())
					   {
						   multiTableChosen = 1;
					   }
					   else if (jRadioButtonTable2.isSelected())
					   {
						   multiTableChosen = 2;
					   }
					   else if (jRadioButtonTable3.isSelected())
					   {
						   multiTableChosen = 3;
					   }
					   else if (jRadioButtonTable4.isSelected())
					   {
						   multiTableChosen = 4;
					   }	
					   else if (jRadioButtonTable5.isSelected())
					   {
						   multiTableChosen = 5;
					   }
					   else if (jRadioButtonTable6.isSelected())
					   {
						   multiTableChosen = 6;
					   }	
					   else if (jRadioButtonTable7.isSelected())
					   {
						   multiTableChosen = 7;
					   }
					   else if (jRadioButtonTable8.isSelected())
					   {
						   multiTableChosen = 8;
					   }	
					   else if (jRadioButtonTable9.isSelected())
					   {
						   multiTableChosen = 9;
					   }
					   else if (jRadioButtonTable10.isSelected())
					   {
						   multiTableChosen = 10;
					   }
					   else if (jRadioButtonTable11.isSelected())
					   {
						   multiTableChosen = 11;
					   }	
					   else if (jRadioButtonTable12.isSelected())
					   {
						   multiTableChosen = 12;
					   }					   					   
					   else if (jRadioButtonRandom.isSelected())
					   {
						   randomChosen = true;
					   }						   
						
					   NewJFrameTestMultiVec1 inst; 
					   NewJFrameTestMultiRandom instRandom; 
					   if (randomChosen) {
						   instRandom = new NewJFrameTestMultiRandom();
						   //instRandom.setLocation(750, 100);
						   instRandom.setLocation(600, 100);
						   instRandom.setVisible(true);						   
					   }
					   else {
						   inst = new NewJFrameTestMultiVec1(multiTableChosen);		
						   inst.setLocation(750, 100);
						   inst.setVisible(true);						   
					   }

					   // inst.setLocationRelativeTo(null);

				   }	
			   }
		   );
	    }
		
	}	

}

//new ActionListener() {
//	public void actionPerformed(ActionEvent evt) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				NewJFrameTestMulti inst = new NewJFrameTestMulti(1);
//				// inst.setLocationRelativeTo(null);
//				inst.setLocation(750, 100);
//				inst.setVisible(true);
//			}
//		});
//		//System.out.println("jButtonMultiWindow.actionPerformed, event="+evt);
//		//TODO add your code for jButtonMultiWindow.actionPerformed
//	}
// });


