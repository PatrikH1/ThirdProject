package guiFirstTest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import java.util.Iterator;
import java.util.Vector;

/**
*  This class displays a window where you can write answers to the multiplication table.
*  One button checks your answers and another on resets all values.
*/
public class NewJFrameTestMultiVec1 extends javax.swing.JFrame {
	private int multiTable;
	private Vector<MultiLabelTextField> multiTextsAndFileldsVec;

	/**
	 *  Class to hold coordinates.
	 */
	public class Coordinates {
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		
		public Coordinates(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		public int getX1() {
			return x1;
		}

		public void setX1(int x1) {
			this.x1 = x1;
		}

		public int getY1() {
			return y1;
		}

		public void setY1(int y1) {
			this.y1 = y1;
		}

		public int getX2() {
			return x2;
		}

		public void setX2(int x2) {
			this.x2 = x2;
		}

		public int getY2() {
			return y2;
		}

		public void setY2(int y2) {
			this.y2 = y2;
		}
	}
	
	/**
	 *  Class to hold two jLabel and one jTextField and also coordinates for the labels and
	 *  the fields.
	 */
	public class MultiLabelTextField {
        // The multi number
		private int num1;
		private int num2;
		
		// Labels and textfields
		private JLabel jLabel;
		private JTextField jTextField;
		private JLabel jLabelResult;	
		
		// Coordinates
		private Coordinates coordJLabel;
		private Coordinates coordJTextField;
		private Coordinates coordJLabelResult;		
		
		// Getters
		public int getNum1() {
			return num1;
		}
		
		public int getNum2() {
			return num2;
		}		

		public JTextField getjTextField() {
			return jTextField;
		}

		public JLabel getjLabelResult() {
			return jLabelResult;
		}		
		
		/**
		 *  Constructor for multiLabelTextField.
		 */		
		public MultiLabelTextField(int num1, int num2,
				Coordinates coordJLabel, 
				Coordinates coordJTextField, 
				Coordinates coordJLabelResult) {
			this.num1 = num1;
			this.num2 = num2;
			this.jLabel = new JLabel();
			this.jTextField = new JTextField();
			this.jLabelResult = new JLabel();
			this.coordJLabel = coordJLabel;
			this.coordJTextField = coordJTextField;
			this.coordJLabelResult = coordJLabelResult;
		} 	
		
		/**
		 *  Creates Label and textfields.
		 */			
		public void createLabelAndFields() {
			{
				getContentPane().add(jLabel);
				jLabel.setText(num1 + " x " + num2 + " = ");
				jLabel.setBounds(coordJLabel.getX1(), coordJLabel.getY1(), 
						coordJLabel.getX2(), coordJLabel.getY2());
			}
			{
				getContentPane().add(jTextField);
				jTextField.setText("");
				jTextField.setBounds(coordJTextField.getX1(), coordJTextField.getY1(), 
						coordJTextField.getX2(), coordJTextField.getY2());
			}		
			{
				getContentPane().add(jLabelResult);
				jLabelResult.setBounds(coordJLabelResult.getX1(), coordJLabelResult.getY1(), 
						coordJLabelResult.getX2(), coordJLabelResult.getY2());
				jLabelResult.setText("");
				jLabelResult.setFont(new java.awt.Font("Times New Roman",0,12));
			}			
		}		
	}
		
	// Buttons
	private JButton jButtonReset;
	private JButton jButtonCheck;	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrameTestMultiVec inst = new NewJFrameTestMultiVec();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	/**
	* Constructor that gives you the default multiplication table 5.
	*/	
	public NewJFrameTestMultiVec1() {
		super();
		this.multiTable = 5;
		this.multiTextsAndFileldsVec = new Vector<MultiLabelTextField>();
		initGUI();
	}
	
	/**
	* Constructor that gives you the multiplication table that is given as inparameter.
	* 
	* Inparameter multiTable int gives you the multiplication table that should be calculated.
	*   
	*/	
	public NewJFrameTestMultiVec1(int multiTable) {
		super();
		this.multiTable = multiTable;
		this.multiTextsAndFileldsVec = new Vector<MultiLabelTextField>();
		initGUI();
	}	

	/**
	* Method to initiate all labels and all textfields on the window.
	*   
	*/	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			// JLabel coordinates
			int labelX1 = 33;
			int labelY1 = 32;
			int labelX2 = 49;
			int labelY2 = 16;
			
