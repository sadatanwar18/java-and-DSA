package Assignment_1;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int number1 = input.nextInt();

        System.out.println("enter second number");
        int number2 = input.nextInt();

        int largestnumber = Math.max(number1,number2);
        System.out.println("the largest number is " + largestnumber);
    }
}
