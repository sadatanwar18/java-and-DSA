package Java_arrays;

import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        int[] rollno = {3, 44, 23, 43, 323};

        System.out.println(Arrays.toString(rollno));
        change(rollno);
        System.out.println(Arrays.toString(rollno));;
    }

    static void change(int[] arr) {
        arr[1] = 33;
    }
}
