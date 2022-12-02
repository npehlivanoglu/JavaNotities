package be.vdab.voorwerpen;

public class Woordenboek extends Boek {
    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;



    private String taal;
    private static final float WINSTMARGE = 1.75F;


    public Woordenboek(String titel, String auteur,  float aankoopPrijs, String genre, String taal) {
        super(titel, auteur,  aankoopPrijs, genre);
        setTaal(taal);
    }

    public Woordenboek() {
        this("Daha", "Hakan Günday",  40, "Woordenboek", "Nederlands - Engels");
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        if (taal != null){this.taal = taal;}

    }
    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Taal: " + taal);
    }

    @Override
    public float winstBerekenen() {
        return aankoopPrijs * WINSTMARGE;
    }

    @Override
    public String toString(){
        return super.toString() +";"+ taal;
    }
}
