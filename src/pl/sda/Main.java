package pl.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj kwotę do wypłaty: ");
        Scanner scanner = new Scanner(System.in);
        int kwota = scanner.nextInt();

        if (kwota % 10 != 0) {
            System.out.println("Błędna kwota!!!");
            return;
        }
        int[] banknoty = {500, 200, 100, 50, 10};


        for (int i = 0; i < banknoty.length; i++) {
            int ileBanknotow = kwota / banknoty[i];
            kwota = kwota - ileBanknotow * banknoty[i];
            System.out.println("wydaje: " +ileBanknotow+ " o nominale " + banknoty[i]);
            if (kwota == 0) {
                break;
            }


        }
    }
}
