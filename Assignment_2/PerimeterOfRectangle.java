package Assignment_2;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of rectangle: ");
        int length = input.nextInt();

        System.out.println("enter breadth of rectangle ");
        int breadth = input.nextInt();

        double perimeter = 2 * (length + breadth);
        System.out.println("peimeter of rectangle: " + perimeter);
    }
}
