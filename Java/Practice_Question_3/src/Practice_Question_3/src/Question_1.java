import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();
        System.out.print("Please Enter your height: ");
        float height = input.nextFloat();
        System.out.print("Please answer that you are student or not: ");
        boolean ID = input.nextBoolean();

    }
}
