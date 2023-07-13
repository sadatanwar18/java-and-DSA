package Java_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayslist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        Scanner input = new Scanner(System.in);
//        list.add("sadat");
//        list.add("sadt");
//        list.add("saat");
//        list.add("sdat");
//        list.add("sadt");
//        list.add("sada");
//        list.add("sadt");
//        list.add("sadt");
//        System.out.println(list);
//        //System.out.println(list.contains("uwugw"))
//        list.set(0, "hi");
//        list.remove(0);
//        System.out.println(list);

        for (int i = 0; i < 5;  i++){
            list.add(input.next());
        }
        System.out.println(list);

    }


}
