import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
      //  Scanner input = new Scanner (System.in);
//        int num = (int)(99.32f);
//        System.out.println(num);
//
//        // automatic type promotion in expressions
//        int a = 276;
//        byte b = (byte)(a); // 276 % 256
//        System.out.println(b);

        byte b = 44;
        char c = 'A';
        short s = 212;
        int i = 3131;
        float f = 5.3324f;
        double d = 0.313;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * c) ); // here " " is added cause it will add string to the output and the output will give seprate answer

        System.out.println(result);



    }
}
