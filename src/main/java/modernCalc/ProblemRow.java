package modernCalc;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class ProblemRow extends JPanel {
    public static final int MULTI = 1;
    public static final int DIV = 2;

    private int num1;
    private int num2;
    private final JLabel exprLabel;
    private final RoundedTextField textField;
    private final JLabel resultLabel;

    public ProblemRow() {
        this.num1 = 1;
        this.num2 = 1;

        setOpaque(false);
        setLayout(new GridBagLayout());

        exprLabel = new JLabel();
        exprLabel.setForeground(ModernTheme.TEXT_PRIMARY);
        exprLabel.setFont(ModernTheme.FONT_PROBLEM);
        exprLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        exprLabel.setPreferredSize(new Dimension(82, 28));

        textField = new RoundedTextField(4);
        textField.setPreferredSize(new Dimension(74, 32));

        resultLabel = new JLabel(" ");
        resultLabel.setFont(ModernTheme.FONT_RESULT);
        resultLabel.setForeground(ModernTheme.TEXT_MUTED);
        resultLabel.setPreferredSize(new Dimension(82, 28));
        resultLabel.setHorizontalAlignment(SwingConstants.LEFT);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 4, 3, 4);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridx = 0; add(exprLabel, gbc);
        gbc.gridx = 1; add(textField, gbc);
        gbc.gridx = 2; add(resultLabel, gbc);

        updateExprText(MULTI);
    }

    public void updateExprText(int operator) {
        String op = (operator == MULTI) ? "×" : "÷";
        exprLabel.setText(num1 + " " + op + " " + num2 + " =");
    }

    public int getNum1() { return num1; }
    public int getNum2() { return num2; }
    public JTextField getTextField() { return textField; }

    public void setNumbers(int num1, int num2, int operator) {
        this.num1 = num1;
        this.num2 = num2;
        updateExprText(operator);
    }

    public void clearAnswer() {
        textField.setText("");
        resultLabel.setText(" ");
    }

    public void setResultOk() {
        resultLabel.setForeground(ModernTheme.SUCCESS_LIGHT);
        resultLabel.setText("✓ OK");
    }

    public void setResultNotOk() {
        resultLabel.setForeground(ModernTheme.ERROR_LIGHT);
        resultLabel.setText("✗ Not OK");
    }
}
