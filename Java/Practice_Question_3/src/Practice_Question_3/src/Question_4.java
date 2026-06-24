import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to magic Calculator");
        System.out.print("Kindly, Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Kindly, Enter Second Number: ");
        int b = input.nextInt();

        int sum = a + b;
        float sub = a - b;
        int mul = a * b;

        System.out.println("As per your request this is the all answer your given question");
        System.out.println("Sum of both the number is: " + sum);
        System.out.println("Differnce of both the number is: " + sub);
        System.out.println("The product of both the number is: " + mul);

    }
}