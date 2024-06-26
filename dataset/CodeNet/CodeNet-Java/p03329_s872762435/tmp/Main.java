import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    private static final int INF = (int)1e9 + 7;

    int N;
    ArrayList<Integer> numbers;
    int[] dp;

    private void solve() {
        N = nextInt();

        numbers = new ArrayList<>();
        numbers.add(1);
System.out.println("[INST]17;None;numbers.add(1);"+numbers.add(1));
        for(int i = 1;i < 10;i++) {
            int six = 1;
            int nine = 1;
            for(int j = 0;j < i;j++) {
                six *= 6;
                nine *= 9;
            }

            numbers.add(six);
System.out.println("[INST]26;None;numbers.add(six);"+numbers.add(six));
            numbers.add(nine);
System.out.println("[INST]27;None;numbers.add(nine);"+numbers.add(nine));
        }
        dp = new int[N + 1];
        Arrays.fill(dp, N);
System.out.println("[INST]30;None;Arrays.fill(dp, N);"+Arrays.fill(dp, N));
        dp[N] = 0;
        for(int i = N;i >= 0;i--) {
            for(int n : numbers) {
                if (i >= n) {
                    dp[i - n] = Math.min(dp[i - n], dp[i] + 1);
System.out.println("[INST]35;None;Math.min(dp[i - n], dp[i] + 1);"+Math.min(dp[i - n], dp[i] + 1));
                }
            }
        }
        out.println(dp[0]);
    }

    public static void main(String[] args) {
        out.flush();
System.out.println("[INST]43;None;out.flush();"+out.flush());
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
System.out.println("[INST]60;buflen;in.read(buffer);"+buflen);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
System.out.println("[INST]94;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
        }
        return sb.toString();
System.out.println("[INST]96;None;sb.toString();"+sb.toString());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
