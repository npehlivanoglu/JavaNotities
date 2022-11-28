package be.vdab.jpfhfdstk5;

public class ArrayVanVijfIntegers {
    public static void main(String[] args) {
        /*
        *@arrays
        *Deze class kan korter zijn met while statement maar het is niet doeling van deze class.
        *Ik wilde gebruiken van arrays laten tonen.
        */
        var arrayIntegers = new int[5];
        arrayIntegers[0] = (int) (Math.random() * 100);
        arrayIntegers[1] = (int) (Math.random() * 100);
        arrayIntegers[2] = (int) (Math.random() * 100);
        arrayIntegers[3] = (int) (Math.random() * 100);
        arrayIntegers[4] = (int) (Math.random() * 100);
        System.out.println(arrayIntegers[0]);
        System.out.println(arrayIntegers[1]);
        System.out.println(arrayIntegers[2]);
        System.out.println(arrayIntegers[3]);
        System.out.println(arrayIntegers[4]);
        System.out.println("Gemiddelde: "
                + (arrayIntegers[0] + arrayIntegers[1] + arrayIntegers[2] + arrayIntegers[3] + arrayIntegers[4])
                / arrayIntegers.length);


    }


}
