To translate the provided Python code to Java, we need to follow the correct Java syntax and use appropriate data structures since Java doesn't have a built-in `Counter` class like Python does. We can use a `HashMap` to achieve similar functionality.

Here's the Java translation enclosed inside ```java```:

```java
import java.util.HashMap;
import java.util.Scanner;

public class FactorCount {
    private static final long MOD = 1000000007L; // 10^9 + 7

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> count = new HashMap<>();
        long ans = 1;
        int[] num = new int[N];
        int idx = 0;

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int n : num) {
                if (n != 0 && i % n == 0) {
                    isPrime = false;
                    while (i % n == 0) {
                        count.put(n, count.getOrDefault(n, 0) + 1);
                        i /= n;
                    }
                    if (i == 1) {
                        break;
                    }
                }
            }
            if (isPrime) {
                num[idx++] = i;
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = ans * (n + 1) % MOD;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

You should input the value directly when prompted, as `Scanner` objects read input from the user in a console in Java. The code snippet I provided here assumes you'll be running the program interactively. To test it, you can paste the code into a Java file, compile it, and then run it, providing the test input (3 in the provided test case).
