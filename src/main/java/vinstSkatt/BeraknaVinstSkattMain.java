package vinstSkatt;

import java.util.Scanner;

public class BeraknaVinstSkattMain {

    public static void main(String[] args) {

        BeraknaVinstSkatt beraknaVinstSkatt = new BeraknaVinstSkatt();

        Scanner scanner = new Scanner(System.in);

        int testValue;

        System.out.print("Kapitaltillskott (255590): ");
        testValue = scanner.nextInt();
        if (testValue > -1) {
            beraknaVinstSkatt.setKapitaltillskott(testValue);
        }

        System.out.print("Inköpspris (125000): ");
        testValue = scanner.nextInt();
        if (testValue > -1) {
            beraknaVinstSkatt.setInkopspris(testValue);
        }

        System.out.println("Kapitaltillskott: " + beraknaVinstSkatt.getKapitaltillskott());
        System.out.println("Inköpspris: " + beraknaVinstSkatt.getInkopspris());

        scanner.close();
    }

}
