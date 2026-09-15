package calcSalary;

import java.util.Scanner;

public class CalcSalary {
    public static void main(String[] args) {
        // Skapa ett Scanner-objekt för att läsa inmatning
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in tre heltal:");

        // Läs in de tre heltalen
        System.out.print("Tal 1: ");
        int tal1 = input.nextInt();

        System.out.print("Tal 2: ");
        int tal2 = input.nextInt();

        System.out.print("Tal 3: ");
        int tal3 = input.nextInt();

        // Räkna ut summan
        int summa = tal1 + tal2 + tal3;

        // Skriv ut resultatet
        System.out.println("Summan av de tre talen är: " + summa);

        // Stäng scanner-objektet
        input.close();
    }
}


