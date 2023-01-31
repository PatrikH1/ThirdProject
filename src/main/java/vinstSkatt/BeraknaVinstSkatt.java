package vinstSkatt;

public class BeraknaVinstSkatt {



    private int pris = 2150000;

    private int kapitaltillskott = 255590;
    private int inkopspris = 125000;

    public BeraknaVinstSkatt() {
    }

    public int getPris() {
        return pris;
    }

    public int getKapitaltillskott() {
        return kapitaltillskott;
    }

    public int getInkopspris() {
        return inkopspris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setKapitaltillskott(int kapitaltillskott) {
        this.kapitaltillskott = kapitaltillskott;
    }

    public void setInkopspris(int inkopspris) {
        this.inkopspris = inkopspris;
    }
}
