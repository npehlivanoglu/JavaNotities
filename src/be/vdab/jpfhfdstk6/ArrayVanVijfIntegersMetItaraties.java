package be.vdab.jpfhfdstk6;

public class ArrayVanVijfIntegersMetItaraties {
    public static void main(String[] args) {
        var arrayMetIntegers = new int[5];
        for (var i = 0; i < arrayMetIntegers.length; i++) {
            arrayMetIntegers[i] = (int) ((Math.random() * 100) + 1);
        }
        float som = 0F;
        for (var getal : arrayMetIntegers) {
            som += getal;
            System.out.println(getal);
        }
        System.out.println("Som: " + som);
        System.out.println("Gemiddelde: " + som / arrayMetIntegers.length);
    }

}
