import java.util.Scanner;

public class coding {
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        return rev;
    }

    public static boolean checkPalindrome(int n) {
        int reversed = reverse(n);
        return n == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean isPalindrome = checkPalindrome(n);
        System.out.println("Is the number a palindrome? " + isPalindrome);
    }
}
