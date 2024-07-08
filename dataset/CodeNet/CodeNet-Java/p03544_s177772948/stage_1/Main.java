
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        int N = in.nextInt();
        BigInteger a = new BigInteger("2");
        BigInteger b = BigInteger.ONE;
        BigInteger temp;
        if (N == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= N; i++) {
                temp = b;
                b = a.add(b);
                a = temp;
            }
            System.out.println(b.toString());
        }
   }


    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
var newVariable_0 = st.hasMoreTokens();            while (st == null || !newVariable_0) {
                try {
var newVariable_1 = br.readLine();                    st = new StringTokenizer(newVariable_1);
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}