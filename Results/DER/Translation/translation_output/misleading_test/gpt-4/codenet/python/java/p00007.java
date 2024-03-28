Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
       
        double ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int)ans);
    }
}
```

This code will work similarly to the Python script you provided. It takes an integer input, multiplies the amount by 1.05 (5% interest) for the given number of periods, rounds up to the nearest thousand if it does not end in a thousand, and then outputs the final amount as an integer.
