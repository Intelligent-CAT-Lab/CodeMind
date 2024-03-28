import java.util.*;
import java.math.*;
import java.util.stream.*;

public class p02833 {
    
    static int ncr(int n, int r) {
        r = Math.min(r, n - r);
        BigInteger numer = IntStream.rangeClosed(n - r + 1, n).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger denom = IntStream.rangeClosed(1, r).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
        return numer.divide(denom).intValue();
    }

    static Scanner sc = new Scanner(System.in);

    static String rd(int p) {
        if(p == 0) {
            return sc.nextLine();
        } else if(p == 1) {
            return String.valueOf(sc.nextInt());
        } else if(p == 2) {
            return Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.joining(" "));
        } else if(p == 3) {
            return Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.joining(" "));
        }
        return "";
    }

    static int[] par = new int[100001];

    static int find(int u) {
        if(par[u] < 0) {
            return u;
        } else {
            return find(par[u]);
        }
    }

    static void uni(int x, int y) {
        int u = find(x);
        int v = find(y);
        if(u == v) {
            return;
        }
        if(par[u] < par[v]) {
            par[u] += par[v];
            par[v] = u;
        } else {
            par[v] += par[u];
            par[u] = v;
        }
    }

    public static void main(String[] args) {
        int t = 1;
        for(int term = 1; term <= t; term++) {
            int n = Integer.parseInt(rd(1));
            int div = 10;
            int tot = 0;
            if(n % 2 == 1) {
                System.out.println(0);
            } else {
                while(n >= div) {
                    tot += (n / div);
                    div *= 5;
                }
                System.out.println(tot);
            }
        }
    }
}