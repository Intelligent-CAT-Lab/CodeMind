import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();

        System.out.println(n * (n-1) / 2);
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]18;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]19;None;reader.readLine();"+reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
System.out.println("[INST]23;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}