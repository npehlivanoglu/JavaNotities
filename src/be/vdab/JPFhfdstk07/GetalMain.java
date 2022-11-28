package be.vdab.JPFhfdstk07;

public class GetalMain {
    public static void main(String[] args) {
        var getal = new Getal();
        getal.setX(5);
        getal.print();
        System.out.println(getal.absoluut());
        System.out.println(getal.som(45));
        getal.add(65);
        getal.print();
        System.out.println(getal.som(5.5F));

    }
}
