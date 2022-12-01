package be.vdab.JPFhfdstk12;

public class Vrachtwagen implements Kost,Afschrijving{

    private final String merk;
    private final double kostPerkm;
    private final int aantalKm;
    private final double aanKoopPrijs;
    private final int voorzieneLevensduur;

    public String getMerk() {
        return merk;
    }

    public int getAantalKm() {
        return aantalKm;
    }

    public Vrachtwagen(String merk, double kostPerkm, int aantalKm, double aanKoopPrijs, int voorzieneLevensduur) {
        this.merk = merk;
        this.kostPerkm = kostPerkm;
        this.aantalKm = aantalKm;
        this.aanKoopPrijs = aanKoopPrijs;
        this.voorzieneLevensduur = voorzieneLevensduur;
    }

    @Override
    public int termijn() {
        return voorzieneLevensduur;
    }

    @Override
    public double jaarlijksBedrag() {
        return aanKoopPrijs/voorzieneLevensduur;
    }

    @Override
    public double bedragKost() {
        return aantalKm*kostPerkm;
    }

    @Override
    public boolean personeelsKost() {
        return false;
    }
}
