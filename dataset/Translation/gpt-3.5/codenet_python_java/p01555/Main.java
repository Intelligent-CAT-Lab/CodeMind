import java.util.Scanner;

public class p01555 {
    public static void main(String[] args) {
        int D = 20;
        long[] ds = new long[D];

        for (int i = 1; i < D; i++) {
            long fr = (long) Math.pow(10, i - 1) - 1;
            long to = (long) Math.pow(10, i) - 1;
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2)
                    + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }

        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        long left = 0;
        long right = (long) Math.pow(10, 18);
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (calc(mid, ds) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        long idx = calc(left, ds);
        long num = left + 1;
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
            num++;
        }
        System.out.println(ans.substring((int)(s - idx - 1), (int)(s - idx + 19)));
    }

    public static long calc(long m, long[] ds) {
        if (m == 0) {
            return 0;
        }
        int c = (int) Math.log10(m) + 1;
        long fr = (long) Math.pow(10, c - 1) - 1;
        long to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2)
                + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }
}