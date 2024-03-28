import java.util.ArrayList;
import java.util.List;

public class p01555 {
    public static void main(String[] args) {
        int D = 20;
        List<Integer> ds = new ArrayList<>(D);
        for (int i = 0; i < D; i++) {
            ds.add(0);
        }
        double fr = Math.pow(10, D - 1) - 1;
        double to = Math.pow(10, D) - 1;
        ds.set(0, 0);
        for (int i = 1; i < D; i++) {
            fr = Math.pow(10, i - 1) - 1;
            to = Math.pow(10, i) - 1;
            ds.set(i, ds.get(i - 1) + (4 - i) * ((int) (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * ((int) (to / 15 - fr / 15)) + i * ((int) (to - fr)));
        }
        String s = "1";
        long left = 0;
        long right = (long) Math.pow(10, 18);
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (ds.get(calc(mid)) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int idx = calc(left);
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
        System.out.println(ans.substring(s - idx - 1, s - idx + 19));
    }

    private static int calc(long m) {
        int c = (int) Math.log10(m) + 1;
        long fr = (long) Math.pow(10, c - 1) - 1;
        long to = m;
        return ds.get(c - 1) + (4 - c) * ((int) ((to / 3) + (to / 5) - ((to / 15) * 2) - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * ((int) ((to / 15) - fr / 15)) + c * ((int) (to - fr)));
    }
}