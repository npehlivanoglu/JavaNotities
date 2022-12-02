package be.vdab.exceptions;

public class TestExceptions {
    public static void main(String[] args) {
        var test = "yes";
        try {
            System.out.println("Start try");
            doRisky(test);
            System.out.println("end try");
        }catch (ScaryException ex){
            System.out.println("Scary exception");
        }finally {
            System.out.println("finalyy");
        }
        System.out.println("end of main");
    }

    static void doRisky(String test) throws ScaryException{
        System.out.println("Start risky");
        if("yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("end risky");
    }
}
