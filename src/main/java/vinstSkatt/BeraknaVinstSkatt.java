package vinstSkatt;

import java.util.Scanner;

public class BeraknaVinstSkatt {

    public static void main(String[] args) {

        int kapitaltillskott = 0;
        int inkopspris = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kapitaltillskott: ");
        kapitaltillskott = scanner.nextInt();

        System.out.print("Inköpspris: ");
        inkopspris = scanner.nextInt();

        System.out.println("Kapitaltillskott: " + kapitaltillskott);
        System.out.println("Inköpspris: " + inkopspris);

        scanner.close();
    }

}
