package java_basics;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String weeks = input.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("sweet red fruit");
//            case "grapes" -> System.out.println("green small fruit");
//            default -> System.out.println("enter a valid fruit");
//        }
        int weeks = input.nextInt();
//        switch (weeks) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//

        switch (weeks) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");

            case 6, 7 -> System.out.println("weekends");
        }







    }
}
