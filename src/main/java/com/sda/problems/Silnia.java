package com.sda.problems;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        long podajLiczbe;
        long silnia = 1;
        System.out.println("podaj liczbę do obliczenia silni");
        Scanner scanner = new Scanner(System.in);
        podajLiczbe = scanner.nextInt();

        for (int i = 1; i <= podajLiczbe; i++) {
            silnia = silnia * i;
        }

        System.out.println("silnia z " + podajLiczbe + " wynosi " + silnia);
    }
}
