import java.util.*;
import java.io.*;

public class p03234 {
    static int n, k, cut = (int)1e9+7;
    static int[] unused, unusedacum;
    static ArrayList<int[]> abli;
    static int[][] ggg, dp;
    static ArrayList<Integer>[] nonSandwichedNums;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        k = Integer.parseInt(line[1]);
        unused = new int[n+1];
        unused[0] = 1;
        unused[1] = 1;
        for (int i = 2; i <= n; i++) {
            unused[i] = 2;
        }
        unusedacum = new int[n+1];
        unusedacum[0] = 0;
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i-1]+unused[i];
        }
        abli = new ArrayList<int[]>();
        for (int i = 0; i < k; i++) {
            line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        flattenabli = new ArrayList<Integer>();
        for (int[] ab : abli) {
            flattenabli.add(ab[0]);
            flattenabli.add(ab[1]);
        }
        flattenabli.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i = 0; i < flattenabli.size(); i++) {
            int a = flattenabli.get(i);
            unused[a]--;
        }
        nonSandwichedNums = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            nonSandwichedNums[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nonSandwichedNums[i].add(j);
                }
            }
        }
        ggg = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                ggg[i][j] = g(i, j);
            }
        }
        undetermined = unusedacum[n];
        dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (ggg[i][j]!= 0) {
                    dp[i][j] = (ggg[i][j]-sum(dp[i][kk]*ggg[kk+1][j] for kk in nonSandwichedNums[i] if kk < j)) % cut;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans+dp[i][j]*pairCombinations(undetermined-unusedacum[j]-unusedacum[i-1])) % cut;
            }
        }
        System.out.println(ans);
    }

    public static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x-1);
        } else {
            return 0;
        }
    }

    public static int doubleFactorial(int x) {
        int ans = 1;
        for (int i = x; i > 0; i -= 2) {
            ans = (ans*i) % cut;
        }
        return ans;
    }

    public static int sum(int... x) {
        int ans = 0;
        for (int i : x) {
            ans = (ans+i) % cut;
        }
        return ans;
    }

    public static boolean isSandwiched(int i, int j) {
        for (int[] ab : abli) {
            if (ab[0] < i && i <= ab[1] && ab[1] <= j) {
                return true;
            } else if (i <= ab[0] && ab[0] <= j && j < ab[1]) {
                return true;
            }
        }
        return false;
    }

    public static int g(int i, int j) {
        int x = unusedacum[j]-unusedacum[i-1];
        return pairCombinations(x);
    }
}