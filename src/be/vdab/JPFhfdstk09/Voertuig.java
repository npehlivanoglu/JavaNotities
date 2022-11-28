package be.vdab.JPFhfdstk09;

public abstract class  Voertuig {
    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;

    public Voertuig() {

    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        if(isStringNull(polishouder)){
            this.polishouder = polishouder;
        }

    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        if(kostprijs > 0){this.kostprijs = kostprijs;}

    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        if (pk > 0 ){
            this.pk = pk;
        }

    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0 ){this.gemVerbruik = gemVerbruik;}

    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        if(isStringNull(nummerplaat)){
            this.nummerplaat = nummerplaat;
        }

    }

    private boolean isStringNull(String waarde) {
        return waarde != null && !waarde.isEmpty();

    }

    @Override
    public String toString(){
        return polishouder+"; "+kostprijs+"; "+pk+"; "+gemVerbruik+"; "+nummerplaat;
    }

    public void toon(){
        System.out.println("Polishouder: "+polishouder);
        System.out.println("Kostprijs: "+kostprijs);
        System.out.println("PK: "+pk);
        System.out.println("Gemiddelde verbruik: "+gemVerbruik);
        System.out.println("Nummerplaat: "+nummerplaat);

    }

    public abstract double getKyotoScore();
}
