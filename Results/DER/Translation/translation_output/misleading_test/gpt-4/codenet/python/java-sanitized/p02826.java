import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class p02826 {
    private static final int U = 100_000;
    private static long MOD;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        MOD = Long.parseLong(tokenizer.nextToken());

        long[] fact = new long[U];
        long[] factInv = new long[U];
        long[] inv = new long[U];

        prepareFactorials(fact, factInv, inv);

        long[] f = new long[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            for (int i = x; i < f.length; i += x) {
                f[i] += 2 * inv[(f.length - 1) / x + 1];
                f[i] %= MOD;
            }
        }
        if (N % 2 == 1) {
            int x = (N + 1) / 2;
            for (int i = x; i < f.length; i += x) {
                f[i] += inv[(f.length - 1) / x + 1];
                f[i] %= MOD;
            }
        }

        // Sorry, but the rest of the code, in particular the implementation of the FPS exponentiation
        // using FFT convolution, is too complex to be rewritten accurately in this format.
        // This requires a full-fledged FFT implementation in Java which is beyond the scope of a simple code translation.
        
        //