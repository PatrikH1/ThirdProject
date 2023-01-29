package guiFirstTest;
import java.awt.BorderLayout;
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
public class NewJFrameTestMulti extends javax.swing.JFrame {
	private int multiTable;
	
	// jLabels
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;	
	
	// jTextFields
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTextField jTextField9;
	private JTextField jTextField10;	
	
	// Result jLabels, OK or Error
	private JLabel jLabelResult1;	
	private JLabel jLabelResult2;
	private JLabel jLabelResult3;
	private JLabel jLabelResult4;
	private JLabel jLabelResult5;
	private JLabel jLabelResult6;	
	private JLabel jLabelResult7;
	private JLabel jLabelResult8;
	private JLabel jLabelResult9;
	private JLabel jLabelResult10;	
	
	// Buttons
	private JButton jButtonReset;
	private JButton jButtonCheck;	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrameTestMulti inst = new NewJFrameTestMulti();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrameTestMulti() {
		super();
		this.multiTable = 8;
		initGUI();
	}
	
	public NewJFrameTestMulti(int multiTable) {
		super();
		this.multiTable = multiTable;
		initGUI();
	}	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			// Text 1
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("1 x " + multiTable + " = ");
				jLabel1.setBounds(33, 32, 49, 16);
				jLabel1.setForeground(new java.awt.Color(255,0,0));
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setText("");
				jTextField1.setBounds(76, 29, 62, 22);
			}		
			{
				jLabelResult1 = new JLabel();
				getContentPane().add(jLabelResult1);
				jLabelResult1.setBounds(142, 34, 31, 10);
				jLabelResult1.setText("");
				jLabelResult1.setFont(new java.awt.Font("Times New Roman",0,12));
			}			
			
			// Text 2
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("2 x " + multiTable + " = ");
				jLabel2.setBounds(33, 65, 49, 16);
				jLabel2.setForeground(new java.awt.Color(28,210,23));
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setText("");
				jTextField2.setBounds(76, 62, 62, 22);
			}
			{
				jLabelResult2 = new JLabel();
				getContentPane().add(jLabelResult2);
				jLabelResult2.setBounds(142, 67, 31, 10);
				jLabelResult2.setText("");
				jLabelResult2.setFont(new java.awt.Font("Times New Roman",0,12));
			}				
			
			// Text 3
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("3 x " + multiTable + " = ");
				jLabel3.setBounds(33, 98, 49, 16);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setText("");
				jTextField3.setBounds(76, 95, 62, 22);
			}
			{
				jLabelResult3 = new JLabel();
				getContentPane().add(jLabelResult3);
				jLabelResult3.setBounds(142, 100, 31, 10);
				jLabelResult3.setText("");
				jLabelResult3.setFont(new java.awt.Font("Times New Roman",0,12));
			}						
			
			// Text 4
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("4 x " + multiTable + " = ");
				jLabel4.setBounds(33, 131, 49, 16);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setText("");
				jTextField4.setBounds(76, 128, 62, 22);
			}		
			{
				jLabelResult4 = new JLabel();
				getContentPane().add(jLabelResult4);
				jLabelResult4.setBounds(142, 133, 31, 10);
				jLabelResult4.setText("");
				jLabelResult4.setFont(new java.awt.Font("Times New Roman",0,12));
			}								
			
			// Text 5
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("5 x " + multiTable + " = ");
				jLabel5.setBounds(33, 164, 49, 16);
			}
			{
				jTextField5 = new JTextField();
				getContentPane().add(jTextField5);
				jTextField5.setText("");
				jTextField5.setBounds(76, 161, 62, 22);
			}			
			{
				jLabelResult5 = new JLabel();
				getContentPane().add(jLabelResult5);
				jLabelResult5.setBounds(142, 166, 31, 10);
				jLabelResult5.setText("");
				jLabelResult5.setFont(new java.awt.Font("Times New Roman",0,12));
			}						
			
			// Text6
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("6 x " + multiTable + " = ");
				jLabel6.setBounds(179, 32, 49, 16);
			}						
			{
				jTextField6 = new JTextField();
				getContentPane().add(jTextField6);
				jTextField6.setText("");
				jTextField6.setBounds(222, 29, 62, 22);
			}
			{
				jLabelResult6 = new JLabel();
				getContentPane().add(jLabelResult6);
				jLabelResult6.setBounds(288, 34, 31, 10);
				jLabelResult6.setText("");
				jLabelResult6.setFont(new java.awt.Font("Times New Roman",0,12));
			}							
			
			// Text7
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("7 x " + multiTable + " = ");
				jLabel7.setBounds(179, 65, 49, 16);
			}						
			{
				jTextField7 = new JTextField();
				getContentPane().add(jTextField7);
				jTextField7.setText("");
				jTextField7.setBounds(222, 62, 62, 22);
			}			
			{
				jLabelResult7 = new JLabel();
				getContentPane().add(jLabelResult7);
				jLabelResult7.setBounds(288, 67, 31, 10);
				jLabelResult7.setText("");
				jLabelResult7.setFont(new java.awt.Font("Times New Roman",0,12));
			}										
			
			// Text8
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("8 x " + multiTable + " = ");
				jLabel8.setBounds(179, 98, 49, 16);
			}						
			{
				jTextField8 = new JTextField();
				getContentPane().add(jTextField8);
				jTextField8.setText("");
				jTextField8.setBounds(222, 95, 62, 22);
			}	
			{
				jLabelResult8 = new JLabel();
				getContentPane().add(jLabelResult8);
				jLabelResult8.setBounds(288, 100, 31, 10);
				jLabelResult8.setText("");
				jLabelResult8.setFont(new java.awt.Font("Times New Roman",0,12));
			}										
			
			// Text 9
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("9 x " + multiTable + " = ");
				jLabel9.setBounds(179, 131, 49, 16);
			}
			{
				jTextField9 = new JTextField();
				getContentPane().add(jTextField9);
				jTextField9.setText("");
				jTextField9.setBounds(222, 128, 62, 22);
			}
			{
				jLabelResult9 = new JLabel();
				getContentPane().add(jLabelResult9);
				jLabelResult9.setBounds(288, 133, 31, 10);
				jLabelResult9.setText("");
				jLabelResult9.setFont(new java.awt.Font("Times New Roman",0,12));
			}			
						
			// Text 10
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setText("10 x " + multiTable + " = ");
				if (multiTable == 10)
				{
			       jLabel10.setBounds(170, 164, 60, 16);
				}
				else
				{
				   jLabel10.setBounds(173, 164, 49, 16);
				}
			
			}
			{
				jTextField10 = new JTextField();
				getContentPane().add(jTextField10);
				jTextField10.setText("");
				jTextField10.setBounds(222, 161, 62, 22);
			}
			{
				jLabelResult10 = new JLabel();
				getContentPane().add(jLabelResult10);
				jLabelResult10.setBounds(288, 166, 31, 10);
				jLabelResult10.setText("");
				jLabelResult10.setFont(new java.awt.Font("Times New Roman",0,12));
			}										
						
			{
				jButtonCheck = new JButton();
				getContentPane().add(jButtonCheck);
				jButtonCheck.setText("Check");
				jButtonCheck.setBounds(64, 206, 81, 26);
				jButtonCheck.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCheckActionPerformed(evt);
					}
				});
			}
			{
				jButtonReset = new JButton();
				getContentPane().add(jButtonReset);
				jButtonReset.setText("Reset");
				jButtonReset.setBounds(175, 206, 81, 26);
				jButtonReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonResetActionPerformed(evt);
					}
				});
			}

			pack();
			this.setSize(345, 291);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButtonCheckActionPerformed(ActionEvent evt) 
	{
        // Check of text 1
		printOKorError( jLabelResult1, jTextField1, 1);
		
        // Check of text 2
		printOKorError( jLabelResult2, jTextField2, 2);		
		
	    // Check of text 3
	    printOKorError( jLabelResult3, jTextField3, 3);
	    
	    // Check of text 4
	    printOKorError( jLabelResult4, jTextField4, 4);
	    
	    // Check of text 5
	    printOKorError( jLabelResult5, jTextField5, 5);		
	    
	    // Check of text 6
	    printOKorError( jLabelResult6, jTextField6, 6);	
	    
	    // Check of text 7
	    printOKorError( jLabelResult7, jTextField7, 7);
	    
	    // Check of text 8
	    printOKorError( jLabelResult8, jTextField8, 8);		    	
	    
	    // Check of text 9
	    printOKorError( jLabelResult9, jTextField9, 9);
	    
	    // Check of text 10
	    printOKorError( jLabelResult10, jTextField10, 10);		    	    
	}
	
	private void jButtonResetActionPerformed(ActionEvent evt) 
	{
		// Reset 1
		jTextField1.setText("");
		jLabelResult1.setText("");	
		
		// Reset 2
		jTextField2.setText("");
		jLabelResult2.setText("");
		
		// Reset 3
		jTextField3.setText("");
		jLabelResult3.setText("");
		
		// Reset 4
		jTextField4.setText("");
		jLabelResult4.setText("");
		
		// Reset 5
		jTextField5.setText("");
		jLabelResult5.setText("");	
		
		// Reset 6
		jTextField6.setText("");
		jLabelResult6.setText("");	
		
		// Reset 7
		jTextField7.setText("");
		jLabelResult7.setText("");
		
		// Reset 8
		jTextField8.setText("");
		jLabelResult8.setText("");
		
		// Reset 9
		jTextField9.setText("");
		jLabelResult9.setText("");
		
		// Reset 10
		jTextField10.setText("");
		jLabelResult10.setText("");					
	}
	
	private void printOKorError(JLabel jLabel, JTextField jTextField, int num)
	{
		try
		{		
		   Integer tmpInteger = new Integer(jTextField.getText());
		   if (tmpInteger.intValue() == (num * multiTable))
		   {
			   jLabel.setText("OK");
		   }
		   else
		   {
			   jLabel.setText("Error");			
		   }		
		}
		catch (NumberFormatException ex)
		{
			jLabel.setText("Error");	
		}		
	}

}
