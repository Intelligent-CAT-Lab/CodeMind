import java.util.Scanner;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class p02833 {
    // Importing Libraries
    static final int MAX = 100001;
    static int[] par = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial setup of DSU
        for (int i = 0; i < MAX; i++) {
            par[i] = -1;
        }

        // User defined functions
        int t = 1; // If t should be read from input, replace with t = rd(1, sc);

        for (int term = 1; term <= t; term++) {
            int n = rd(1, sc); // Reading the value of 'n'
            int div = 10;
            int tot = 0;
            
            if (n % 2 == 1) {
                System.out.println(0);
            } else {
                while (n >= div) {
                    // System.out.println(n / div); // Debug print, uncomment if necessary
                    tot += (n / div);
                    div *= 5;
                }
                System.out.println(tot);
            }
        }

        sc.close(); // Close the Scanner
    }

    // NCR function
    public static BigInteger ncr(int n, int r) {
        r = Math.min(r, n - r);
        BigInteger numer = IntStream.rangeClosed(n - r + 1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger denom = IntStream.rangeClosed(1, r)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        return numer.divide(denom);
    }
    
    // READ function
    public static Object rd(int p, Scanner sc) {
        if (p == 0) {
            return sc.nextLine();
        }
        if (p == 1) {
            return sc.nextInt();
        }
        if (p == 2) {
            return sc.nextLine().split(" ");
        }
        if (p == 3) {
            return sc.nextLine().split(" ");
        }
        return null;
    }
    
    // DSU find function
    public static int find(int u) {
        if (par[u] < 0) {
            return u;
        } else {
            return find(par[u]);
        }
    }
    
    // DSU union function
    public static void uni(int x, int y) {
        int u = find(x);
        int v = find(y);
        if (u == v) {
            return;
        }
        if (par[u] < par[v]) {
            par[u] += par[v];
            par[v] = u;
        } else {
            par[v] += par[u];
            par[u] = v;
        }
    }
}