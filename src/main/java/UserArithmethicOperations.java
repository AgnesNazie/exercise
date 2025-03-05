import java.util.Scanner;

public class UserArithmethicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number");
        int num2 = scanner.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "+" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "+" + num2 + "=" + (num1 / num2));
        System.out.println(num1 + "+" + num2 + "=" + (num1 - num2));
        scanner.close();

    }
}