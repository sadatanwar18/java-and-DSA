package java_basics;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // find the largest number

        int max = a;

        if (b > a){
            max = b;
        }
        if (c > b){
            max = c;
        }


        System.out.println(" largest number is " + max);





    }
}
