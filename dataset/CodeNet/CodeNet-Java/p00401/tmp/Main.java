

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int input = sc.nextInt();
        int ans = 1;
        while(input >= ans*2){
            ans *= 2;
        }
        out.println(ans);
        out.flush();
System.out.println("[INST]16;None;out.flush();"+out.flush());

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
System.out.println("[INST]30;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]32;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]37;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]41;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    return reader.readLine();
System.out.println("[INST]43;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
System.out.println("[INST]49;None;tokenizer.nextToken('\n');"+tokenizer.nextToken("\n"));
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
