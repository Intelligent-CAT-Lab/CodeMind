import java.util.*;
import java.io.*;

public class p02032 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    static void solve() {
        Map<Integer, Integer> map = primeFactorization(N);
        int size = map.size();
        int val = 1;
        for (int v : map.values()) {
            val *= (v + 1);
        }
        System.out.println(size + " " + (val - 1));
    }

    static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}