package modernCalc;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

public class GradientBackgroundPanel extends JPanel {
    private final Color top;
    private final Color bottom;

    public GradientBackgroundPanel(Color top, Color bottom) {
        this.top = top;
        this.bottom = bottom;
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();

        GradientPaint base = new GradientPaint(0, 0, top, 0, h, bottom);
        g2.setPaint(base);
        g2.fillRect(0, 0, w, h);

        Point2D center = new Point2D.Float(w * 0.85f, h * 0.1f);
        float radius = Math.max(w, h) * 0.55f;
        float[] dist = { 0.0f, 1.0f };
        Color[] colors = { new Color(139, 92, 246, 60), new Color(139, 92, 246, 0) };
        RadialGradientPaint glow = new RadialGradientPaint(center, radius, dist, colors);
        g2.setPaint(glow);
        g2.fillRect(0, 0, w, h);

        Point2D center2 = new Point2D.Float(w * 0.1f, h * 0.9f);
        Color[] colors2 = { new Color(99, 102, 241, 55), new Color(99, 102, 241, 0) };
        RadialGradientPaint glow2 = new RadialGradientPaint(center2, radius, dist, colors2);
        g2.setPaint(glow2);
        g2.fillRect(0, 0, w, h);

        g2.dispose();
    }
}
