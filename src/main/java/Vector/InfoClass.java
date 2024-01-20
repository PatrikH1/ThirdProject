package Vector;

import java.util.Objects;

class InfoClass {
    private String textStr;
    private int value;
    public InfoClass (String textStr, int value) {
        this.textStr = textStr;
        this.value = value;
    }
    public String getTextStr() {
        return textStr;
    }

    public int getValue() {
        return value;
    }

    public boolean equalsDuplicateCheck(InfoClass other) {
        if (this == other) {
            return true;
        } else if (other == null) {
            return false;
        } else {
            return Objects.equals(this.getTextStr(), other.getTextStr()) &&
                    Objects.equals(this.getValue(), other.getValue());
        }
    }
}

