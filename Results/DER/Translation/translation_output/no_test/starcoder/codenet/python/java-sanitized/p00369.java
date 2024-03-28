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
            ans = Math.min(ans, sub(maxs, mins));
        }
        System.out.println(ans);
    }

    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i)!= mins.charAt(i)) {
                if (i == maxs.length() - 1) return Integer.parseInt(maxs.substring(i)) - Integer.parseInt(mins.substring(i));
                if (i == maxs.length() - 2) return Integer.parseInt(maxs.substring(i, i + 2)) - Integer.parseInt(mins.substring(i, i + 2));
                return 10;
            }
        }
        return 0;
    }
}