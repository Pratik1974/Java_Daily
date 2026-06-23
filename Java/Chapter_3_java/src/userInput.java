import java.util.Scanner;

public class userInput {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); //object deceleration
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.print(name + ", Also tell me your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
        System.out.println(name + ", your are due have DL ?");
        input.nextLine();
        String ans = input.nextLine();
        System.out.println(ans + " have a DL");

    }
}
