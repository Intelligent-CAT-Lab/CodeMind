import java.io.*;
import java.util.*;

public class p02977 {
    static StreamTokenizer in;
    static PrintWriter out;

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    static String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    public static void main(String[] args) throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);

        int n = nextInt();
        List<int[]> edges = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n!= p) {
            // make line graph
            int m = n;
            while (m % 4!= 3) {
                m--;
            }
            for (int i = 1; i < m; i++) {
                edges.add(new int[]{i, i + 1});
                edges.add(new int[]{n + i, n + i + 1});
            }
            edges.add(new int[]{m, n + 1});
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m--;
                }
                edges.add(new int[]{m - 1, m});
                edges.add(new int[]{m, n + 1});
                edges.add(new int[]{n + 1, n + m - 1});
                edges.add(new int[]{n + m - 1, n + m});
            }
            if (n % 4 == 0 || n % 4 == 2) {    // not a power of 2
                int t = n - 1;
                edges.add(new int[]{n, t});
                for (int i = 1; i <= n; i++) {
                    t ^= i;
                    if (t == n) {
                        edges.add(new int[]{n + i, n + n});
                        break;
                    }
                }
            }
        }

        if (edges.isEmpty()) {
            out.println("No");
        } else {
            out.println("Yes");
            for (int[] edge : edges) {
                out.println(edge[0] + " " + edge[1]);
            }
        }

        out.flush();
    }
}