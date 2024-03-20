import java.util.*;

public class p00369 {
    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i)!= mins.charAt(i)) {
                if (i == maxs.length()-1) {
                    return Integer.parseInt(maxs.substring(i)) - Integer.parseInt(mins.substring(i));
                }
                if (i == maxs.length()-2) {
                    return Integer.parseInt(maxs.substring(i, i+2)) - Integer.parseInt(mins.substring(i, i+2));
                }
                return 10;
            }
        }
        return 0;
    }

    public static int checkEqual(String S) {
        int ans = 8;
        for (int k = 1; k <= S.length(); k++) {
            if (S.length()%k!= 0) continue;
            String mins = S.substring(0, k);
            String maxs = mins;
            for (int s = 0; s < S.length(); s += k) {
                String sub = S.substring(s, s+k);
                maxs = max(maxs, sub);
                mins = min(mins, sub);
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
            int v = S.charAt(p) - '0';
            if (S.charAt(p) == '1' && p+1 < S.length()) {
                v = 10 + S.charAt(p+1) - '0';
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p++;
        }
        return maxv - minv;
    }

    public static String max(String a, String b) {
        if (a.compareTo(b) > 0) return a;
        return b;
    }

    public static String min(String a, String b) {
        if (a.compareTo(b) < 0) return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }
}