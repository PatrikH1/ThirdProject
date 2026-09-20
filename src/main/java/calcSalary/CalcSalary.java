package calcSalary;

import java.util.Scanner;

public class CalcSalary {
    public static void main(String[] args) {

        // Skapa ett Scanner-objekt för att läsa inmatning
        Scanner input = new Scanner(System.in);

        System.out.print("Vad du får in inklusive moms: ");
        int lon = input.nextInt();
        System.out.print("Vilken skattesats har du i procent: ");
        int skattesats = input.nextInt();

        double moms = lon * 0.2;
        double bruttolon = lon - moms;
        double arbetsgivaravgift = bruttolon * 0.3142;

        // Skriv ut skatt.
        System.out.println();
        System.out.println("Moms: " + String.format("%.2f", moms));
        System.out.println("Bruttolon: " + String.format("%.2f", bruttolon));
        String formateradArbetsgivaravgift = String.format("%.2f", arbetsgivaravgift);
        System.out.println("Arbetsgivaravgift: " + formateradArbetsgivaravgift);
        double skattSomBetalas = (bruttolon * ((double) skattesats / 100));

        // System.out.println("Skatt: " + skattSomBetalas);
        System.out.println("Skatt: " + String.format("%.2f", (bruttolon * ((double) skattesats / 100))));
        double utbetaldLon = (double) lon - moms - skattSomBetalas - arbetsgivaravgift;

        System.out.println();
        System.out.println("Utbetald lön: " + String.format("%.2f", utbetaldLon));
        System.out.println("Procentuell del som lön: " + String.format("%.2f", ((utbetaldLon / (double) lon)) * 100)
                + "%");

        // Stäng scanner-objektet
        input.close();
    }
}


