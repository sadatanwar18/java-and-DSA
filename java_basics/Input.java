import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
//            System.out.println("enter the input");
//            int rollno = input.nextInt();
//            System.out.println("your roll no is " + rollno);
            String name = input.nextLine();
            System.out.println(name);

            Float cgpa = input.nextFloat();
            System.out.println(cgpa);
        }
    }
}
