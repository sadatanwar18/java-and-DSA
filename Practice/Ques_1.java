package Practice;

import java.util.Scanner;

public class Ques_1 {


    // striver sheet problem 1

    /*
    write a program that takes a character as input and prints 1, 0, 1 according to the following rule

    1, if character is uppercase alphabet
    0, if character is lower case alphabet

   -1, if character is not an alphabet
        */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       char a = input.next().charAt(0);
       int result = character(a);
        System.out.println(result);




    }

    static int character(char a) {
        if (Character.isUpperCase(a)){
            return 1;
        } else if (Character.isLowerCase(a)) {
            return 0;

        } else {
            return -1;
        }

    }

    }


