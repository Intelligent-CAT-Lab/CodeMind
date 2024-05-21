import java.util.*;
import java.lang.*;

public class p01555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.println(calc(s));
    }

    public static long calc(int m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) Math.log10(m) + 1;
        long fr = (long) Math.pow(10, c - 1) - 1;
        long to = m;
        return ds(c - 1) + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }

    public static long ds(int i) {
        long[] ds = new long[20];
        for (int j = 1; j < 20; j++) {
            long fr = (long) Math.pow(10, j - 1) - 1;
            long to = (long) Math.pow(10, j) - 1;
            ds[j] = ds[j - 1] + (4 - j) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - j) * (to / 15 - fr / 15) + j * (to - fr);
        }
        return ds[i];
    }

    public static String calc2(int s, long idx) {
        long left = 0;
        long right = 1000000000000000000L;
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (calc(mid) <= s -