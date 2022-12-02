package be.vdab;

import be.vdab.util.Voorwerpen;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class HoofdProgrammaBoeken {
    public static void main(String[] args) {
        var boeken = new Voorwerpen[6];
        boeken[0] = new Leesboek();
        boeken[1] = new Leesboek("Goc", "Az", "Hakan Günday", 30, "Dram");
        boeken[2] = new Woordenboek();
        boeken[3] = new Woordenboek("WoordenBoek NL TO ENG", "Stefan Jacco", 50, "Taalboek", "Nederlands-Engels");
        boeken[4] = new Boekenrek();
        boeken[5] = new Boekenrek(10, 20, 50);

        float som = 0;
        for (var boek : boeken) {
            boek.gegevensTonen();
            System.out.println("-------------------------------------------------------");
            som += boek.winstBerekenen();
        }
        System.out.println("Totaal winstMarge: " + som);




    }
}
