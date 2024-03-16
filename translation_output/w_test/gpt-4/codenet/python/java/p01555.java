Below is the translated Java code enclosed within ```java```:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class FizzBuzzCalc {

    private static final int D = 20;
    private static long[] ds = new long[D];

    static {
        for (int i = 1; i < D; i++) {
            long fr = (long) Math.pow(10, i - 1) - 1;
            long to = (long) Math.pow(10, i) - 1;
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }
    }

    private static long calc(long m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) (Math.log10(m) + 1);
        long fr = (long) Math.pow(10, c - 1) - 1;
        long to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
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
        sc.close();
    }
}
```

Here's how you can run the above program:

1. Save the code to a file named 'FizzBuzzCalc.java'.
2. Compile the Java code using a command `javac FizzBuzzCalc.java`.
3. Run the compiled code with command `java FizzBuzzCalc`.

When prompted, enter the input '1' to test the case similar to the one mentioned in the question.
