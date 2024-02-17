import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.function.Function;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWideFlip solver = new DWideFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWideFlip {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] S = in.next().toCharArray();
            int n = S.length;
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = Character.digit(S[i], 10);
            }

            int[] sum = new int[n + 1];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + s[i];
            }

            Function<Long, Boolean> cannotFlip = (kLong) -> {
                int k = (int) kLong.longValue();
                if (k <= 1) {
                    return false;
                }
                if (k > n) {
                    return true;
                }
                int leftMostUnreachable = n - k;
                int rightMostUnreachable = k - 1;
                if (rightMostUnreachable - leftMostUnreachable + 1 <= 0) {
                    return false;
                }
                int ones = sum[rightMostUnreachable + 1] - sum[leftMostUnreachable];
                int total = rightMostUnreachable - leftMostUnreachable + 1;
                if (ones == 0 || ones == total) {
                    return false;
                }
                return true;
            };

            long answer = BinarySearch.binarySearch(cannotFlip) - 1;

            out.println(answer);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }

    static class BinarySearch {
        public static long binarySearch(Function<Long, Boolean> bigEnough) {
            long tooSmall = 0, tooBig;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2) ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

