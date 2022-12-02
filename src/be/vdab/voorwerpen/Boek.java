package be.vdab.voorwerpen;

import be.vdab.util.Voorwerpen;

public class Boek implements Voorwerpen {
    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;

    public Boek(String titel, String auteur, float aankoopPrijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
    }

    public Boek() {
        this("AZ", "Hakan Günday",  20, "Drama");
    }

    @Override
    public void gegevensTonen() {
        System.out.println("Titel: " + titel);
        System.out.println("Auteur: " + auteur);
        System.out.println("Eigenaar: " + Voorwerpen.EIGENAAR);
        System.out.println("AankoopPrijs: " + aankoopPrijs);
        System.out.println("Genre: " + genre);
    }

    @Override
    public float winstBerekenen() {
        return aankoopPrijs * 1.5F;
    }

    public String getTitel() {
        return titel;
    }

    public final void setTitel(String titel) {
        if (titel != null) {
            this.titel = titel;
        }

    }

    public String getAuteur() {
        return auteur;
    }

    public final void setAuteur(String auteur) {
        if (auteur != null){
            this.auteur = auteur;
        }

    }


    public float getAankoopPrijs() {
        return aankoopPrijs;
    }

    public final void setAankoopPrijs(float aankoopPrijs) {
        if (aankoopPrijs >=0){this.aankoopPrijs = aankoopPrijs;}
    }

    public String getGenre() {
        return genre;
    }

    public final void setGenre(String genre) {
        if (genre !=null){this.genre = genre;}
    }

    @Override
    public String toString() {
        return titel + ";" + auteur + ";" + Voorwerpen.EIGENAAR + ";" + aankoopPrijs + ";" + genre;
    }

}
