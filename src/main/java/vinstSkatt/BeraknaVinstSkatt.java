package vinstSkatt;

import java.util.Scanner;

public class BeraknaVinstSkatt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kapitaltillskott: ");
        int kapitaltillskott = scanner.nextInt();

        System.out.print("Inköpspris: ");
        int inkopspris = scanner.nextInt();

        System.out.println("Kapitaltillskott: " + kapitaltillskott);
        System.out.println("Inköpspris: " + inkopspris);

        scanner.close();
    }

}
