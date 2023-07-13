package Java_methods;

import java.util.Arrays;

public class Varargs {
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {
        fun(2,3,42,1,43,5,34);
    }
}
