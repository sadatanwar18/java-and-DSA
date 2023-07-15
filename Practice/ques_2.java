package Practice;

import java.util.Scanner;

public class ques_2 {

    //  given a datatype prints its size

    /*
    Integer = 4 byte
    Long = 8 byte
    Float = 4 byte
    Double = 8byte
    Character = 1 byte


     */

    static int datatype(String type){
        if (type.equals("Integer")){
            return 4;
        } else if (type.equals("Long")) {
            return 8;
            
        } else if (type.equals("Float")) {
            return 4;

        } else if (type.equals("Double")) {
            return 8;

        } else if (type.equals("Character")) {
            return 1;

        }else{
            return -1;
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Enter = input.next();
        int result = datatype(Enter);
        System.out.println(result);
    }
}
