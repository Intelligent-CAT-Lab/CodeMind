Here's the provided Python code translated into Java:

```java
import java.util.Scanner;

public class FactorCombinationCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close(); // Closing the scanner as we don't need it anymore.

        int[] cnt = new int[101];
        for (int i=0; i < cnt.length; i++) cnt[i] = 1;

        for (int i = 2; i <= n; i++) {
            int number = i;
            for (int j = 2; j <= n; j++) {
                while (number % j == 0) {
                    number /= j;
                    cnt[j]++;
                }
            }
        }

        int san = 0, go = 0, jugo = 0, nijugo = 0, shitigo = 0;
        for (int i = 2; i < 101; i++) {
            if (cnt[i] >= 3) san++;
            if (cnt[i] >= 5) go++;
            if (cnt[i] >= 15) jugo++;
            if (cnt[i] >= 25) nijugo++;
            if (cnt[i] >= 75) shitigo++;
        }

        int result = shitigo + (nijugo * (san - 1)) + (jugo * (go - 1)) + ((go * (go - 1)) / 2 * (san - 2));
        System.out.println(result);
    }
}
```

You can compile and run this Java code to obtain the output for the provided test cases. Do note that in Java, array initialization and iteration are slightly different, as well as the division operation. We use a Scanner to accept user input, which is the Java equivalent of Python's `input()` function. Remember to close the scanner afterwards to prevent resource leaks.
