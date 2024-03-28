import java.util.Scanner;

public class p02730 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + ((s.length() % 2 == 0) ? 0 : 1));

        if (isPalindrome(s) && isPalindrome(pre) && isPalindrome(suf)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
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