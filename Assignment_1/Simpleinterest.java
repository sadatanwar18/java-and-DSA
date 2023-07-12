package Assignment_1;

import java.util.Scanner;

public class Simpleinterest {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter principal amount");
            int principal = input.nextInt();
            System.out.println("enter rate in percentage");
            int rate = input.nextInt();
            System.out.println("enter time in years");
            int time = input.nextInt();

            int simpleinterst = (principal * rate * time / 100);
            System.out.println("your simple interst :" + simpleinterst);


        }


}
