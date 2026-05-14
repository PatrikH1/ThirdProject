package modernCalc;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class RoundedTextField extends JTextField {
    private boolean focused = false;
    private final int radius = 10;

    public RoundedTextField(int columns) {
        super(columns);
        setOpaque(false);
        setBackground(ModernTheme.INPUT_BG);
        setForeground(ModernTheme.TEXT_PRIMARY);
        setCaretColor(ModernTheme.ACCENT_HOVER);
        setSelectionColor(ModernTheme.ACCENT);
        setSelectedTextColor(Color.WHITE);
        setFont(ModernTheme.FONT_INPUT);
        setHorizontalAlignment(JTextField.CENTER);
        setBorder(BorderFactory.createEmptyBorder(6, 10, 6, 10));

        addFocusListener(new FocusListener() {
            @Override public void focusGained(FocusEvent e) { focused = true; repaint(); }
            @Override public void focusLost(FocusEvent e) { focused = false; repaint(); }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int arc = radius * 2;

        if (focused) {
            g2.setColor(new Color(139, 92, 246, 55));
            g2.fillRoundRect(-2, -2, getWidth() + 4, getHeight() + 4, arc + 4, arc + 4);
        }

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
        g2.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color borderColor = focused ? ModernTheme.ACCENT : ModernTheme.INPUT_BORDER;
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(focused ? 1.6f : 1f));
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius * 2, radius * 2);
        g2.dispose();
    }
}
