package be.vdab.JPFhfdstk09;

import be.vdab.JPFhfdstk12.taken.Milieu;
import be.vdab.JPFhfdstk12.taken.Privaat;
import be.vdab.JPFhfdstk12.taken.Stookketel;
import be.vdab.JPFhfdstk12.taken.Vervuiler;

public class TestProgramma {
    public static void main(String[] args) {
        var vrachtwagen1 = new Vrachtwagen("Nihat Pehlivanoglu",3000,3000,6,"B 203 203",12000);
        System.out.println(vrachtwagen1);
        vrachtwagen1.toon();
        System.out.println(vrachtwagen1.getKyotoScore());

        var wagenen = new Voertuig [4];

        wagenen[0] = new Vrachtwagen("Nihat Pehlivanoglu",3000,3000,6,"B 203 203",12000);
        wagenen[1] = new Vrachtwagen("Ahmet Saydam",3200,6000,9,"B 232 423",5000);
        wagenen[2] = new PersonenWagen("Fırat Yasar",5000,3000,5,"B 233 243",4,6);
        wagenen[3] = new PersonenWagen("Necati Lüleci",2000,4000,6,"B 234 212",2,-1);

        for(var wagen : wagenen){
            System.out.println(wagen);
            wagen.toon();
        }

        var objecten = new Vervuiler[3];
        objecten[0] = new Vrachtwagen("Nihat Pehlivanoglu",3000,3000,6,"B 203 203",12000);
        objecten[1] = new PersonenWagen("Necati Lüleci",2000,4000,6,"B 234 212",2,-1);
        objecten[2] = new Stookketel(15);
        for(var object : objecten){
            System.out.println("Vervuiling : "+object.berekenVervuiling());

        }

        var privaatGegevens = new Privaat[4];
        privaatGegevens[0] = new Vrachtwagen("Nihat Pehlivanoglu",3000,3000,6,"B 203 203",12000);
        privaatGegevens[1] = new Vrachtwagen("Ahmet Saydam",3200,6000,9,"B 232 423",5000);
        privaatGegevens[2] = new PersonenWagen("Fırat Yasar",5000,3000,5,"B 233 243",4,6);
        privaatGegevens[3] = new PersonenWagen("Necati Lüleci",2000,4000,6,"B 234 212",2,-1);

        for(var privateGegeven : privaatGegevens){
            privateGegeven.geefPrivateData();
        }

        var milieuGegevens = new Milieu[4];
        milieuGegevens[0] = new Vrachtwagen("Nihat Pehlivanoglu",3000,3000,6,"B 203 203",12000);
        milieuGegevens[1] = new Vrachtwagen("Ahmet Saydam",3200,6000,9,"B 232 423",5000);
        milieuGegevens[2] = new PersonenWagen("Fırat Yasar",5000,3000,5,"B 233 243",4,6);
        milieuGegevens[3] = new PersonenWagen("Necati Lüleci",2000,4000,6,"B 234 212",2,-1);

        for (var milieuGegeven : milieuGegevens){
            milieuGegeven.geefMilieuData();
        }

    }
}
