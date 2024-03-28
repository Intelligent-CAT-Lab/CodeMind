import java.util.Scanner;

public class p00369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }

    private static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i) != mins.charAt(i)) {
                if (i == maxs.length() - 1) {
                    return Character.getNumericValue(maxs.charAt(i)) - Character.getNumericValue(mins.charAt(i));
                }
                if (i == maxs.length() - 2) {
                    return Integer.parseInt(maxs.substring(i, i + 2)) - Integer.parseInt(mins.substring(i, i + 2));
                }
                return 10;
            }
        }
        return 0;
    }

    private static int checkEqual(String S) {
        int ans = 8;
        for (int k = 1; k < S.length(); k++) {
            if (S.length() % k != 0) continue;
            String mins = S.substring(0, k);
            String maxs = mins;
            for (int s = 0; s < S.length(); s += k) {
                String currentSubstring = S.substring(s, Math.min(s + k, S.length()));
                maxs = max(maxs, currentSubstring);
                mins = min(mins, currentSubstring);
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        return ans;
    }

    private static String max(String a, String b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

    private static String min(String a, String b) {
        return (a.compareTo(b) < 0) ? a : b;
    }

    private static int check12(String S) {
        int maxv = 0;
        int minv = 10;
        int p = 0;
        while (p < S.length()) {
            int v = Character.getNumericValue(S.charAt(p));
            if (S.charAt(p) == '1' && p + 1 < S.length()) {
                v = 10 + Character.getNumericValue(S.charAt(p + 1));
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p++;
        }
        return maxv - minv;
    }
}