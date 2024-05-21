import java.util.*;

public class p02775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] n = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            n[i] = s.charAt(s.length() - 1 - i) - '0';
        }
        int[] m = new int[s.length() + 1];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += n[i];
            if (sum >= 5) {
                m[i + 1] = 1;
                sum -= 10;
            }
        }
        if (sum >= 5) {
            m[0] = 1;
        }
        int ans = 0;
        for (int i = 0; i < m.length; i++) {
            ans = ans * 2 + m[i];
        }
        System.out.println(ans);
    }
}