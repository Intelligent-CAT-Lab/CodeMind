```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    
    static int ncr(int n, int r) {
        r = Math.min(r, n-r);
        BigInteger numer = BigInteger.ONE;
        BigInteger denom = BigInteger.ONE;
        for (int i = n; i > n-r; i--) {
            numer = numer.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= r; i++) {
            denom = denom.multiply(BigInteger.valueOf(i));
        }
        return numer.divide(denom).intValue();
    }
    
    static Scanner sc = new Scanner(System.in);
    
    static int rd(int p) {
        if (p == 0) {
            return sc.nextInt();
        } 
        if (p == 1) {
            return sc.nextInt();
        } 
        if (p == 2) {
            sc.nextLine();
            return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        } 
        if (p == 3) {
            sc.nextLine();
            return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return 0;
    }

    static int find(int u, int[] par) {
        if (par[u] < 0) {
            return u;
        } else {
            return find(par[u], par);
        }
    }

    static void uni(int x, int y, int[] par) {
        int u = find(x, par);
        int v = find(y, par);
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

    public static void main(String[] args) {
        int t = 1;
        for (int term = 1; term <= t; term++) {
            int n = rd(1);
            int div = 10;
            int tot = 0;
            if (n % 2 == 1) {
                System.out.println(0);
            } else {
                while (n >= div) {
                    tot += n/div;
                    div *= 5;
                }
                System.out.println(tot);
            }
        }
    }
}
```
