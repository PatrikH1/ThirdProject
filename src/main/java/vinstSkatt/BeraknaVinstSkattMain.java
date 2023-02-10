package vinstSkatt;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class BeraknaVinstSkattMain {

    public static void main(String[] args) {

        BeraknaVinstSkatt beraknaVinstSkatt = new BeraknaVinstSkatt();

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Kapitaltillskott (255 590): ");
        String line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setKapitaltillskott(Integer.valueOf(line));
        }

        System.out.print("Inköpspris (125 000): ");
        line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setInkopspris(Integer.valueOf(line));
        }

        System.out.print("Mäklararvode (40 000): ");
        line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setMaklararvode(Integer.valueOf(line));
        }

        System.out.print("Balkonger (60 000): ");
        line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setBalkonger(Integer.valueOf(line));
        }

        System.out.print("Annons på Hemnet (2 990): ");
        line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setAnnonsPaHemnet(Integer.valueOf(line));
        }

        System.out.print("Inköp persienner (5 400): ");
        line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setInkopPersienner(Integer.valueOf(line));
        }

        System.out.print("Överelåtelseavgift (1 208): ");
        line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setOverlotelseAvgift(Integer.valueOf(line));
        }

        System.out.print("Reparationsfond (80): ");
        line = scanner.nextLine();
        if (line.matches("\\d+")) {
            beraknaVinstSkatt.setReparationsfond(Integer.valueOf(line));
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("------- Inmatning av värden: ");

        System.out.println("Kapitaltillskott: " + beraknaVinstSkatt.getKapitaltillskott());
        System.out.println("Inköpspris: " + beraknaVinstSkatt.getInkopspris());
        System.out.println("Mäklararvode: " + beraknaVinstSkatt.getMaklararvode());
        System.out.println("Balkonger: " + beraknaVinstSkatt.getBalkonger());
        System.out.println("Annons på Hemnet: " + beraknaVinstSkatt.getAnnonsPaHemnet());
        System.out.println("Inköp persienner: " + beraknaVinstSkatt.getInkopPersienner());
        System.out.println("Överåtelseavgift: " + beraknaVinstSkatt.getOverlotelseAvgift());
        System.out.println("Reparationsfond: " + beraknaVinstSkatt.getReparationsfond());

        // För att använda space mellan tusental.
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(' ');
        DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("------- Vinst efter avdrag, priset är " + beraknaVinstSkatt.getPris() + " :");
        System.out.println(formatter.format((beraknaVinstSkatt.vinstEfterAvdrag())));

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("------- Vinstskatt, 22 % på vinsten efter avdrag: ");
        System.out.println(formatter.format(beraknaVinstSkatt.vinstSkatt()));
        System.out.println(formatter.format(beraknaVinstSkatt.vinstSkatt() / 2) + " (Halv vinstskatt)");

        System.out.println();

        scanner.close();
    }

}