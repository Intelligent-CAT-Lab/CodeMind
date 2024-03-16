import java.util.*;

public class p00369 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }

    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i) != mins.charAt(i)) {
                if (i == maxs.length() - 1) {
                    return Integer.parseInt(maxs.substring(i)) - Integer.parseInt(mins.substring(i));
                }
                if (i == maxs.length() - 2) {
                    return Integer.parseInt(maxs.substring(i, i + 2)) - Integer.parseInt(mins.substring(i, i + 2));
                }
                return 10;
            }
        }
        return 0;
    }

    public static int checkEqual(String S) {
        int ans = 8;
        for (int k = 1; k < S.length(); k++) {
            if (S.length() % k != 0) continue;
            String mins = S.substring(0, k);
            String maxs = S.substring(0, k);
            for (int s = 0; s < S.length(); s += k) {
                maxs = max(maxs, S.substring(s, s + k));
                mins = min(mins, S.substring(s, s + k));
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        return ans;
    }

    public static int check12(String S) {
        int maxv = 0;
        int minv = 10;
        int p = 0;
        while (p < S.length()) {
            int v = Integer.parseInt(S.substring(p, p+1));
            if (S.charAt(p) == '1' && p + 1 < S.length()) {
                v = 10 + Integer.parseInt(S.substring(p + 1, p + 2));
                p += 1;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p += 1;
        }
        return maxv - minv;
    }

    public static String min(String a, String b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static String max(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}