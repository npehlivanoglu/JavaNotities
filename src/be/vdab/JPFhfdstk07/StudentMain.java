package be.vdab.JPFhfdstk07;

public class StudentMain {
    public static void main(String[] args) {
        var studentA = new Student("Ahmet Saydam");
        var studentB = new Student("Nihat Pehlivanoglu",88);
        System.out.println(studentA.getNaam());
        System.out.println(studentA.getScore());
        System.out.println(studentB.getNaam());
        System.out.println(studentB.getScore());
        System.out.println(studentA.getScore());
        studentA.setScore(50);
        System.out.println(studentA.getScore());
        System.out.println(studentB.getScore());

    }
}
