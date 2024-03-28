import java.util.Scanner;

public class p01601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 100000; i++) {
            if (n >= i && isPalindrome(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (isPalindrome(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean isPalindrome(int n) {
        return String.valueOf(n).equals(new StringBuilder(String.valueOf(n)).reverse().toString());
    }
}