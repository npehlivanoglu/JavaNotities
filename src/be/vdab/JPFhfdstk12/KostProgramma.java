package be.vdab.JPFhfdstk12;

public class KostProgramma {
    public static void main(String[] args) {
        var eddy = new Werknemer("Eddy",2000.0);
        var elly = new Werknemer("Elly",2500.0);
        var daf = new Vrachtwagen("DAF",0.35,25000,150000.0,8);
        var konica = new Kopieermachine("Konica",0.02,9000);

        var personeelKosten = 0.0;
        var andereKosten = 0.0;

        //kosten van Eddy,Elly,DAF,Konica tellen

        if (eddy.personeelsKost()){
            personeelKosten += eddy.bedragKost();
        }else {
            andereKosten += eddy.bedragKost();
        }

        if (elly.personeelsKost()){
            personeelKosten += elly.bedragKost();
        }else {
            andereKosten += elly.bedragKost();
        }

        if (daf.personeelsKost()){
            personeelKosten += daf.bedragKost();
        }else {
            andereKosten += daf.bedragKost();
        }

        if (konica.personeelsKost()){
            personeelKosten += konica.bedragKost();
        }else {
            andereKosten += konica.bedragKost();
        }

        System.out.println("Personeelkosten: "+personeelKosten);
        System.out.println("Andere kosten: "+andereKosten);


    }

}
