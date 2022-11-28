package be.vdab.JPFhfdstk09;

public class Vrachtwagen extends Voertuig {
    private float maxLading;

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        this(polishouder, kostprijs, pk, gemVerbruik, nummerplaat, 10_000);
    }

    public float getMaxLading() {
        return maxLading;
    }

    public void setMaxLading(float maxLading) {
        if (maxLading > 0) {
            this.maxLading = maxLading;
        }else{
            this.maxLading = 10_000;
        }

    }

    @Override
    public String toString() {
        return super.toString() + "; " + maxLading;
    }

    @Override
    public void toon() {
        super.toon();
        System.out.println("Max Lading: " + maxLading);
    }

    @Override
    public double getKyotoScore(){
        return getGemVerbruik() * getPk() / (maxLading / 1000 );
    }


}
