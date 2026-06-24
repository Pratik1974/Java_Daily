import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is time to show your result");
        System.out.print("Kindly your grade: ");
        char grade = input.next().charAt(0);

        System.out.println("This is your grade: " + grade);

    }
}