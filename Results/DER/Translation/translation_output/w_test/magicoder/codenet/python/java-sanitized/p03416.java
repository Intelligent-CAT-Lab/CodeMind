import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0;

        for (int i = f; i <= t; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}