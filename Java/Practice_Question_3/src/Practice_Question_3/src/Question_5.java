import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your name: ");
        String name = input.nextLine();
        System.out.print("Kindly enter your next year age: ");
        int age = input.nextInt();

        System.out.println("Hello " + name);
        System.out.println("Next year you will be " + age + " years old.");
    }
}