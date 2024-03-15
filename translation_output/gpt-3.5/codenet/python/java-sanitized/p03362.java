import java.util.*;
import java.io.*;

public class p03362 {

    static final int INF = (int) 1e16;
    static final int MOD = (int) 1e9 + 7;

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();

        // Function to generate prime numbers
        List<Integer> makePrimeNums(int n) {
            List<Integer> primeNums = new ArrayList<>();
            if (n >= 2) {
                primeNums.add(2);
            }
            for (int i = 3; i <= n; i++) {
                boolean isPrime = true;
                for (int p : primeNums) {
                    if (p * p > i) break;
                    if (i % p == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNums.add(i);
                }
            }
            return primeNums;
        }

        int n = sc.nextInt();
        List<Integer> p = makePrimeNums(2000);

        List<Integer> ans = new ArrayList<>();
        for (int pi : p) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}