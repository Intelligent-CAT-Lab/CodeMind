import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int ans = 0;
        for(int i=0; i<4; i++){
            int input = sc.nextInt();
            ans += input;
        }
        out.println(ans);
        out.flush();

    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
var newVariable_0 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_0) {
                try {
var newVariable_1 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_2 = tokenizer.nextToken();            return newVariable_2;
        }

        public String nextLine() {
var newVariable_3 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_3) {
                try {
var newVariable_4 = reader.readLine();                    return newVariable_4;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

var newVariable_5 = tokenizer.nextToken("\n");            return newVariable_5;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
