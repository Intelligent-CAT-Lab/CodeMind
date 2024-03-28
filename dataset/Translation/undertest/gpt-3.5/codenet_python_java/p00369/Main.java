import java.util.Scanner;

public class p00369 {
    
    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i) != mins.charAt(i)) {
                if (i == maxs.length()-1) {
                    return Integer.parseInt(Character.toString(maxs.charAt(i))) - Integer.parseInt(Character.toString(mins.charAt(i)));
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
        for (int k = 1; k < S.length(); k++) {
            if (S.length() % k != 0) continue;
            String mins = S.substring(0, k);
            String maxs = S.substring(0, k);
            for (int s = 0; s < S.length(); s += k) {
                maxs = maxs.compareTo(S.substring(s, s+k)) > 0 ? maxs : S.substring(s, s+k);
                mins = mins.compareTo(S.substring(s, s+k)) < 0 ? mins : S.substring(s, s+k);
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
            int v = Character.getNumericValue(S.charAt(p));
            if (S.charAt(p) == '1' && p+1 < S.length()) {
                v = 10 + Character.getNumericValue(S.charAt(p+1));
                p += 1;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p += 1;
        }
        return maxv - minv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }
}