			// JTextField coordinates
			int textFieldX1 = 76;
			int textFieldY1 = 29;
			int textFieldX2 = 62;
			int textFieldY2 = 22;	
			
			// jLabelResult
			int resultX1 = 142;
			int resultY1 = 34;
			int resultX2 = 31;
			int resultY2 = 10;			
			
			int deltaY1 = 33;		
			
			// First column
			int max = 5;
			int i = 0;
			for (i = 0; i < max; i++) {
				if (i > 0) {
					labelY1 += deltaY1;
					textFieldY1 += deltaY1;
					resultY1+= deltaY1;					
				}
				int tmpLabelX1 = labelX1;
				int tmpLabelX2 = labelX2;				
				if ((i + 1) > 9)
				{
					tmpLabelX1 = tmpLabelX1 - 6;
				}
				if (multiTable > 9)
				{
					tmpLabelX1 = tmpLabelX1 - 6;
					tmpLabelX2 = tmpLabelX2 + 11;
				}				
				multiTextsAndFileldsVec.add(new MultiLabelTextField(i + 1, multiTable,
						new Coordinates(tmpLabelX1, labelY1, labelX2, labelY2), 
						new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
						new Coordinates(resultX1, resultY1, resultX2, resultY2)));
			}	
			
			// JLabel coordinates
			labelX1 = 179;
			labelY1 = 32;
			
			// JTextField coordinates
			textFieldX1 = 222;
			textFieldY1 = 29;
			
			// jLabelResult
			resultX1 = 288;
			resultY1 = 34;
			
			// Second column
			for (i = 0; i < max; i++) {
				if (i > 0) {
					labelY1 += deltaY1;
					textFieldY1 += deltaY1;
					resultY1+= deltaY1;					
				}
				int tmpLabelX1 = labelX1;
				int tmpLabelX2 = labelX2;
				if ((i + 6) > 9)
				{
					tmpLabelX1 = tmpLabelX1 - 6;
				}
				if (multiTable > 9)
				{
					tmpLabelX1 = tmpLabelX1 - 6;
					tmpLabelX2 = tmpLabelX2 + 11;
				}							
				multiTextsAndFileldsVec.add(new MultiLabelTextField(i + 6, multiTable,
						new Coordinates(tmpLabelX1, labelY1, tmpLabelX2, labelY2), 
						new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
						new Coordinates(resultX1, resultY1, resultX2, resultY2)));
			}			

			// All labels and text fields are created.
			Iterator<MultiLabelTextField> iter = multiTextsAndFileldsVec.iterator();
			while (iter.hasNext()) {
				((MultiLabelTextField) iter.next()).createLabelAndFields();
			}			
			
			// The check button is created.
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
			
			// The reset button is added.
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
	
	/**
	* Action method called when check button is pushed.
	*/	
	private void jButtonCheckActionPerformed(ActionEvent evt) 
	{
		// The values in all fields are checked by this iterator for the vector.
		Iterator<MultiLabelTextField> iter = multiTextsAndFileldsVec.iterator();
		while (iter.hasNext()) {
			MultiLabelTextField currField = ((MultiLabelTextField) iter.next());
			printOKorError(currField.getjLabelResult(), currField.getjTextField(), 
					currField.getNum1(), currField.getNum2());
		}					
	}
	
	/**
	* Action method called when reset button is pushed.
	*/	
	private void jButtonResetActionPerformed(ActionEvent evt) 
	{
		// The values in all fields are checked by this iterator for the vector.
		Iterator<MultiLabelTextField> iter = multiTextsAndFileldsVec.iterator();
		while (iter.hasNext()) {
			MultiLabelTextField currField = ((MultiLabelTextField) iter.next());
			currField.getjTextField().setText("");
			currField.getjLabelResult().setText("");
		}										
	}
	
	/**
	* Action method called when reset button is pushed. Resets all fields.
	*/		
	private void printOKorError(JLabel jLabel, JTextField jTextField, int num1, int num2)
	{
		try
		{		
		   Integer tmpInteger = new Integer(jTextField.getText());
		   if (tmpInteger == (num1 * num2))
		   {
			   jLabel.setForeground(new java.awt.Color(28,210,23));
			   jLabel.setText("OK");
		   }
		   else
		   {
			   jLabel.setForeground(new java.awt.Color(255,0,0));
			   jLabel.setText("Error");			
		   }		
		}
		catch (NumberFormatException ex)
		{
			jLabel.setForeground(new java.awt.Color(255,0,0));
			jLabel.setText("Error");	
		}		
	}
}
