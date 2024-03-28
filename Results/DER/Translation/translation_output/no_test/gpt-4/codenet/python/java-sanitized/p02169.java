import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p02169 {
    static final int MOD = 998244353;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    static long[] readLongs() throws IOException {
        String[] strings = reader.readLine().split(" ");
        long[] longs = new long[strings.length];
        for (int i = 0; i < longs.length; i++)
            longs[i] = Long.parseLong(strings[i]);
        return longs;
    }
    
    static long readLong() throws IOException {
        return Long.parseLong(reader.readLine());
    }
    
    public static void main(String[] args) throws IOException {
        solve();
        writer.flush();
    }
    
    static void solve() throws IOException {
        long[] input = readLongs();
        long m = input[0], n = input[1], k = input[2];
        if (n < k) {
            writer.write("0\n");
            return;
        }
        if (m < k) {
            writer.write("0\n");
            return;
        }

        BigInteger ans = BigInteger.valueOf(m).modPow(BigInteger.valueOf(n), BigInteger.valueOf(MOD));
        BigInteger[] p = new BigInteger[(int) k + 1];
        for (int i = 0; i <= k; i++)
            p[i] = BigInteger.valueOf(i).modPow(BigInteger.valueOf(n), BigInteger.valueOf(MOD));

        BigInteger c = BigInteger.valueOf(m);
        BigInteger[][] comb = new BigInteger[(int) k + 1][(int) k + 1];
        for (int i = 0; i <= k; i++)
            Arrays.fill(comb[i], BigInteger.ZERO);
        comb[0][0] = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i + 1][j] = comb[i + 1][j].add(comb[i][j]).mod(BigInteger.valueOf(MOD));
                comb[i + 1][j + 1] = comb[i + 1][j + 1].add(comb[i][j]).mod(BigInteger.valueOf(MOD));
            }
        }

        for (int i = 1; i < k; i++) {
            BigInteger kValue = BigInteger.ZERO;
            for (int j = i; j >= 1; j--) {
                BigInteger combValue = comb[i][j].multiply(p[j]).mod(BigInteger.valueOf(MOD));
                if ((i+j) % 2 == 1)
                    kValue = kValue.subtract(combValue).mod(BigInteger.valueOf(MOD));
                else
                    kValue = kValue.add(combValue).mod(BigInteger.valueOf(MOD));
            }
            kValue = kValue.multiply(c).mod(BigInteger.valueOf(MOD));
            c = c.multiply(BigInteger.valueOf(m-i)).mod(BigInteger.valueOf(MOD));
            c = c.multiply(BigInteger.valueOf(i+1).modInverse(BigInteger.valueOf(MOD))).mod(BigInteger.valueOf(MOD));
            ans = ans.subtract(kValue).mod(BigInteger.valueOf(MOD));
        }
        writer.write(ans.toString() + "\n");
    }
}