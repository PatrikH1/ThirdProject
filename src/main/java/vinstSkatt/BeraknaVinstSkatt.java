package vinstSkatt;

/*
 *Klass med alla uppgifter för att kunna räkna ut vinstskatt.
 */
public class BeraknaVinstSkatt {

    private int pris = 2150000;

    private int kapitaltillskott = 130735;
    private int inkopspris = 125000;
    private int maklararvode = 40000;
    private int balkonger = 60000;
    private int annonsPaHemnet = 2990;
    private int inkopPersienner = 5400;
    private int overlotelseAvgift = 1208;
    private int reparationsfond = 80;

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

    public int getMaklararvode() {
        return maklararvode;
    }

    public int getBalkonger() {
        return balkonger;
    }

    public int getAnnonsPaHemnet() {
        return annonsPaHemnet;
    }

    public int getInkopPersienner() {
        return inkopPersienner;
    }

    public int getOverlotelseAvgift() {
        return overlotelseAvgift;
    }

    public int getReparationsfond() {
        return reparationsfond;
    }

    public void setMaklararvode(int maklararvode) {
        this.maklararvode = maklararvode;
    }

    public void setBalkonger(int balkonger) {
        this.balkonger = balkonger;
    }

    public void setAnnonsPaHemnet(int annonsPaHemnet) {
        this.annonsPaHemnet = annonsPaHemnet;
    }

    public void setInkopPersienner(int inkopPersienner) {
        this.inkopPersienner = inkopPersienner;
    }

    public void setOverlotelseAvgift(int overlotelseAvgift) {
        this.overlotelseAvgift = overlotelseAvgift;
    }

    public void setReparationsfond(int reparationsfond) {
        this.reparationsfond = reparationsfond;
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

    public int vinstEfterAvdrag() {
        return pris
                - kapitaltillskott
                - inkopspris
                - maklararvode
                - balkonger
                - annonsPaHemnet
                - inkopPersienner
                - overlotelseAvgift
                - reparationsfond;
    }

    /*
      Vinstskatten är 22 %.
     */
    public double vinstSkatt() {
        return 0.22 * vinstEfterAvdrag() ;
    }


}
