package be.vdab.voorwerpen;

public class Leesboek extends Boek {
    private String onderwerp;
    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;
    private static final float WINSTMARGE = 1.5F;



    public Leesboek(String onderwerp, String titel, String auteur, float aankoopPrijs, String genre) {
        super(titel, auteur,  aankoopPrijs, genre);
        setOnderwerp(onderwerp);
    }

    public Leesboek() {
        this("Gewoon drama", "Chess", "Stefan Zweig",  30, "Dram");
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        if (onderwerp != null){this.onderwerp = onderwerp;}

    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Onderwerp: " + onderwerp);
    }

    @Override
    public float winstBerekenen() {
        return aankoopPrijs * WINSTMARGE;
    }

    @Override
    public String toString(){
        return super.toString() +";"+onderwerp;
    }
}
