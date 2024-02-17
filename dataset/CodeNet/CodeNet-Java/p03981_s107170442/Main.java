// package atcoder.other2016.kupc2016;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        char[] t = in.nextToken().toCharArray();

        SuffixArray sa = new SuffixArray(t);
        sa.buildSA();
        sa.buildLCP();

        int n = t.length+1;
        UnionFind uf = new UnionFind(n);

        int[][] sapo = new int[n][2];
        for (int i = 0; i < n ; i++) {
            sapo[i][0] = sa.sa[i];
            sapo[i][1] = i;
        }
        Arrays.sort(sapo, (a, b) -> a[0] - b[0]);

        int[][] lcpo = new int[n-1][2];
        for (int i = 0; i < n-1 ; i++) {
            lcpo[i][0] = sa.lcp[i];
            lcpo[i][1] = i;
        }
        Arrays.sort(lcpo, (a, b) -> b[0] - a[0]);

        int max = 0;
        int L = n;
        int cnt = 0;
        int li = 0;
        for (int i = 0; i < n ; i++) {
            L--;
            cnt++;
            while (li < lcpo.length && lcpo[li][0] >= L) {
                int p = lcpo[li][1];
                int q = lcpo[li][1]+1;
                if (!uf.issame(p, q)) {
                    uf.unite(p, q);
                    cnt--;
                }
                li++;
            }
            max = Math.max(max, cnt);
        }

        out.println(max);
        out.flush();
    }

    static class UnionFind {
        int[] rank;
        int[] parent;
        int[] cnt;

        public UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
            cnt = new int[n];
            for (int i = 0; i < n ; i++) {
                parent[i] = i;
                cnt[i] = 1;
            }
        }

        public int find(int a) {
            if (parent[a] == a) {
                return a;
            }
            parent[a] = find(parent[a]);
            return parent[a];
        }

        public void unite(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) {
                return;
            }
            if (rank[a] < rank[b]) {
                parent[a] = b;
                cnt[b] += cnt[a];
                cnt[a] = cnt[b];
            } else {
                parent[b] = a;
                cnt[a] += cnt[b];
                cnt[b] = cnt[a];
                if (rank[a] == rank[b]) {
                    rank[a]++;
                }
            }
        }

        public int groupCount(int a) {
            return cnt[find(a)];
        }

        private boolean issame(int a, int b) {
            return find(a) == find(b);
        }
    }


    static class SuffixArray {
        int n;
        int k;
        char[] base;

        Integer[] sa;
        int[] rank;
        int[] tmp;
        int[] lcp;
        int[][] levelRank;

        int compareNode(int i, int j, int k) {
            if (rank[i] != rank[j]) {
                return rank[i] - rank[j];
            } else {
                int ri = i + k <= n ? rank[i+k] : -1;
                int rj = j + k <= n ? rank[j+k] : -1;
                return ri - rj;
            }
        }

        public SuffixArray(char[] x) {
            base = x;
            n = base.length;
            k = Integer.numberOfTrailingZeros(Integer.highestOneBit(n))+2;
        }

        void buildSA() {
            sa = new Integer[n+1];
            rank = new int[n+1];
            tmp = new int[n+1];
            levelRank = new int[k][];

            int ki = 0;
            for (int i = 0 ; i <= n ; i++) {
                sa[i] = i;
                rank[i] = (i < n) ? base[i] : -1;
            }
            levelRank[ki++] = rank.clone();
            for (int _k = 1 ; _k <= n ; _k *= 2) {
                final int k = _k;
                Arrays.sort(sa, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer i, Integer j) {
                        return compareNode(i, j, k);
                    }
                });
                tmp[sa[0]] = 0;
                for (int i = 1 ; i <= n ; i++) {
                    tmp[sa[i]] = tmp[sa[i-1]] + ((compareNode(sa[i-1], sa[i], k) < 0) ? 1 : 0);
                }
                for (int i = 0 ; i <= n ; i++) {
                    rank[i] = tmp[i];
                }
                levelRank[ki++] = rank.clone();
            }
        }

        void buildLCP() {
            for (int i = 0 ; i <= n ; i++) {
                rank[sa[i]] = i;
            }
            lcp = new int[n];
            int h = 0;
            for (int i = 0 ; i < n ; i++) {
                int j = sa[rank[i]-1];
                if (h > 0) {
                    h--;
                }
                for (; j + h < n && i + h < n ; h++) {
                    if (base[j+h] != base[i+h]) {
                        break;
                    }
                }
                lcp[rank[i]-1] = h;
            }
        }

        int countCommon(int i, int j) {
            if (i > j) {
                return countCommon(j, i);
            } else if (i == j) {
                return 0;
            }
            int cnt = 0;
            int li = i;
            int lj = j;
            int limit = Math.min(j - i, n - j);

            for (int ki = k-1 ; ki >= 0 ; ki--) {
                if (levelRank[ki] == null || limit < (1<<ki)) {
                    continue;
                }
                if (levelRank[ki][li] == levelRank[ki][lj]) {
                    cnt += 1<<ki;
                    li += 1<<ki;
                    lj += 1<<ki;
                }
            }
            return cnt;
        }
    }



    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int[] nextInts(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }


        private int[][] nextIntTable(int n, int m) {
            int[][] ret = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextInt();
                }
            }
            return ret;
        }

        private long[] nextLongs(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        private long[][] nextLongTable(int n, int m) {
            long[][] ret = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextLong();
                }
            }
            return ret;
        }

        private double[] nextDoubles(int n) {
            double[] ret = new double[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextDouble();
            }
            return ret;
        }

        private int next() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            if ('a' <= c && c <= 'z') {
                return (char) c;
            }
            if ('A' <= c && c <= 'Z') {
                return (char) c;
            }
            throw new InputMismatchException();
        }

        public String nextToken() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public long nextLong() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
