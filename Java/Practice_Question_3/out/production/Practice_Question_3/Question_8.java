import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // Clears the leftover Enter key

        System.out.print("Kindly enter your city: ");
        String city = input.nextLine();

        System.out.println("-----Profile-----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

    }
}
