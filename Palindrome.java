// write a program to check giveen numbers is palindrome using keyworld revese using ternary operator
// Program to check whether a given number how many even and odd numbers are there
// and also check whether the number is palindrome or not.
public class Palindrome {

    public static void main(String[] args) {
        int num = 12345; // Example number
        boolean isPalindrome = isPalindrome(num);
        System.out.println(num + " is " + (isPalindrome ? "" : "not ") + "a palindrome.");
        countEvenOdd(num);
        
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
    public static void countEvenOdd(int num) {
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num /= 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}