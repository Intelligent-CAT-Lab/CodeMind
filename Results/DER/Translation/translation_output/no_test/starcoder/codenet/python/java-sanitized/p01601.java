import java.util.*;
public class p01601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 100000; i >= 0; i--) {
            if (n >= i && isPalind(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (isPalind(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean isPalind(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}