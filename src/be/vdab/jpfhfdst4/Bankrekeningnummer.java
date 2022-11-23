package be.vdab.jpfhfdst4;

public class Bankrekeningnummer {
    public static void main(String[] args) {
        var bankrekeningNummer = 777553241844L;
        var eerste10Nummers = bankrekeningNummer / 100;
        var rest = eerste10Nummers % 97 ;
        var laatste2Nummers = bankrekeningNummer % 100;
        System.out.println(rest == laatste2Nummers);
    }
}
