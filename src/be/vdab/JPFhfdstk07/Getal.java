package be.vdab.JPFhfdstk07;

public class Getal {
    public int x;
    public  void print(){
        System.out.println(x);
    }
    public int absoluut(){
        return Math.abs(x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int som(int a){
        return x+a;
    }
    public void add(int a){
        x += a;
    }
    public float som(float a){
        return x+a;
    }
    public double som(double a){
        return x+a;
    }
    public double toDouble(){
        return (double) x;
    }
}
