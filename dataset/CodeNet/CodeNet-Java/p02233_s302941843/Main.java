/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
'+'とかは問題ない
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
//import static java.lang.System.*; はしばらく使わなそう(使うとしてもexit(0)のためだけ)←return;でよさそう
最後にout.flush()またはout.close()をするのを忘れずに！
Point2D p2d=new Point2D.Double(d1,d2);
*/
//入力終了→Ctrl+D
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        long[][] A={{1,1},{1,0}};
        long n=sc.nextInt();
        if(n==0||n==1){
            out.println(1);
        }else {
            n -= 2;
            long[][] E = Power(A, n + 1);
            out.println(E[0][0] + E[0][1]);
        }
        out.close();
    }

    static long mod = (long) 1e9 + 7;

    static class COM {

        static long[] fact;
        static long[] inv;

        static void Init(int n) {
            fact = new long[n];
            inv = new long[n];
            fact[0] = inv[0] = 1;
            for (int i = 1; i < n; i++) {
                fact[i] = (fact[i - 1] * i) % mod;
                inv[i] = power(fact[i], mod - 2);
            }
        }

        static long C(int n, int k) {
            if (k > n) return 0;
            return ((fact[n] * inv[n - k]) % mod * inv[k]) % mod;
        }
    }

    static long power(long x, long n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            long e = power(x, n / 2);
            return (e * e) % mod;
        }
        return (x * power(x, n - 1)) % mod;
    }

    static long[][] I={{1,0},{0,1}};

    static long[][] Ptime(long[][] A,long[][] B){
        long[][] X=new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                long t=0;
                for (int k = 0; k < 2; k++) {
                    t+=A[i][k]*B[k][j];
                }
                X[i][j]=t;
            }
        }
        return X;
    }

    static long[][] Power(long[][] P, long n) {
        //long[][] Q=P.clone();
        if (n == 0) return I;
        if (n % 2 == 0) {
            long[][] A = Power(P, n / 2);
            return Ptime(A,A);
        }
        return Ptime(P,Power(P,n-1));
    }

    //クラスカル法(0-indexed) n頂点m辺
    static HashSet<Integer> Kruskal(int[] u, int[] v, int[] cost, int n) {
        int m = u.length;
        UF.Init(n);
        PriorityQueue<Integer> S = new PriorityQueue<>((p1, p2) -> cost[p1] - cost[p2]);
        for (int i = 0; i < m; i++) {
            S.add(i);
        }
        //最小全域木をなす辺
        HashSet<Integer> F = new HashSet<>();
        while (!S.isEmpty()) {
            int e = S.poll();
            if (!UF.same(u[e], v[e])) {
                F.add(e);
                UF.unite(u[e], v[e]);
            }
        }
        return F;
    }

    //Union Find木(0-indexed)
    static class UF {
        static int[] d;

        static void Init(int size) {
            d = new int[size];
            for (int i = 0; i < size; i++) {
                d[i] = -1;
            }
        }

        static boolean unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return false;
            if (d[x] > d[y]) {
                int t = d[y];
                d[y] = d[x];
                d[x] = t;
            }
            d[x] += d[y];
            d[y] = x;
            return true;
        }

        static boolean same(int x, int y) {
            return find(x) == find(y);
        }

        static int find(int k) {
            return d[k] < 0 ? k : (d[k] = find(d[k]));
        }

        static int size(int k) {
            return -d[find(k)];
        }
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }

        static boolean hasNextInt() {
            return s.hasNextInt();
        }

    }

}
