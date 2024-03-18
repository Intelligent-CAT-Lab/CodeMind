import java.io.*;
import java.util.*;

public class p02946 {
    static final long DVSR = 1000000007L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputTokens = br.readLine().split(" ");
        int K = Integer.parseInt(inputTokens[0]);
        int X = Integer.parseInt(inputTokens[1]);

        StringBuilder sb = new StringBuilder();
        for (int i = Math.max(X - K + 1, -1000000); i < Math.min(X + K, 1000000); i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    static long POW(long x, long y) {
        return pow(x, y, DVSR);
    }

    static long INV(long x) {
        return pow(x, DVSR - 2, DVSR);
    }

    static long DIV(long x, long y) {
        return (x * INV(y)) % DVSR;
    }

    static List<Integer> LI(String input) {
        return Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    static List<Float> LF(String input) {
        return Arrays.stream(input.split(" ")).map(Float::parseFloat).collect(Collectors.toList());
    }

    static List<String> LS(String input) {
        return Arrays.asList(input.split(" "));
    }

    static int II(String input) {
        return Integer.parseInt(input);
    }

    static List<Integer> FLIST(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= n; i++) res.add((int)((res.get(i - 1) * (long)i) % DVSR));
        return res;
    }

    static long gcd(long x, long y) {
        if (x < y) { long temp = x; x = y; y = temp; }
        long div = x % y;
        while (div != 0) {
            x = y;
            y = div;
            div = x % y;
        }
        return y;
    }

    static long pow(long base, long exponent, long modulus) {
        long result = 1;
        base = base % modulus;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            exponent = exponent >> 1;
            base = (base * base) % modulus;
        }
        return result;
    }
}