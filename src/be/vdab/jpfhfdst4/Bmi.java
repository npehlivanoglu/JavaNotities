package be.vdab.jpfhfdst4;

public class Bmi {
    public static void main(String[] args) {
        float gewicht = 67.7F;
        float lengte = 1.73F;
        float bmi;
        bmi = gewicht / (lengte * lengte);
        System.out.println("De bodymassindex " + bmi);
    }
}
