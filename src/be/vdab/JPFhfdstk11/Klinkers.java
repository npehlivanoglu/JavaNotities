package be.vdab.JPFhfdstk11;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type een zin aub");
        var zin = scanner.nextLine().toLowerCase();
        char[] klinkers = new char[5];
        klinkers[0] = 'a';
        klinkers[1] = 'e';
        klinkers[2] = 'i';
        klinkers[3] = 'u';
        klinkers[4] = 'o';
        int aantalKlinkers = 0;
        for (int i = 0; i < zin.length(); i++) {
            for (int j = 0; j < klinkers.length - 1; j++) {
                if (zin.charAt(i) == klinkers[j]) {
                    aantalKlinkers++;
                }
            }
        }
        System.out.println("Aantal of klinkers = "+aantalKlinkers);
    }
}
