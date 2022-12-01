package be.vdab.JPFhfdstk12;

public class Werknemer implements Kost {
    String naam;
    double wedde;

    public String getNaam() {
        return naam;
    }

    public double getWedde() {
        return wedde;
    }

    public Werknemer(String naam, double wedde) {
        this.naam = naam;
        this.wedde = wedde;
    }

    @Override
    public double bedragKost() {
        return wedde;
    }

    @Override
    public boolean personeelsKost() {
        return true;
    }

    @Override
    public String toString(){
        return naam + ";" + wedde;
    }
}
