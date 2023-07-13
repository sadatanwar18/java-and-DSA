package Java_methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println(isArmstrong(n));

        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }

    }

    static boolean isArmstrong(int n) {
        int origninal = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n/10;
        }
        if ( sum == origninal) {
            return true;
        }
        return false;
    }


}
