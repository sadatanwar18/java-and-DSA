package Assignment_2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter base of triangle");
        int base = input.nextInt();
        System.out.println("enter height of triangle");
        int height = input.nextInt();

        double area = (base * height) / 2;
        System.out.println("area of triangle " + area);
    }
}
