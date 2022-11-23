package be.vdab.jpfhfdst4;

import java.util.Scanner;

public class Invoer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal = scanner.nextInt();
        scanner.skip("\n");
        String tekst = scanner.nextLine();
        System.out.println(getal);
        System.out.println(tekst);
    }
}
