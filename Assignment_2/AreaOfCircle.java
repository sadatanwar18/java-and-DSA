package Assignment_2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius of circle");
        int radius = input.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("area of circle" + area);


    }
}
