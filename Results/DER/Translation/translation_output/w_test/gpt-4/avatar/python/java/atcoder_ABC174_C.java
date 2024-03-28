Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        int cnt = 0;
        int now = 0;

        if (K % 2 == 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < 1000000; i++) {
            cnt++;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                return;
            }
        }

        System.out.println(-1);
    }
}
```

This Java code performs the same operations as the original Python code. It calculates the minimum number of steps to get a number divisible by K, with only 7s as its digits. If it can't find such a number within 1,000,000 iterations, it outputs -1. Note that in Java, programs usually exit when the end of the `main` method is reached, so unlike Python, there's no need to call a separate exit function.
