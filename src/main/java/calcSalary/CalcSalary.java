package calcSalary;

import java.util.Scanner;

public class CalcSalary {
    public static void main(String[] args) {

        // Skapa ett Scanner-objekt för att läsa inmatning
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.print("Vad vill du ha i bruttolön: ");
        int bruttolon = input.nextInt();
        System.out.print("Vilken skattesats har du i procent: ");
        double skattesats = input.nextDouble();

        double arbetsgivaravgift = bruttolon * 0.3142;
        double moms = (arbetsgivaravgift + bruttolon) * 0.25;

        System.out.println();
        System.out.println("Moms: " + String.format("%.2f", moms));
//
        System.out.println("Bruttolon: " + String.format("%.2f", (double) bruttolon));
        String formateradArbetsgivaravgift = String.format("%.2f", arbetsgivaravgift);
        System.out.println("Arbetsgivaravgift: " + formateradArbetsgivaravgift);
        double skattSomBetalas = (bruttolon * (skattesats / 100));

        System.out.println("Skatt: " + skattSomBetalas);

        double nettolon = bruttolon - skattSomBetalas;

        System.out.println();
        System.out.println("nettolon: " + String.format("%.2f", nettolon));


        System.out.println("Procentuell del som lön: " + String.format("%.2f", ((nettolon /
                (bruttolon + arbetsgivaravgift + moms))) * 100) + "%");
        System.out.println("Procentuell del som lön (utan moms): " + String.format("%.2f", ((nettolon /
                (bruttolon + arbetsgivaravgift))) * 100) + "%");

        System.out.println();

        System.out.println("Bruttolon och arbetsgivaravgift: " + String.format("%.2f", bruttolon + arbetsgivaravgift));
        System.out.println("Bruttolon, arbetsgivaravgift och moms: " + String.format("%.2f",
                bruttolon + arbetsgivaravgift + moms));

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();

        // Stäng scanner-objektet
        input.close();
    }
}


