package modernCalc;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class ModernTimer extends RoundedPanel {
    private final JLabel timeLabel;
    private final Timer timer;
    private int totalSeconds = 0;
    private boolean running = false;

    public ModernTimer() {
        super(14, ModernTheme.SURFACE_ALT, ModernTheme.SURFACE_BORDER);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("00:00", SwingConstants.CENTER);
        timeLabel.setForeground(ModernTheme.TEXT_PRIMARY);
        timeLabel.setFont(ModernTheme.FONT_TIMER);
        add(timeLabel, BorderLayout.CENTER);

        setPreferredSize(new Dimension(160, 60));

        timer = new Timer(1000, e -> {
            totalSeconds++;
            updateLabel();
        });
        timer.setInitialDelay(1000);
    }

    private void updateLabel() {
        int min = totalSeconds / 60;
        int sec = totalSeconds % 60;
        timeLabel.setText(String.format("%02d:%02d", min, sec));
    }

    public void start() {
        if (!running) {
            timer.start();
            running = true;
        }
    }

    public void stop() {
        timer.stop();
        running = false;
    }

    public void reset() {
        timer.stop();
        running = false;
        totalSeconds = 0;
        updateLabel();
    }
}
