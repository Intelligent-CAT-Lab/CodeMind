import java.util.*;
public class p03416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int t = sc.nextInt();
        int count = 0;
        for (int i = f; i <= t; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}