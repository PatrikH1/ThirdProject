package vinstSkatt;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class BeraknaVinstSkattMain {

    public static void main(String[] args) {

        BeraknaVinstSkatt beraknaVinstSkatt = new BeraknaVinstSkatt();

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        // Förstår ej varför, men behövs för att kunna skriva ut åäö.
        String input = "Kapitaltillskott (130 735): ";
        Integer value = inputInformation(input);
        if (value != null) {
            beraknaVinstSkatt.setKapitaltillskott(value);
        }

        value = inputInformation("Inköpspris (125 000): ");
        if (value != null) {
            beraknaVinstSkatt.setInkopspris(value);
        }

        value = inputInformation("Mäklararvode (40 000): ");
        if (value != null) {
            beraknaVinstSkatt.setMaklararvode(value);
        }

        value = inputInformation("Balkonger (60 000): ");
        if (value != null) {
            beraknaVinstSkatt.setBalkonger(value);
        }

        value = inputInformation("Annons på Hemnet (2 990): ");
        if (value != null) {
            beraknaVinstSkatt.setAnnonsPaHemnet(value);
        }

        value = inputInformation("Inköp persienner (5 400): ");
        if (value != null) {
            beraknaVinstSkatt.setInkopPersienner(value);
        }

        value = inputInformation("Överelåtelseavgift (1 208): ");
        if (value != null) {
            beraknaVinstSkatt.setOverlotelseAvgift(value);
        }

        value = inputInformation("Reparationsfond (80): ");
        if (value != null) {
            beraknaVinstSkatt.setReparationsfond(value);
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("------- Inmatning av alla värden: ");

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

    private static Integer inputInformation(String infoString) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(infoString);
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.matches("\\d+")) {
                return Integer.valueOf(line);
            }
            else {
                return null;
            }
        }
        return null;
    }

}
