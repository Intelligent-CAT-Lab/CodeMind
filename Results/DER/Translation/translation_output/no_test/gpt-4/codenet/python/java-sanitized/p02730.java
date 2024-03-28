import java.util.Scanner;

public class p02730 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (isPalindrome(s) && isPalindrome(pre) && isPalindrome(suf)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}