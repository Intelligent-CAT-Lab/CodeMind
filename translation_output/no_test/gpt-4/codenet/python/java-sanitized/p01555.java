import java.math.BigInteger;
import java.util.Scanner;

public class p01555 {

    private static final int D = 20;
    private static long[] ds = new long[D];

    public static void main(String[] args) {
        initializeDs();

        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        BigInteger left = BigInteger.ZERO;
        BigInteger right = new BigInteger("1000000000000000000");
        BigInteger two = BigInteger.valueOf(2);

        while (left.add(BigInteger.ONE).compareTo(right) < 0) {
            BigInteger mid = left.add(right).divide(two);
            if (calc(mid.longValue()) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }

        long idx = calc(left.longValue());
        long num = left.longValue() + 1;
        StringBuilder ans = new StringBuilder();
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans.append("FizzBuzz");
            } else if (num % 3 == 0) {
                ans.append("Fizz");
            } else if (num % 5 == 0) {
                ans.append("Buzz");
            } else {
                ans.append(num);
            }
            num += 1;
        }
        System.out.println(ans.substring((int)(s - idx - 1), (int)(s - idx + 19)));
    }

    private static void initializeDs() {
        for (int i = 1; i < D; i++) {
            long fr = (long)Math.pow(10, i - 1) - 1;
            long to = (long)Math.pow(10, i) - 1;
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }
    }

    private static long calc(long m) {
        if (m == 0) {
            return 0;
        }
        int c = (int)Math.log10(m) + 1;
        long fr = (long)Math.pow(10, c - 1) - 1;
        long to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }
}