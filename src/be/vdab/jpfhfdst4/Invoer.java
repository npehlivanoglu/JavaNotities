package be.vdab.jpfhfdst4;

import java.util.Scanner;

public class Invoer {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var getal = scanner.nextInt();
        scanner.skip("\n");
        var tekst = scanner.nextLine();
        System.out.println(getal);
        System.out.println(tekst);
    }
}
