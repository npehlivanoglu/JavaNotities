package be.vdab.JPFhfdstk07;

public class Main {
    public static void main(String[] args) {
        double standSpaarrekening;
        var spaar1 = new Spaarrekening("BE12 3456 7890 1234",1.5);
        var spaar2 = new Spaarrekening("BE98 7654 3210 9876",1.5);


        spaar1.storten(100.0);
        standSpaarrekening = spaar1.getSaldo();
        System.out.println("Saldo van spaarrekening 1: "+standSpaarrekening);
        System.out.println("Saldo van spaarrekening 2: "+spaar2.getSaldo());
        spaar1.overschrijven(spaar2,50.0);
        System.out.println("Rekeningnummer van spaarrekening 2: "+spaar2.getRekeningNummer());
        spaar2.afhalen(5.0);
        System.out.println("Saldo van spaarrekening 2: "+spaar2.getSaldo());


    }
}
