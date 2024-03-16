import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class p02965 {
    private static final int INF = Integer.MAX_VALUE;
    private static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("_in.txt"));
        String line = br.readLine();
        List<Integer> nums = new ArrayList<>();
        for (String s : line.split(" ")) {
            nums.add(Integer.parseInt(s));
        }
        int N = nums.get(0);
        int M = nums.get(1);

        List<Integer> factorials = getFactorials(M * 3 / 2 + N, MOD);
        List<Integer> finvs = getModInvs(M * 3 / 2 + N, MOD);

        int p = 1;
        for (int i = 0; i < finvs.size(); i++) {
            p = p * finvs.get(i) % MOD;
        }

        List<Integer> odds = new ArrayList<>();
        for (int i = 1; i < M; i += 2) {
            odds.add(i);
        }
        int halves = (M * 3 - odds.size()) / 2;

        int oc1 = getNCR(N, odds, MOD);
        int oc2 = getNCR(N - 1, odds, MOD);

        int c1 = getNCR(halves + N - 1, N - 1, MOD) * oc1 % MOD;

        int halves2 = (M - odds.get(0)) / 2;
        int c2a = getNCR(halves2 + N - 1, N - 1, MOD) * oc1 % MOD;
        int c2b = getNCR(halves2 + N - 2, N - 2, MOD) * oc2 % MOD;
        int c2 = (c2a - c2b) * N % MOD;

        System.out.println((c1 - c2).sum() % MOD);
    }

    private static List<Integer> getFactorials(int n, int mod) {
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        for (int i = 2; i <= n; i++) {
            ret.add(ret.get(i - 1) * i % mod);
        }
        return ret;
    }