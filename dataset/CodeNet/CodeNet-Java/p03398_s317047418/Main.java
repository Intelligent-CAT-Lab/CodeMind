import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    final int mod = (int) 1e9 + 7;

    int add(int x, int y) {
        x += y;
        if (x >= mod) {
            x -= mod;
        }
        return x;
    }

    int mul(int x, int y) {
        return (int) (x * 1L * y % mod);
    }


    class Node implements Comparable<Node> {
        int h, mul;

        public Node(int h, int mul) {
            this.h = h;
            this.mul = mul;
        }

        @Override
        public int compareTo(Node node) {
            if (h != node.h) {
                return Integer.compare(h, node.h);
            }
            return Integer.compare(mul, node.mul);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return h == node.h &&
                    mul == node.mul;
        }

        @Override
        public int hashCode() {
            return Objects.hash(h, mul);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "h=" + h +
                    ", mul=" + mul +
                    '}';
        }
    }

    class State {
        Node[] nodes;

        State(Node[] nodes) {
            this.nodes = nodes;
            Arrays.sort(this.nodes);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return Arrays.equals(nodes, state.nodes);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(nodes);
        }

        @Override
        public String toString() {
            return "State{" +
                    "nodes=" + Arrays.toString(nodes) +
                    '}';
        }
    }

    void solve() {
        int n = in.nextInt();
        int[][] c = new int[n + 1][n + 1];
        c[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            c[i][0] = 1;
            for (int j = 1; j <= n; j++) {
                c[i][j] = add(c[i - 1][j - 1], c[i - 1][j]);
            }
        }
        int[][][] dp = new int[n + 1][n + 1][n + 1];
        dp[1][1][0] = 1;
        int res = 0;
        for (int total = 1; total <= n; total++) {
            for (int plus = 0; plus <= total; plus++) {
                for (int minus = 0; minus + plus <= total; minus++) {
                    int cur = dp[total][plus][minus];
                    if (cur == 0) {
                        continue;
                    }
                    for (int nextPlus = 0; nextPlus + total <= n; nextPlus++) {
                        for (int nextMinus = 0; nextMinus + nextPlus + total <= n; nextMinus++) {
                            int morePlus = nextPlus - Math.min(nextMinus, nextPlus);
                            int moreMinus = nextMinus - Math.min(nextMinus, nextPlus);
                            if (plus < morePlus || minus < moreMinus) {
                                continue;
                            }
                            int goPlus = plus - morePlus + moreMinus;
                            int goMinus = minus - moreMinus + morePlus;
                            int mult = mul(c[goMinus + goPlus][goPlus], c[total][goPlus + goMinus]);
                            mult = mul(mult, cur);
                            if (total == n) {
                                res = add(res, mult);
                            }
                            if (nextPlus > 0 || nextMinus > 0) {
                                int nextTotal = total + nextPlus + nextMinus;
                                dp[nextTotal][nextPlus][nextMinus] = add(dp[nextTotal][nextPlus][nextMinus], mult);
                            }
                        }
                    }
                }
            }
        }
        out.println(res);
    }

    void solve123() {
        HashSet<State> hs = new HashSet<>();
        State first = new State(new Node[]{new Node(0, 1)});
        hs.add(first);
        int n = in.nextInt();
        for (int curn = 2; curn <= n; curn++) {
            HashSet<State> nextHS = new HashSet<>();
            for (State s : hs) {
                for (int i = 0; i < s.nodes.length; i++) {
                    if (i == 0 || s.nodes[i].compareTo(s.nodes[i - 1]) != 0) {
                        Node[] next = Arrays.copyOf(s.nodes, s.nodes.length + 1);
                        Node split = next[i];
                        next[next.length - 1] = new Node(split.h, split.mul * -1);
                        next[i] = new Node(split.h + 1, split.mul);
                        nextHS.add(new State(next));
                    }
                }
            }
            hs = nextHS;
            System.err.println(curn + "->" + hs.size());
//            System.err.println(hs);
        }
        int res = 0;
        int[][] c = new int[n + 1][n + 1];
        c[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            c[i][0] = 1;
            for (int j = 1; j <= n; j++) {
                c[i][j] = add(c[i - 1][j - 1], c[i - 1][j]);
            }
        }
        for (State s : hs) {
            int cur = 1;
            int more = n;
            for (int i = 0; i < s.nodes.length; ) {
                int j = i;
                while (j != s.nodes.length && s.nodes[i].compareTo(s.nodes[j]) == 0) {
                    j++;
                }
//                System.err.println("size = " + (j - i));
                cur = mul(cur, c[more][j - i]);
                more -= (j - i);
                i = j;
            }
            res = add(res, cur);
//            System.err.println("!" + res);
        }
        out.println(res);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}