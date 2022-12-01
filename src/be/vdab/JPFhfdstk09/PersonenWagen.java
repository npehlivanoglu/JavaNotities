package be.vdab.JPFhfdstk09;

import be.vdab.JPFhfdstk12.taken.Vervuiler;

public class PersonenWagen extends Voertuig implements Vervuiler {
    private int aantalDeuren;
    private int aantalPassagiers;

    public PersonenWagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);

    }

    public PersonenWagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        this(polishouder, kostprijs, pk, gemVerbruik, nummerplaat, 4, 5);

    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0) {
            this.aantalDeuren = aantalDeuren;
        }else{
            this.aantalDeuren = 4;
        }

    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0) {
            this.aantalPassagiers = aantalPassagiers;
        }else{
            this.aantalPassagiers = 5;
        }

    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / aantalPassagiers;
    }

    @Override
    public String toString() {
        return super.toString() + aantalDeuren + aantalPassagiers;
    }

    @Override
    public void toon() {
        super.toon();
        System.out.println("Aantal deuren: " + aantalDeuren);
        System.out.println("Aantal passagiers: " + aantalPassagiers);
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5;
    }

    @Override
    public void geefMilieuData() {
        System.out.println(getPk()+" "+getKostprijs()+" "+getGemVerbruik());
    }

    @Override
    public void geefPrivateData() {
        System.out.println(getPolishouder()+" "+getNummerplaat());
    }
}
