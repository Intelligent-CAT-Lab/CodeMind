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
var newVariable_0 = tokenizer.hasMoreTokens();                while (tokenizer == null || !newVariable_0) {
var newVariable_1 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_1);
                }
            } catch (IOException ignored) {
            }
var newVariable_2 = tokenizer.nextToken();            return newVariable_2;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}