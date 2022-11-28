package be.vdab.jpfhfdstk6;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];
        for (int i = 0; i < getallen.length; i++) {
            var randomGetal = (int) (Math.random() * 1000 + 1);
            getallen[i] = randomGetal;
        }
        for (var pos = 0; pos < getallen.length - 1; pos++) {
            for (var vgl = pos + 1; vgl < getallen.length; vgl++) {
                if (getallen[pos] > getallen[vgl]) {
                    var tempGetal = getallen[pos];
                    getallen[pos] = getallen[vgl];
                    getallen[vgl] = tempGetal;
                }
            }
        }
        for (int j : getallen) {
            System.out.print(j + "\t");
        }
    }
}
/*
In plaats van de sorteerroutine zelf te schrijven, kan je gebruik maken van een bestaande method om
een tabel te sorteren:
Voeg als eerste regel bovenaan volgende regel code toe:
import java.util.Arrays;
De zelfgeschreven sorteerroutine in de code vervang je door:
Arrays.sort(getallen);
Nu maak je handig gebruik van een bestaande sorteermethod om de tabel te sorteren, nl. de method
sort() van de class Arrays. De tabel wordt helemaal gesorteerd
 */


