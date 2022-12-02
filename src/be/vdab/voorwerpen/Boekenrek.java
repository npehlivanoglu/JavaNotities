package be.vdab.voorwerpen;

import be.vdab.util.Voorwerpen;

public class Boekenrek implements Voorwerpen {
    private int hoogte;
    private int breedte;
    private float aankoopPrijs;

    public Boekenrek( int hoogte, int breedte, float aankoopPrijs) {
        this.hoogte = hoogte;
        this.breedte = breedte;
        this.aankoopPrijs = aankoopPrijs;
    }

    public Boekenrek(){
        this(20,8,40);
    }

    @Override
    public void gegevensTonen() {
        System.out.println("Eigenaar: " + Voorwerpen.EIGENAAR);
        System.out.println("Hoogte: " + hoogte);
        System.out.println("Breedte: " + breedte);
        System.out.println("AankoopPrijs: " + aankoopPrijs);
        System.out.println("Winst: " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return aankoopPrijs * 2.0f;
    }
}
