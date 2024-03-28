import java.util.*;

public class p03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        int a = 0;
        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == 'A') {
                a += 1;
                i += 1;
            } else if (i + 1 < S.length() && S.charAt(i) == 'B' && S.charAt(i + 1) == 'C') {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i += 1;
            }
        }
        System.out.println(ans);
    }
}