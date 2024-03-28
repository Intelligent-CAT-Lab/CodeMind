import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p02742 {
    static final int MOD = (int)1e9 + 7;
    static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        FastReader input = new FastReader();
        int H = input.nextInt();
        int W = input.nextInt();
        System.out.println((H != 1 && W != 1) ? (int)Math.ceil(H * W / 2.0) : 1);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}