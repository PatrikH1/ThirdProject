package modernCalc;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import java.util.HashSet;

public final class ModernTheme {
    private ModernTheme() {}

    public static final Color BG_TOP = new Color(0x0F172A);
    public static final Color BG_BOTTOM = new Color(0x1E1B4B);

    public static final Color SURFACE = new Color(0x1E293B);
    public static final Color SURFACE_ALT = new Color(0x111827);
    public static final Color SURFACE_BORDER = new Color(0x334155);

    public static final Color INPUT_BG = new Color(0x0B1220);
    public static final Color INPUT_BORDER = new Color(0x334155);

    public static final Color TEXT_PRIMARY = new Color(0xF1F5F9);
    public static final Color TEXT_SECONDARY = new Color(0x94A3B8);
    public static final Color TEXT_MUTED = new Color(0x64748B);

    public static final Color ACCENT = new Color(0x8B5CF6);
    public static final Color ACCENT_HOVER = new Color(0xA78BFA);
    public static final Color ACCENT_GRADIENT_START = new Color(0x6366F1);
    public static final Color ACCENT_GRADIENT_END = new Color(0xA855F7);

    public static final Color SUCCESS = new Color(0x10B981);
    public static final Color SUCCESS_LIGHT = new Color(0x34D399);
    public static final Color ERROR = new Color(0xEF4444);
    public static final Color ERROR_LIGHT = new Color(0xF87171);

    private static final String FONT_FAMILY = pickFontFamily();

    private static String pickFontFamily() {
        String[] preferred = { "Segoe UI", "Inter", "SF Pro Text", "Roboto", "Helvetica Neue", "Arial" };
        String[] available = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        HashSet<String> set = new HashSet<>(Arrays.asList(available));
        for (String f : preferred) {
            if (set.contains(f)) return f;
        }
        return Font.SANS_SERIF;
    }

    public static final Font FONT_TITLE     = new Font(FONT_FAMILY, Font.BOLD,  26);
    public static final Font FONT_SUBTITLE  = new Font(FONT_FAMILY, Font.PLAIN, 13);
    public static final Font FONT_TIMER     = new Font(FONT_FAMILY, Font.BOLD,  34);
    public static final Font FONT_PROBLEM   = new Font(FONT_FAMILY, Font.BOLD,  15);
    public static final Font FONT_INPUT     = new Font(FONT_FAMILY, Font.BOLD,  14);
    public static final Font FONT_RESULT    = new Font(FONT_FAMILY, Font.BOLD,  13);
    public static final Font FONT_BUTTON    = new Font(FONT_FAMILY, Font.BOLD,  13);
    public static final Font FONT_LABEL     = new Font(FONT_FAMILY, Font.PLAIN, 13);
    public static final Font FONT_RADIO     = new Font(FONT_FAMILY, Font.BOLD,  13);
}
