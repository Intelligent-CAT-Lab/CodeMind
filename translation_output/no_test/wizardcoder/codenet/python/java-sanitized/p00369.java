import java.util.*;

public class p00369 {
    public static int sub(String[] maxs, String[] mins) {
        for (int i = 0; i < maxs.length; i++) {
            if (!maxs[i].equals(mins[i])) {
                if (i == maxs.length-1) {
                    return Integer.parseInt(maxs[i]) - Integer.parseInt(mins[i]);
                }
                if (i == maxs.length-2) {
                    return Integer.parseInt(maxs[i] + mins[i]) - Integer.parseInt(mins[i] + maxs[i+1]);
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
            String[] mins = new String[k];
            String[] maxs = new String[k];
            for (int s = 0; s < S.length(); s += k) {
                String sub = S.substring(s, s+k);
                maxs[s/k] = sub;
                mins[s/k] = sub;
            }
            for (int i = 0; i < k; i++) {
                for (int j = i+1; j < k; j++) {
                    if (maxs[i].compareTo(maxs[j]) < 0) {
                        String temp = maxs[i];
                        maxs[i] = maxs[j];
                        maxs[j] = temp;
                    }
                    if (mins[i].compareTo(mins[j]) > 0) {
                        String temp = mins[i];
                        mins[i] = mins[j];
                        mins[j] = temp;
                    }
                }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }
}