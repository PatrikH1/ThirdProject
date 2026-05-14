package modernCalc;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

public class ModernCalcApp extends JFrame {
    private static final int ROWS = 10;
    private static final int COLUMNS = 4;
    private static final int TOTAL = ROWS * COLUMNS;

    private final List<ProblemRow> problems = new ArrayList<>(TOTAL);
    private final ModernTimer timer = new ModernTimer();
    private final JLabel summaryLabel = new JLabel(" ", SwingConstants.RIGHT);
    private final NumberGenerator generator = new NumberGenerator();

    private ModernRadioButton multiButton;
    private ModernRadioButton divButton;
    private int operator = ProblemRow.MULTI;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ignored) {
            // fall back to default L&F
        }
        SwingUtilities.invokeLater(() -> {
            ModernCalcApp app = new ModernCalcApp();
            app.setVisible(true);
        });
    }

    public ModernCalcApp() {
        super("Math Practice — Modern");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1180, 780));
        setSize(1240, 820);
        setLocationRelativeTo(null);

        GradientBackgroundPanel root = new GradientBackgroundPanel(ModernTheme.BG_TOP, ModernTheme.BG_BOTTOM);
        root.setLayout(new BorderLayout());
        root.setBorder(new EmptyBorder(22, 28, 22, 28));
        setContentPane(root);

        root.add(buildHeader(), BorderLayout.NORTH);
        root.add(buildProblemCard(), BorderLayout.CENTER);
        root.add(buildFooter(), BorderLayout.SOUTH);

        regenerateProblems();
    }

    private JPanel buildHeader() {
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);
        header.setBorder(new EmptyBorder(4, 4, 18, 4));

        JLabel title = new JLabel("Math Practice");
        title.setForeground(ModernTheme.TEXT_PRIMARY);
        title.setFont(ModernTheme.FONT_TITLE);

        JLabel subtitle = new JLabel("Drill the multiplication and division tables.");
        subtitle.setForeground(ModernTheme.TEXT_SECONDARY);
        subtitle.setFont(ModernTheme.FONT_SUBTITLE);

        JPanel titleBlock = new JPanel();
        titleBlock.setOpaque(false);
        titleBlock.setLayout(new BoxLayout(titleBlock, BoxLayout.Y_AXIS));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);
        subtitle.setAlignmentX(Component.LEFT_ALIGNMENT);
        titleBlock.add(title);
        titleBlock.add(Box.createVerticalStrut(4));
        titleBlock.add(subtitle);

        header.add(titleBlock, BorderLayout.WEST);
        header.add(buildTimerCard(), BorderLayout.EAST);
        return header;
    }

    private RoundedPanel buildTimerCard() {
        RoundedPanel card = new RoundedPanel(18, ModernTheme.SURFACE, ModernTheme.SURFACE_BORDER);
        card.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        card.setBorder(new EmptyBorder(6, 14, 6, 14));

        card.add(timer);

        RoundedButton start = new RoundedButton("Start", RoundedButton.Style.PRIMARY);
        start.setPreferredSize(new Dimension(78, 40));
        start.addActionListener(e -> timer.start());

        RoundedButton stop = new RoundedButton("Stop", RoundedButton.Style.SECONDARY);
        stop.setPreferredSize(new Dimension(78, 40));
        stop.addActionListener(e -> timer.stop());

        RoundedButton resetTime = new RoundedButton("Reset", RoundedButton.Style.GHOST);
        resetTime.setPreferredSize(new Dimension(78, 40));
        resetTime.addActionListener(e -> timer.reset());

        card.add(start);
        card.add(stop);
        card.add(resetTime);
        return card;
    }

    private RoundedPanel buildProblemCard() {
        RoundedPanel card = new RoundedPanel(24, ModernTheme.SURFACE, ModernTheme.SURFACE_BORDER);
        card.setLayout(new BorderLayout());
        card.setBorder(new EmptyBorder(24, 20, 24, 20));

        JPanel grid = new JPanel(new GridLayout(ROWS, COLUMNS, 12, 6));
        grid.setOpaque(false);

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                ProblemRow p = new ProblemRow();
                problems.add(p);
                grid.add(p);
            }
        }

        card.add(grid, BorderLayout.CENTER);
        return card;
    }

    private JPanel buildFooter() {
        JPanel footer = new JPanel(new BorderLayout());
        footer.setOpaque(false);
        footer.setBorder(new EmptyBorder(18, 4, 4, 4));

        JPanel actions = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        actions.setOpaque(false);

        RoundedButton check = new RoundedButton("Check", RoundedButton.Style.PRIMARY);
        check.setPreferredSize(new Dimension(150, 46));
        check.addActionListener(e -> onCheck());

        RoundedButton reset = new RoundedButton("Reset", RoundedButton.Style.SECONDARY);
        reset.setPreferredSize(new Dimension(130, 46));
        reset.addActionListener(e -> onReset());

        RoundedButton newNums = new RoundedButton("New Numbers", RoundedButton.Style.SECONDARY);
        newNums.setPreferredSize(new Dimension(170, 46));
        newNums.addActionListener(e -> regenerateProblems());

        actions.add(check);
        actions.add(reset);
        actions.add(newNums);

        RoundedPanel radios = new RoundedPanel(14, ModernTheme.SURFACE_ALT, ModernTheme.SURFACE_BORDER);
        radios.setLayout(new FlowLayout(FlowLayout.CENTER, 18, 0));
        radios.setBorder(new EmptyBorder(10, 18, 10, 18));

        multiButton = new ModernRadioButton("Multi");
        divButton = new ModernRadioButton("Div");
        multiButton.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(multiButton);
        group.add(divButton);
        multiButton.addActionListener(e -> onOperatorChanged());
        divButton.addActionListener(e -> onOperatorChanged());

        radios.add(multiButton);
        radios.add(divButton);

        summaryLabel.setForeground(ModernTheme.TEXT_SECONDARY);
        summaryLabel.setFont(ModernTheme.FONT_PROBLEM);
        summaryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        summaryLabel.setPreferredSize(new Dimension(240, 46));

        footer.add(actions, BorderLayout.WEST);
        footer.add(radios, BorderLayout.CENTER);
        footer.add(summaryLabel, BorderLayout.EAST);
        return footer;
    }

    private void onCheck() {
        int okCount = 0;
        for (ProblemRow row : problems) {
            String text = row.getTextField().getText().trim();
            boolean ok;
            try {
                int answer = Integer.parseInt(text);
                int expected = (operator == ProblemRow.MULTI)
                        ? row.getNum1() * row.getNum2()
                        : row.getNum1() / row.getNum2();
                ok = (answer == expected);
            } catch (NumberFormatException ex) {
                ok = false;
            }
            if (ok) {
                row.setResultOk();
                okCount++;
            } else {
                row.setResultNotOk();
            }
        }
        if (okCount == TOTAL) {
            summaryLabel.setForeground(ModernTheme.SUCCESS_LIGHT);
            summaryLabel.setText("All correct — " + okCount + " / " + TOTAL);
        } else {
            summaryLabel.setForeground(ModernTheme.ERROR_LIGHT);
            summaryLabel.setText(okCount + " / " + TOTAL + " correct");
        }
    }

    private void onReset() {
        for (ProblemRow row : problems) row.clearAnswer();
        summaryLabel.setText(" ");
    }

    private void onOperatorChanged() {
        regenerateProblems();
    }

    private void regenerateProblems() {
        operator = (divButton != null && divButton.isSelected()) ? ProblemRow.DIV : ProblemRow.MULTI;
        for (ProblemRow row : problems) {
            int a;
            int b;
            if (operator == ProblemRow.MULTI) {
                a = generator.nextFactor();
                b = generator.nextFactor();
            } else {
                int[] pair = generator.nextDivision();
                a = pair[0];
                b = pair[1];
            }
            row.setNumbers(a, b, operator);
            row.clearAnswer();
        }
        summaryLabel.setText(" ");
    }
}
