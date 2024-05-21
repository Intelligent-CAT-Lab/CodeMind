import java.util.Scanner;

public class p01601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 100000; i++) {
            if (isPalindrome(n - i)) {
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
        String str = Integer.toString(n);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i)!= str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}