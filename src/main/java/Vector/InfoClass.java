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

    public static class IdentityForInfoClass {
        private String textStr;
        private int value;

        public IdentityForInfoClass(InfoClass info) {
            this.textStr = info.getTextStr();
            this.value = info.getValue();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IdentityForInfoClass that = (IdentityForInfoClass) o;
            return value == that.value && textStr.equals(that.textStr);
        }

        @Override
        public int hashCode() {
            return Objects.hash(textStr, value);
        }
    }
}

