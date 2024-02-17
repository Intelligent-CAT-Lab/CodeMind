import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int sum = 0, total = 0, i = 1;
        if (n == 2) {
            System.out.println(1);
            return;
        }
        while (n > 0) {
            n -= 1;
            if (n > 0) {
                if (n >= 2) {
                    total++;
                }
                n -= 2;
            }
            total++;
        }
        System.out.println(total);
    }

    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(" ");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}