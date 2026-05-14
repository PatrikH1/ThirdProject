package modernCalc;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoundedButton extends JButton {
    public enum Style { PRIMARY, SECONDARY, GHOST }

    private final Style style;
    private boolean hovered;
    private boolean pressed;
    private final int radius = 12;

    public RoundedButton(String text, Style style) {
        super(text);
        this.style = style;
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setOpaque(false);
        setForeground(ModernTheme.TEXT_PRIMARY);
        setFont(ModernTheme.FONT_BUTTON);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setBorder(BorderFactory.createEmptyBorder(10, 18, 10, 18));

        addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { if (isEnabled()) { hovered = true; repaint(); } }
            @Override public void mouseExited(MouseEvent e) { hovered = false; pressed = false; repaint(); }
            @Override public void mousePressed(MouseEvent e) { if (isEnabled()) { pressed = true; repaint(); } }
            @Override public void mouseReleased(MouseEvent e) { pressed = false; repaint(); }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        int arc = radius * 2;

        Paint paint;
        Color fg = ModernTheme.TEXT_PRIMARY;
        boolean drawBorder = false;
        boolean drawShadow = false;

        switch (style) {
            case PRIMARY: {
                Color c1, c2;
                if (pressed) {
                    c1 = new Color(0x4F46E5);
                    c2 = new Color(0x7E22CE);
                } else if (hovered) {
                    c1 = new Color(0x7C3AED);
                    c2 = new Color(0xC026D3);
                } else {
                    c1 = ModernTheme.ACCENT_GRADIENT_START;
                    c2 = ModernTheme.ACCENT_GRADIENT_END;
                }
                paint = new GradientPaint(0, 0, c1, w, h, c2);
                fg = Color.WHITE;
                drawShadow = !pressed;
                break;
            }
            case SECONDARY: {
                Color base = pressed ? new Color(0x475569)
                        : (hovered ? new Color(0x334155) : new Color(0x1F2937));
                paint = base;
                fg = ModernTheme.TEXT_PRIMARY;
                drawBorder = true;
                break;
            }
            case GHOST:
            default: {
                paint = hovered ? new Color(255, 255, 255, 20) : new Color(0, 0, 0, 0);
                fg = ModernTheme.TEXT_SECONDARY;
                drawBorder = true;
                break;
            }
        }

        if (drawShadow) {
            g2.setColor(new Color(0, 0, 0, 70));
            g2.fillRoundRect(0, 3, w, h - 1, arc, arc);
        }

        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, w, h - (drawShadow ? 3 : 0), arc, arc);

        if (drawBorder) {
            g2.setColor(ModernTheme.SURFACE_BORDER);
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 1, h - 1, arc, arc);
        }

        g2.setFont(getFont());
        g2.setColor(fg);
        FontMetrics fm = g2.getFontMetrics();
        String text = getText();
        if (text == null) text = "";
        if (text.contains("\n")) {
            String[] lines = text.split("\n");
            int lineHeight = fm.getHeight();
            int totalHeight = lineHeight * lines.length;
            int y = (h - totalHeight) / 2 + fm.getAscent();
            for (String line : lines) {
                int tx = (w - fm.stringWidth(line)) / 2;
                g2.drawString(line, tx, y);
                y += lineHeight;
            }
        } else {
            int tx = (w - fm.stringWidth(text)) / 2;
            int ty = (h - fm.getHeight()) / 2 + fm.getAscent();
            g2.drawString(text, tx, ty);
        }
        g2.dispose();
    }
}
