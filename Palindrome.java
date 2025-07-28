// write a program to check giveen number is palindrome or not.
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
            
        }
        System.out.println("Reversed number: " + reverse);
        if (reverse == number) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }       
        scanner.close();
}
    }
