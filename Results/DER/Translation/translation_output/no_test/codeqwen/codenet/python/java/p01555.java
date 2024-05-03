Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    static int D = 20;
    static int[] ds = new int[D];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        long left = 0;
        long right = (long) Math.pow(10, 18);
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (calc(mid) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        long idx = calc(left);
        long num = left + 1;
        String ans = "";
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += Long.toString(num);
            }
            num += 1;
        }
        System.out.println(ans.substring(s - idx - 1, s - idx + 19));
    }

    static long calc(long m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) Math.log10(m) + 1;
        long fr = (long) Math.pow(10, c - 1) - 1;
        long to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c
