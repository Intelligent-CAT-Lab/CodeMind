<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
count = 0

for i in range(K + 1, N + 1):
    count += ((N + 1) // i) * (i - K) + max(0, (N + 1) % i - K)

if K == 0:
    count -= len(range(K + 1, N + 1))

print (count)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long count = 0;

        for (int i = K + 1; i <= N; i++) {
            count += ((N + 1) / i) * (i - K);
            count += Math.max(0, (N + 1) % i - K);
        }

        if (K == 0) {
            count -= N - K;
        }

        System.out.println(count);
    }
}
```

Please note that in Java, the `//` operator performs integer division, which means it rounds down to the nearest whole number. This is different from Python's `//` operator, which performs floor division. Therefore, the code in the Java version is slightly different from the Python version.<｜end▁of▁sentence｜>
