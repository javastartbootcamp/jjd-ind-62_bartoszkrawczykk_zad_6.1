package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i >= 0; i++) {
            System.out.println("Podaj liczbę");
            int tmp = sc.nextInt();

            if (tmp < 100 || tmp > 200) {
                System.out.println("Podana liczba jest za mała");
            } else if (tmp % 3 == 0) {
                System.out.println("Twoja liczba jest ok");
                break;
            } else {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        }
    }
}
