import java.util.*;
public class p00369 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 8;
        for (int k = 1; k < S.length(); k++) {
            if (S.length() % k!= 0) continue;
            String maxs = S.substring(0, k);
            String mins = S.substring(0, k);
            for (int s = 0; s < S.length(); s += k) {
                maxs = Math.max(maxs, S.substring(s, s + k));
                mins = Math.min(mins, S.substring(s, s + k));
            }
            ans = Math.min(ans, Math.abs(Integer.parseInt(maxs) - Integer.parseInt(mins)));
        }
        System.out.println(Math.min(ans, check12(S)));
    }

    public static int check12(String S) {
        int maxv = 0, minv = 10, p = 0;
        while (p < S.length()) {
            int v = Integer.parseInt(S.substring(p, p + 1));
            if (S.substring(p, p + 1).equals("1") && p + 1 < S.length()) {
                v = 10 + Integer.parseInt(S.substring(p + 1, p + 2));
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p++;
        }
        return maxv - minv;
    }
}