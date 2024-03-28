import java.util.Scanner;

public class p01601 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = findPalindromeNumber(n);
        System.out.println(result);
        scanner.close();
    }

    private static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        StringBuilder reversedStr = new StringBuilder(numStr).reverse();
        return numStr.equals(reversedStr.toString());
    }

    private static int findPalindromeNumber(int n) {
        for (int i = 0; i < 100000; i++) {
            if (n >= i && isPalindrome(n - i)) {
                return n - i;
            }
            if (isPalindrome(n + i)) {
                return n + i;
            }
        }
        return -1; // Should never reach this line if a palindrome is found within the 100000 range
    }
}