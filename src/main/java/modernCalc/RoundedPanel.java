package modernCalc;

import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundedPanel extends JPanel {
    private final int radius;
    private final Color fill;
    private final Color border;

    public RoundedPanel(int radius, Color fill, Color border) {
        this.radius = radius;
        this.fill = fill;
        this.border = border;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        g2.setColor(new Color(0, 0, 0, 60));
        g2.fillRoundRect(0, 2, w, h, radius * 2, radius * 2);

        g2.setColor(fill);
        g2.fillRoundRect(0, 0, w, h - 2, radius * 2, radius * 2);

        if (border != null) {
            g2.setColor(border);
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 1, h - 3, radius * 2, radius * 2);
        }
        g2.dispose();
        super.paintComponent(g);
    }
}
