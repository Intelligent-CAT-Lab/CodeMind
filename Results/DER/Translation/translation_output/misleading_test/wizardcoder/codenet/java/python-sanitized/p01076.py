import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class p01076 {
    private static class Task {

        void solve(FastScanner in, PrintWriter out) {
            long N = in.nextLong();
            long d = in.nextLong();

            if (d == 1) {
                out.println(N * (N - 1) / 2);
            } else if (d == 2) {
                out.println(N * (N - 1) / 2 - 1);
            } else {
                long m = N - d;
                long ans = m * (m - 1) / 2 + 2 * m + (d - 2);
                out.println(ans);
            }
        }
    }

    public static void main(String[] args) {
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufferLength <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return