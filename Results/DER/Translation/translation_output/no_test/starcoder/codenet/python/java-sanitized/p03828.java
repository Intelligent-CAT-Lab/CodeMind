import java.util.*;
import java.io.*;

public class p03828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int MOD = 1000000007;
        int ans = 1;
        ArrayList<Integer> num = new ArrayList<Integer>();
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) break;
            } else {
                num.add(i);
                count.put(i, 1);
            }
        }
        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }
        System.out.println(ans);
    }
}