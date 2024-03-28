import java.util.*;

public class p00369 {
    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i)!= mins.charAt(i)) {
                if (i == maxs.length()-1) {
                    return (int) maxs.charAt(i) - (int) mins.charAt(i);
                }
                if (i == maxs.length()-2) {
                    return (int) (maxs.charAt(i) - '0') * 10 + (int) (maxs.charAt(i+1) - '0') - (int) (mins.charAt(i) - '0') * 10 - (int) (mins.charAt(i+1) - '0');
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
            String maxs = S.substring(0, k);
            for (int s = 0; s < S.length(); s += k) {
                maxs = max(maxs, S.substring(s, s+k));
                mins = min(mins, S.substring(s, s+k));
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
            int v = (int) S.charAt(p) - '0';
            if (S.charAt(p) == '1' && p+1 < S.length()) {
                v = 10 + (int) S.charAt(p+1) - '0';
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p++;
        }
        return maxv - minv;
    }

    public static String max(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < b.charAt(i)) return b;
            if (a.charAt(i) > b.charAt(i)) return a;
        }
        return a;
    }

    public static String min(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < b.charAt(i)) return a;
            if (a.charAt(i) > b.charAt(i)) return b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }
}