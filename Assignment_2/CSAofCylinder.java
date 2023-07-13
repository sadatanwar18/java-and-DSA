package Assignment_2;

import java.util.Scanner;

public class CSAofCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius: ");
        int radius = input.nextInt();
        System.out.println("enter height: ");
        int height = input.nextInt();
        double pi = 3.14;
        double csa = 2 * (pi * radius * height);
        System.out.println("csa of cylinder: " + csa);
    }
}
