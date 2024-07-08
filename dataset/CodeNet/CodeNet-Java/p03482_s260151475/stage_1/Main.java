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
var newVariable_0 = Character.digit(S[i], 10);                s[i] = newVariable_0;
            }

            int[] sum = new int[n + 1];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + s[i];
            }

            Function<Long, Boolean> cannotFlip = (kLong) -> {
var newVariable_1 = kLong.longValue();                int k = (int) newVariable_1;
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
var newVariable_2 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_2) {
                try {
var newVariable_3 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_3);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_4 = tokenizer.nextToken();            return newVariable_4;
        }

    }

    static class BinarySearch {
        public static long binarySearch(Function<Long, Boolean> bigEnough) {
            long tooSmall = 0, tooBig;
var newVariable_5 = bigEnough.apply(tooSmall);            if (newVariable_5) {
                return tooSmall;
            }

var newVariable_6 = bigEnough.apply(tooBig);            for (tooBig = 1; !newVariable_6; tooBig *= 2) ;

var newVariable_7 = bigEnough.apply(tooBig - 1);            if (!newVariable_7) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
var newVariable_8 = bigEnough.apply(center);                if (!newVariable_8) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

