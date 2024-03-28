import java.util.*;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.TransformType;
import org.apache.commons.math3.transform.FastFourierTransformer;

public class p02826 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long MOD = Long.parseLong(input[1]);
        long answer = calculateAnswer(N, MOD);
        System.out.println(answer);
        scanner.close();
    }

    public static long calculateAnswer(int N, long MOD) {
        ArrayList<Long> f = new ArrayList<>(Collections.nCopies(N+N+10, 0L));
        long[] inv = new long[100000];
        for (int i = 1; i < 100000; i++) {
            inv[i] = (factorial(i-1, MOD) * modInverse(factorial(i, MOD), MOD)) % MOD;
        }

        for (int x = 1; x <= N/2; x++) {
            for (int j = x; j < f.size(); j += x) {
                f.set(j, (f.get(j) + 2 * inv[(f.size()-1) / x])) % MOD;
            }
        }

        if (N % 2 != 0) {
            int x = (N+1) / 2;
            for (int j = x; j < f.size(); j += x) {
                f.set(j, (f.get(j) + inv[(f.size()-1) / x]) % MOD);
            }
        }

        Double[] fArray = f.stream().map(Long::doubleValue).toArray(Double[]::new);
        PolynomialFunction g = fps_exp(fArray, MOD);
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum = (sum + (long) g.value(i)) % MOD;
        }
        return sum;
    }

    public static PolynomialFunction fps_exp(Double[] h, long MOD) {
        int L = h.length;
        int i = Integer.highestOneBit(L-1);
        int N = 1 << i;
        Double[] hResized = Arrays.copyOf(h, N);
        Double[] dh = new Double[N];

        for (int j = 0; j < N-1; j++) {
            dh[j] = hResized[j+1] * (double)(j+1) % MOD;
        }

        Double[] f = new Double[N];
        Double[] g = new Double[N];
        Arrays.fill(g, 0.0);
        f[0] =