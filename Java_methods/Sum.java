package Java_methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
//        sum();
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;

    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
