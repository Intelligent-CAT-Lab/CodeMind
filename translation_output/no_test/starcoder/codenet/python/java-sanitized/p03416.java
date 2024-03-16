import java.util.*;
public class p03416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(new Main().solve(f, t));
    }

    public int solve(int f, int t) {
        int count = 0;
        for (int i = f; i <= t; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}