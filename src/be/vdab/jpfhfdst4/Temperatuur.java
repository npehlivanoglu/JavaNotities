package be.vdab.jpfhfdst4;

public class Temperatuur {
    public static void main(String[] args) {
        float tempCelsius = 37.0F;
        float tempFahr = tempCelsius * 9 / 5 + 32;

        System.out.println("Temperatuur in graden Celcius: " + tempCelsius);
        System.out.println("Temperatuur in graden Fahrenheit: " + tempFahr);
    }
}
