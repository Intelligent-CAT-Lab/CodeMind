import java.util.*;

public class p02833 {
    static int[] par = new int[100001];

    static int find(int u) {
        if (par[u] < 0)
            return u;
        else
            return find(par[u]);
    }

    static void uni(int x, int y) {
        int u = find(x);
        int v = find(y);
        if (u == v)
            return;
        if (par[u] < par[v]) {
            par[u] += par[v];
            par[v] = u;
        } else {
            par[v] += par[u];
            par[u] = v;
        }
    }

    static int ncr(int n, int r) {
        r = Math.min(r, n - r);
        int numer = 1;
        int denom = 1;
        for (int i = 0; i < r; i++) {
            numer *= (n - i);
            denom *= (i + 1);
        }
        return numer / denom;
    }

    static int rd(int p) {
        Scanner sc = new Scanner(System.in);
        if (p == 0)
            return sc.next();
        if (p == 1)
            return sc.nextInt();
        if (p == 2)
            return sc.nextInt();
        if (p == 3)
            return sc.nextInt();
        return 0;
    }

    public static void main(String[] args) {
        int t = 1;
        for (int term = 1; term <= t; term++) {
            int n = rd(1);
            int div = 10;
            int tot = 0;
            if (n % 2 == 1)
                System.out.println(0);
            else {
                while (n >= div) {
                    tot += (n / div);
                    div *= 5;
                }
                System.out.println(tot);
            }
        }
    }
}