import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03549 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int N = nextInt();
        int M = nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (1 << M));
    }

    static int nextInt() throws Exception {
        return Integer.parseInt(next());
    }

    static String next() throws Exception {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
}