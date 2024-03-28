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

    static int rd(int p) {
        Scanner sc = new Scanner(System.in);
        if (p == 0)
            return sc.next();
        if (p == 1)
            return sc.nextInt();
        if (p == 2) {
            String[] str = sc.nextLine().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++)
                arr[i] = Integer.parseInt(str[i]);
            return arr;
        }
        if (p == 3) {
            String[] str = sc.nextLine().split(" ");
            List<Integer> list = new ArrayList<>();
            for (String s : str)
                list.add(Integer.parseInt(s));
            return list;
        }
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