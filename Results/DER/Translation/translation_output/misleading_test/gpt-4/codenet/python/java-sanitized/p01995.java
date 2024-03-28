import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p01995 {
    private static final int MOD = 1000000007;
    private static final int ALPHABET_SIZE = 26;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        int[] alpha2 = new int[ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            alpha2[i] = 'a' + i;
        }

        int l = s.length();
        ArrayList<Integer>[] memo = (ArrayList<Integer>[]) new ArrayList[ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            memo[i] = new ArrayList<>();
        }

        for (int i = 0; i < l; i++) {
            memo[s.charAt(i) - 'a'].add(i);
        }

        long[][] dp = new long[l + 1][l + 1];
        dp[0][l] = 1;
        long ans = 0;

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                long p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < ALPHABET_SIZE; k++) {
                    int x = bisectLeft(memo[k], i);
                    int y = bisectRight(memo[k], j - 1) - 1;
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k].get(x);
                        int my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % MOD;
                    }
                    ans = ans % MOD;
                }
            }
        }

        for (ArrayList<Integer> list : dp) {
            for (long val : list) {
                ans = (ans + val) % MOD;
            }
        }
        ans = (ans + MOD - 1) % MOD; // Adjust for the removal of the empty string

        System.out.println(ans);
    }

    private static int bisectLeft(ArrayList<Integer> list, int x) {
        int idx = Collections.binarySearch(list, x);
        if (idx < 0) {
            idx = -(idx + 1);
        }
        return idx;
    }

    private static int bisectRight(ArrayList<Integer> list, int x) {
        int idx = Collections.binarySearch(list, x);
        if (idx < 0) {
            idx = -(idx + 1);
        } else {
            idx++;
            while (idx < list.size() && list.get(idx).equals(x)) {
                idx++;
            }
        }
        return idx;
    }
}