import java.util.*;

public class p01945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.indexOf('*');
        int p = Math.abs(count(s.substring(0, n), '(') - count(s.substring(0, n), ')'));
        int q = Math.abs(count(s.substring(n + 1), '(') - count(s.substring(n + 1), ')'));
        System.out.println(Math.min(p, q));
    }

    public static int count(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}