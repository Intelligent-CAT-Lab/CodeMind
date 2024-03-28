import java.util.*;

public class p01995 {
    static int mod = 1000000007;
    static int[] memo = new int[26][26];
    static int[] alpha = {"abcdefghijklmnopqrstuvwxyz"};
    static int[] alpha2 = new int[26];
    static int[] dp = new int[26][26];
    static int l;
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        l = s.length();
        Arrays.fill(alpha2, -1);
        for (int i = 0; i < 26; i++) {
            alpha2[i] = i;
        }
        Arrays.fill(memo, new int[26], new int[26]);
        Arrays.fill(dp, new int[26], new int[26]);
        for (int i = 0; i < l; i++) {
            memo[alpha2[s.charAt(i)]].add(i);
        }
        for (int i = 0; i < l; i++) {
            dp[i][l] = 1;
        }
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = bisectLeft(memo[k], i);
                    int y = bisectRight(memo[k], j - 1) - 1;
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k][x];
                        int my = memo[k][y];
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans = ans % mod;
            }
        }
        ans = (ans + sum(Arrays.stream(dp).mapToInt(i -> Arrays.stream(i).sum() % mod).toArray()) + mod - 1) % mod;
        System.out.println(ans);
    }

    static int bisectLeft(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    static int bisectRight(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}