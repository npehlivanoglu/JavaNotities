package be.vdab.jpfhfdstk5;

import java.util.Scanner;

public class NieuwEnOudSwitchCase {
    public static void main(String[] args) {
        //nieuw
        var scanner = new Scanner(System.in);
        var dag = scanner.next();
        boolean isWeekend = switch (dag) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag" -> false;
            case "zaterdag", "zondag" -> true;
            default -> throw new IllegalArgumentException(dag + " bestaat niet");
        };
        System.out.println(isWeekend ? dag + " is weekend" : dag + " is een werkdag");
    }

     /*
        //oud

        boolean isWeekend;
        var scanner = new Scanner(System.in); (1)
        var dag = scanner.next(); (2)
        switch (dag) {
            case "maandag":
            case "dinsdag":
            case "woensdag":
            case "donderdag":
            case "vrijdag":
                isWeekend = false;
                break;
            case "zaterdag":
            case "zondag":
                isWeekend = true;
                break;
            default:
                throw new IllegalArgumentException(dag + " bestaat niet");
        }
        System.out.println(isWeekend ? dag + " is weekend" : dag (3)
                + " is een werkdag");

         */
    }




