package guiFirstTest;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

/**
 *  Class to hold two jLabel, one jTextField and more jLabel and also coordinates for the labels and
 *  the fields.
 */
public class MultiLabelTextField {
	// Constants
	public static final int MULTI = 1;
	public static final int DIV = 2;
		
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
		this.jLabel = new JLabel("", JLabel.RIGHT);
		this.jTextField = new JTextField();
		this.jLabelResult = new JLabel();
		this.coordJLabel = coordJLabel;
		this.coordJTextField = coordJTextField;
		this.coordJLabelResult = coordJLabelResult;
	} 	
	
	/**
	 *  Creates Label and textfields.
	 *  
	 *  Inparameter: The JFrame to be used when calling getContentPane.
	 */			
	public void createLabelAndFields(JFrame jFrameToUse ) {
		{
			jFrameToUse.getContentPane().add(jLabel);
			jLabel.setText(num1 + " x " + num2 + " = ");
			jLabel.setBounds(coordJLabel.getX1(), coordJLabel.getY1(), 
					coordJLabel.getX2(), coordJLabel.getY2());
		}
		{
			jFrameToUse.getContentPane().add(jTextField);
			jTextField.setText("");
			jTextField.setBounds(coordJTextField.getX1(), coordJTextField.getY1(), 
					coordJTextField.getX2(), coordJTextField.getY2());
		}		
		{
			jFrameToUse.getContentPane().add(jLabelResult);
			jLabelResult.setBounds(coordJLabelResult.getX1(), coordJLabelResult.getY1(), 
					coordJLabelResult.getX2(), coordJLabelResult.getY2());
			jLabelResult.setText("");
			jLabelResult.setFont(new java.awt.Font("Times New Roman",0,12));
		}			
	}		
	
	/**
	 *  New numbers are generated..
	 */		
	public void genNewNumber(int num1, int num2, int operator) {
		this.num1 = num1;
		this.num2 = num2;

		if (operator == MULTI) {
			jLabel.setText(num1 + " x " + num2 + " = ");
		} else if (operator == DIV) {
			jLabel.setText(num1 + " / " + num2 + " = ");
		}
	}
	
	
}  // End of internal class MultiLabelTextField
