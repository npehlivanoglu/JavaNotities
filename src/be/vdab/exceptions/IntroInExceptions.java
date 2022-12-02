package be.vdab.exceptions;

public class IntroInExceptions {
    /*
    De base class voor deze exceptions is RuntimeException. Dat wil
    ook zeggen dat het catch statement in alle drie de gevallen vervangen kan worden door catch(RuntimeException ex)
    */

    //Unchecked exceptions or runtime exceptions
    public static void main(String[] args) {
        try {
            var result = 7 / 0;
            System.out.println("Deze code wordt alleen uitgevoerd" +
                    " wanneer er geen fout optreedt.");
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            var tekst = "abc";
            var tekstInGetalwaarde = Integer.parseInt(tekst);
            var result = tekstInGetalwaarde / 4;
            System.out.println(result);
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            var cijfers = new int[]{ 12, 5, 28, 37};
            System.out.println("Het 7e element is: " + cijfers[6]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println(ex.getMessage());
        }

        //Finally-Blok
/*
        Dit finally-blok wordt vaak gebruikt voor het sluiten van resources, bijv. sluiten van bestanden, sluiten
        van de databaseconnectie, enz.
                Het finally-blok kan ook een return-statement bevatten.*/

        try {
            var cijfers = new int[]{ 12, 5, 28, 37};
            System.out.println("Het 7e element is: " + cijfers[6]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Dit is een poging voor het tonen van de"
                    + " waarde van een element.");
        }

        var tekst = "2";
        //var tekst = "6";
        //var tekst = "abc";
        try {
            var cijfers = new int[] { 12, 5, 28, 37};
            System.out.println("Element uit de array: " +
                    cijfers[Integer.parseInt(tekst)]);

            System.out.println("Deze code wordt alleen uitgevoerd" +
                    " wanneer er geen fout optreedt.");
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: " +
                    ex.getMessage());
        }
        catch(NumberFormatException ex) {
            System.out.println("NumberFormatException: " + ex.getMessage());
        }
        catch(RuntimeException ex) {
            System.out.println("RuntimeException: " + ex.getMessage());
        }

    }
}
