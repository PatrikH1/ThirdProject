package modernCalc;

import javax.swing.Icon;
import javax.swing.JRadioButton;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class ModernRadioButton extends JRadioButton {
    public ModernRadioButton(String text) {
        super(text);
        setOpaque(false);
        setForeground(ModernTheme.TEXT_PRIMARY);
        setFont(ModernTheme.FONT_RADIO);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setIconTextGap(8);
        setIcon(new RadioIcon(false));
        setSelectedIcon(new RadioIcon(true));
    }

    private static class RadioIcon implements Icon {
        private final boolean selected;
        RadioIcon(boolean selected) { this.selected = selected; }

        @Override public int getIconWidth() { return 18; }
        @Override public int getIconHeight() { return 18; }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int size = 16;
            if (selected) {
                g2.setColor(ModernTheme.ACCENT);
                g2.setStroke(new BasicStroke(2f));
                g2.drawOval(x + 1, y + 1, size, size);
                g2.setColor(ModernTheme.ACCENT_HOVER);
                g2.fillOval(x + 5, y + 5, 8, 8);
            } else {
                g2.setColor(ModernTheme.SURFACE_BORDER);
                g2.setStroke(new BasicStroke(1.5f));
                g2.drawOval(x + 1, y + 1, size, size);
                g2.setColor(new Color(0, 0, 0, 60));
                g2.fillOval(x + 2, y + 2, size - 2, size - 2);
            }
            g2.dispose();
        }
    }
}
