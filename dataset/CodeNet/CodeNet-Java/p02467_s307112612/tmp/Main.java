import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni();

        TreeMap<Integer, Integer> map = primeFactorize(n);

        out.print(n + ":");
        Set<Integer> set = map.keySet();
System.out.println("[INST]18;set;map.keySet();"+set);
        for (int x : set) {
            for (int i = 0; i < map.get(x); i++) {
System.out.println("[INST]20;None;map.get(x);"+map.get(x));
                out.print(" " + x);
            }
        }
        out.println();
    }

    TreeMap<Integer, Integer> primeFactorize(int n) {
        Prime p = new Prime((int) Math.sqrt(n) + 1);
System.out.println("[INST]28;None;Math.sqrt(n);"+Math.sqrt(n));
        ArrayList<Integer> primes = p.getPrimes();

        TreeMap<Integer, Integer> ret = new TreeMap<>();
        for (int i = 0; i < primes.size(); i++) {
System.out.println("[INST]32;None;primes.size();"+primes.size());
            int x = primes.get(i);
System.out.println("[INST]33;x;primes.get(i);"+x);
            if (n % x == 0) {
                int cnt = 0;
                while (n % x == 0) {
                    cnt++;
                    n /= x;
                }
                ret.put(x, cnt);
System.out.println("[INST]40;None;ret.put(x, cnt);"+ret.put(x, cnt));
            }
        }
        if (n > 1) {
            ret.put(n, 1);
System.out.println("[INST]44;None;ret.put(n, 1);"+ret.put(n, 1));
        }

        return ret;
    }

    class Prime {
        int n;
        boolean[] isPrime;
        ArrayList<Integer> primes;

        Prime(int n) {
            this.n = n;
            isPrime = new boolean[n + 1];
            primes = new ArrayList<>();
            sieve();
        }

        void sieve() {
            for (int i = 2; i < n; i++) {
                if (!isPrime[i]) {
                    primes.add(i);
System.out.println("[INST]65;None;primes.add(i);"+primes.add(i));
                    for (long j = (long) i * i; j < n; j += i) {
                        isPrime[(int) j] = true;
                    }
                }
            }
        }

        ArrayList<Integer> getPrimes() {
            return primes;
        }
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
System.out.println("[INST]80;None;in.readLine();"+in.readLine());
        }
        return tok.nextToken();
System.out.println("[INST]82;None;tok.nextToken();"+tok.nextToken());
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}