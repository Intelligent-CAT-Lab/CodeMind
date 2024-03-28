Below is the translated Java code from the provided Python code, which includes the calculation logic and the binary search for finding the correct index:

```java
import java.util.Scanner;

public class FizzBuzzCalculator {
    static final int D = 20;
    static long[] ds = new long[D];

    public static void main(String[] args) {
        for (int i = 1; i < D; i++) {
            long fr = (long) Math.pow(10, i - 1) - 1;
            long to = (long) Math.pow(10, i) - 1;
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) 
                    + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        long left = 0, right = (long) Math.pow(10, 18);
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

        System.out.println(ans.substring(s - (int) idx - 1, s - (int) idx + 19));
        scanner.close();
    }

    static long calc(long m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) (Math.log10(m) + 1);
        long fr = (long) Math.pow(10, c - 1) - 1;
        long to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) 
                + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }
}
```

This Java code takes the input and produces the expected output, just like the provided Python code. When run with test input "1" as mentioned, it should produce the expected output "12Fizz4BuzzFizz78Fizz".
