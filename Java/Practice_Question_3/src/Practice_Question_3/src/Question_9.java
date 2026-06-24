import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your name: ");
        String name = input.nextLine();

        System.out.print("Kindly enter your Roll no. ");
        int Roll = input.nextInt();

        input.nextLine(); // Clears the leftover Enter key

        System.out.print("Kindly enter your Branch: ");
        String Branch = input.nextLine();

        System.out.println("==================");
        System.out.println("College ID Card");
        System.out.println("==================");
        System.out.println("Name :" + name);
        System.out.println("Roll :" + Roll);
        System.out.println("Branch :" + Branch);
        System.out.println("==================");

    }
}
