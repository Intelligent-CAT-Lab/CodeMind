import java.util.Scanner;

public class p02833 {

    static final int MAX = 100001;
    static int[] par = new int[MAX];

    public static void main(String[] args) {
        // Initialize Disjoint Set Union (DSU)
        for (int i = 0; i < par.length; i++) {
            par[i] = -1;
        }

        int t = 1;
        Scanner sc = new Scanner(System.in);
        for (int term = 1; term <= t; term++) {
            int n = sc.nextInt();
            int div = 10;
            int tot = 0;
            if (n % 2 == 1) {
                System.out.println(0);
            } else {
                while (n >= div) {
                    tot += (n / div);
                    div *= 5;
                }
                System.out.println(tot);
            }
        }
        sc.close();
    }

    // DSU Functions
    public static int find(int u) {
        if (par[u] < 0) {
            return u;
        } else {
            return find(par[u]);
        }
    }

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