Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] cnt = new int[101];
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            int num = i;
            for (int j = 2; j <= n; j++) {
                while (num % j == 0) {
                    num /= j;
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

        int result = shitigo + nijugo * (san - 1) + jugo * (go - 1) + go * (go - 1) / 2 * (san - 2);
        System.out.println(result);
    }
}
```

This code should be compiled and run in Java, and given an input of 9, it will provide the expected output of 0.
