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
System.out.println("[INST]14;None;out.flush();"+out.flush());

    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]28;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]30;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]35;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]39;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    return reader.readLine();
System.out.println("[INST]41;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
System.out.println("[INST]47;None;tokenizer.nextToken('\n');"+tokenizer.nextToken("\n"));
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
