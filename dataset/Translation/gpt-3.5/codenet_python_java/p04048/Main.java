import java.util.*;
import java.io.*;

public class p04048 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = INT();
        int X = INT();

        out.println((N - gcd(N, X)) * 3);

        out.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static int INT() throws IOException {
        return nextInt();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static long LONG() throws IOException {
        return nextLong();
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return br.readLine();
    }
}