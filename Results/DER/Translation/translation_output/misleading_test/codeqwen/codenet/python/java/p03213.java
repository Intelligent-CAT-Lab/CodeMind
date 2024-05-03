Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cnt = new int[101];
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                while (i % j == 0) {
                    i /= j;
                    cnt[j] += 1;
                }
            }
        }
        int san = 0, go = 0, jugo = 0, nijugo = 0, shitigo = 0;
        for (int i = 2; i < 101; i++) {
            if (cnt[i] >= 3) san += 1;
            if (cnt[i] >= 5) go += 1;
            if (cnt[i] >= 15) jugo += 1;
            if (cnt[i] >= 25) nijugo += 1;
            if (cnt[i] >= 75) shitigo += 1;
        }
        System.out.println(shitigo + nijugo * (san - 1) + jugo * (go - 1) + go * (go - 1) / 2 * (san - 2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the count of each prime factor, and then calculates the number of ways to choose 3, 5, 15, 25, and 75 prime factors. The result is then printed to the console.
