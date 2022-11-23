package be.vdab.jpfhfdst4;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        var totaalSeconden = 5924 ;

        var uren = totaalSeconden / 3600;
        var rest = totaalSeconden % 3600;

        var minuten = rest / 60 ;
        var seconden = rest % 60 ;

        System.out.println("U: "+uren + " M: " + minuten + " S: "+seconden);

    }
}
