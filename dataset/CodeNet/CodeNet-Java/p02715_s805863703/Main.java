import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);


    public static void main(String[] args) {
        int N = in.nextInt();
        int K = in.nextInt();

        long ans = 0;
        long[] num = new long[K + 1];
        for (int x = K; x > 0; x--) {
            int kx = K / x;
            num[x] += mpow(kx, N);
            for (int j = 2*x; j <= K; j += x)
                num[x] -= num[j];
            num[x] %= MOD;
            ans += x * num[x];
            ans %= MOD;
        }
        ans += MOD;
        ans %= MOD;
        out.println(ans);

        out.flush();
    }

    static final int MOD = 1_000_000_007;
    static long mpow(long a, long b) {
        if (b == 0) return 1;
        long ret = mpow(a, b >> 1);
        ret = (ret * ret) % MOD;
        if (b % 2 == 1)
            ret = (a * ret) % MOD;
        return ret;
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

