package Java_methods;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isprime(n));
    }

    static boolean isprime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while( c * c <= n) {
            if (n % 2 == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n){
            return true;
        }
        return false;
    }
}
